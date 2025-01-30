package steps;

import com.codeborne.selenide.Selenide;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.Step;
import models.AddListOfBooksModel.CollectionOfIsbnsItem;
import models.AddListOfBooksModel.AddListOfBooksResponse;
import pages.ProfilePage;
import tests.BaseTest;
import java.util.Collections;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.open;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class AddAndDeleteBookSteps extends BaseTest {

    ProfilePage profilePage = new ProfilePage();

    @Step("Добавить книгу через API")
    // Создание json еще доработается
    public void addBookWithApi() throws Exception {
        CollectionOfIsbnsItem collectionOfIsbnsItem = new CollectionOfIsbnsItem("9781449325862");
        AddListOfBooksResponse addListOfBooksResponse = new AddListOfBooksResponse("4e09fb4f-bbf0-4471-bf9d-81cc9996dd40", Collections.singletonList(collectionOfIsbnsItem));

        String jsonBody = new ObjectMapper().writeValueAsString(addListOfBooksResponse);

        given()
                .header("authorization", "Basic VHRlc3Q6IUFhMTIzNDU2Nzg=")
                .contentType(JSON)
                .body(jsonBody)
                .post("/BookStore/v1/Books")
                .then()
                .statusCode(201);
    }


    @Step("Удалить книгу через UI")
    public void deleteBookWithUI() {

        open("/profile");
        profilePage.deleteBookButton().click();
        profilePage.confirmDeleteButton().click();
        Selenide.confirm();
        profilePage.messageAboutEmptyTable().shouldBe(enabled);
}

}

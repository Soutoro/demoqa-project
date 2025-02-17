package steps;

import com.codeborne.selenide.Selenide;
import configs.PagePath;
import io.qameta.allure.Step;
import pages.ProfilePage;
import schemas.AddBookSchema;
import tests.BaseTest;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.open;
import static io.restassured.RestAssured.given;

public class AddAndDeleteBookSteps extends BaseTest {

    ProfilePage profilePage = new ProfilePage();

    @Step("Добавить книгу через API")
    public void addBookWithApi() {

        AddBookSchema addBookSchema = new AddBookSchema();

        given()
                .header("authorization", "Basic VHRlc3Q6IUFhMTIzNDU2Nzg=")
                .body(addBookSchema.addBookBody())
                .post("/BookStore/v1/Books")
                .then()
                .statusCode(201);
    }


    @Step("Удалить книгу через UI")
    public void deleteBookWithUI() {

        open(PagePath.PROFILE);
        profilePage.deleteBookButton().click();
        profilePage.confirmDeleteButton().click();
        Selenide.confirm();
        profilePage.messageAboutEmptyTable().shouldBe(enabled);
}

}

package steps;

import io.qameta.allure.Step;
import tests.BaseTest;

import java.util.List;

import static io.restassured.RestAssured.given;

public class AddAndDeleteBookHelperSteps extends BaseTest {

    @Step("Вспомогательный шаг - получить список книг")
    public List<String> getBooksIsbn() {

        return  given()
                .get("/BookStore/v1/Books")
                .then()
                .extract()
                .path("books.isbn");
    }

}

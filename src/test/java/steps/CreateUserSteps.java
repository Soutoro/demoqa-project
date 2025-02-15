package steps;

import io.qameta.allure.Step;
import schemas.CreateUserSchema;
import tests.BaseTest;

import static io.restassured.RestAssured.given;

public class CreateUserSteps extends BaseTest {

    CreateUserSchema createUserSchema = new CreateUserSchema();

    @Step("Создать пользователя")
    public void createUser() {

        given()
                .body(createUserSchema.createUserBody())
                .post("/Account/v1/User")
                .then()
                .statusCode(201);
    }

}

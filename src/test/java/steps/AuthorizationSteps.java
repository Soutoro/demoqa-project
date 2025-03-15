package steps;

import io.qameta.allure.Step;
import models.AuthorizedBodyModel;
import org.openqa.selenium.Cookie;
import tests.BaseTest;

import static authorization.Authorization.getExpires;
import static authorization.Authorization.getToken;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static io.restassured.RestAssured.given;

public class AuthorizationSteps extends BaseTest {

    AuthorizedBodyModel loginBody = new AuthorizedBodyModel(config.getLogin(), config.getPassword());

    @Step("Авторизоваться через API")
    public void authorizationWithApi() {

                given()
                .body(loginBody)
                .post("/Account/v1/Login")
                .then()
                .statusCode(200)
                .extract().response();

    }

    @Step("Авторизоваться через UI")
    public void openPageWithCookie() {

        open("/favicon.ico");
        getWebDriver().manage().addCookie(new Cookie("userID", config.getUserID()));
        getWebDriver().manage().addCookie(new Cookie("expires", getExpires()));
        getWebDriver().manage().addCookie(new Cookie("token", getToken()));

    }

}

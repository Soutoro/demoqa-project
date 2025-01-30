package steps;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import models.AuthorizedBodyModel;
import models.SessionData;
import org.openqa.selenium.Cookie;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static io.restassured.RestAssured.given;

public class AuthorizationSteps extends BaseTest {

    SessionData sessionData = new SessionData();
    AuthorizedBodyModel loginBody = new AuthorizedBodyModel(config.getLogin(), config.getPassword());

    @Step("Авторизоваться через API")
    public void authorizationWithApi() {

        Response authResponse =
                given()
                .body(loginBody)
                .post("/Account/v1/Login")
                .then()
                .statusCode(200)
                .extract().response();

        sessionData.setUserID(authResponse.path("userId"));
        sessionData.setExpires(authResponse.path("expires"));
        sessionData.setToken(authResponse.path("token"));

    }

    @Step("Авторизоваться через UI")
    public void openPageWithCookie() {

        open("/favicon.ico");
        getWebDriver().manage().addCookie(new Cookie("userID", sessionData.getUserID()));
        getWebDriver().manage().addCookie(new Cookie("expires", sessionData.getExpires()));
        getWebDriver().manage().addCookie(new Cookie("token", sessionData.getToken()));

    }

}

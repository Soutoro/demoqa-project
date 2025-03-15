package authorization;

import models.AuthorizedBodyModel;

import static io.restassured.RestAssured.given;
import static tests.BaseTest.config;

public class Authorization {

    private static String expires;
    private static String token;

    public static String getExpires() {
        if (expires == null) {
            expires = getSessionParam("expires");
        }
        return expires;
    }

    public static String getToken() {
        if (token == null) {
            token = getSessionParam("token");
        }
        return token;
    }

    private static String getSessionParam(String paramName) {

        AuthorizedBodyModel loginBody = new AuthorizedBodyModel(config.getLogin(), config.getPassword());

                return given()
                .body(loginBody)
                .post("/Account/v1/Login")
                .then()
                .statusCode(200)
                .extract().path(paramName);
    }

}

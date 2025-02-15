package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.AddAndDeleteBookSteps;
import steps.AuthorizationSteps;

public class BookProfileTests extends BaseTest{

    AddAndDeleteBookSteps addAndDeleteBookSteps = new AddAndDeleteBookSteps();
    AuthorizationSteps authorizationSteps = new AuthorizationSteps();

    @Test
    @DisplayName("Добавление книги в пустую таблицу через api и удаление через ui")
    public void addBookWithApiAndDeleteWithUi() {

        authorizationSteps.authorizationWithApi();
        addAndDeleteBookSteps.addBookWithApi();
        authorizationSteps.openPageWithCookie();
        addAndDeleteBookSteps.deleteBookWithUI();

    }
}

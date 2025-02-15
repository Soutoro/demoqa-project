package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.CreateUserSteps;
import steps.DeleteUserSteps;

public class CommonTests extends BaseTest{

    CreateUserSteps createUserSteps = new CreateUserSteps();
    DeleteUserSteps deleteUserSteps = new DeleteUserSteps();

    @Test
    @DisplayName("Создание пользователя и удаление пользователя")
    public void createUserTest() {

        createUserSteps.createUser();

    }

    @Test
    @DisplayName("Удаление ранее созданного пользователя через UI")
    public void deleteUserWithUITest() {

        deleteUserSteps.authorizedAndDeleteUser();

    }
}

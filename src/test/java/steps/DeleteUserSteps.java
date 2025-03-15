package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import configs.PagePath;
import io.qameta.allure.Step;
import pages.LoginPage;
import pages.ProfilePage;
import testdata.NewUserData;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.open;

public class DeleteUserSteps extends BaseTest {

    NewUserData newUserData = new NewUserData();
    LoginPage loginPage = new LoginPage();
    ProfilePage profilePage = new ProfilePage();

    @Step("Авторизоваться через UI и удалить пользователя")
    public void authorizedAndDeleteUser() {

        Selenide.clearBrowserCookies();
        open(PagePath.LOGIN);
        loginPage.userNameInput().setValue(newUserData.getNewUserLogin());
        loginPage.passwordInput().setValue(newUserData.getNewPassword());
        loginPage.submitButton().click();
        profilePage.deleteAccountButton().click();
        profilePage.confirmDeleteAccountButton().click();
        Selenide.confirm();
        loginPage.userNameInput().setValue(newUserData.getNewUserLogin());
        loginPage.passwordInput().setValue(newUserData.getNewPassword());
        loginPage.submitButton().click();
        loginPage.errorMessage().shouldBe(Condition.visible);

    }
}

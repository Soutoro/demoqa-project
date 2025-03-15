package pages;

import com.codeborne.selenide.SelenideElement;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage extends BaseTest {

    public SelenideElement userNameInput() { return $x("//input[@id='userName']").as("Поле ввода 'UserName'"); }
    public SelenideElement passwordInput() { return $x("//input[@id='password']").as("Поле ввода 'Password'"); }
    public SelenideElement submitButton() { return $x("//button[@id='login']").as("Кнопка 'Login'"); }
    public SelenideElement errorMessage() { return $x("//p[text()='Invalid username or password!']").as("Сообщение о неавлидных данных"); }

}

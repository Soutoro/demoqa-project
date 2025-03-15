package pages;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.$x;

public class TextBoxPage {

    Faker faker = new Faker(new Locale("ru"));
    Faker emailFaker = new Faker();

    public SelenideElement userNameInput() {
        return $x("//input[@id='userName']").as("Поле ввода 'Full Name'");
    }
    public String userNameValue() { return faker.name().firstName(); }
    public SelenideElement userEmailInput() {
        return $x("//input[@id='userEmail']").as("Поле ввода 'Email'");
    }
    public String userEmailValue() {
        return emailFaker.internet().emailAddress();
    }
    public SelenideElement userCurrentAddressInput() {return $x("//textarea[@id='currentAddress']").as("Поле ввода 'Current Address'");}
    public String userCurrentAddressValue() {
        return faker.address().streetAddress();
    }
    public SelenideElement userPermanentAddressInput() {return $x("//textarea[@id='permanentAddress']").as("Поле ввода 'Permanent Address'");}
    public String userPermanentAddressValue() {
        return faker.address().streetAddress();
    }
    public SelenideElement submitButton() {
        return $x("//button[@id='submit']").as("Кнопка 'Submit'");
    }
    public SelenideElement userNameResult() {
        return $x("//p[@id='name']").as("Поле вывода 'Full Name'");
    }
    public SelenideElement userEmailResult() {
        return $x("//p[@id='email']").as("Поле вывода 'Email'");
    }
    public SelenideElement userCurrentAddressResult() {return $x("//p[@id='currentAddress']").as("Поле вывода 'Current Address'");}
    public SelenideElement userPermanentAddressResult() {return $x("//p[@id='permanentAddress']").as("Поле вывода 'Permanent Address'");}

}

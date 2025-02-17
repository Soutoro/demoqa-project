package pages;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.$x;

public class TextBoxPage {

    Faker faker = new Faker(new Locale("ru"));
    Faker emailFaker = new Faker();

    public SelenideElement userNameInput() {
        return $x("//input[@id='userName']");
    }

    public String userNameValue() { return faker.name().firstName(); }

    public SelenideElement userEmailInput() {
        return $x("//input[@id='userEmail']");
    }

    public String userEmailValue() {
        return emailFaker.internet().emailAddress();
    }

    public SelenideElement userCurrentAddressInput() {
        return $x("//textarea[@id='currentAddress']");
    }

    public String userCurrentAddressValue() {
        return faker.address().streetAddress();
    }

    public SelenideElement userPermanentAddressInput() {
        return $x("//textarea[@id='permanentAddress']");
    }

    public String userPermanentAddressValue() {
        return faker.address().streetAddress();
    }

    public SelenideElement submitButton() {
        return $x("//button[@id='submit']");
    }

    public SelenideElement userNameResult() {
        return $x("//p[@id='name']");
    }

    public SelenideElement userEmailResult() {
        return $x("//p[@id='email']");
    }

    public SelenideElement userCurrentAddressResult() {
        return $x("//p[@id='currentAddress']");
    }

    public SelenideElement userPermanentAddressResult() {
        return $x("//p[@id='permanentAddress']");
    }

}

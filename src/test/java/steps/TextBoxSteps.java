package steps;

import configs.PagePath;
import io.qameta.allure.Step;
import pages.TextBoxPage;
import tests.BaseTest;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxSteps extends BaseTest {

    TextBoxPage textBoxPage = new TextBoxPage();

    private final String name = textBoxPage.userNameValue();
    private final String email = textBoxPage.userEmailValue();
    private final String currentAddress = textBoxPage.userCurrentAddressValue();
    private final String permanentAddress = textBoxPage.userPermanentAddressValue();

    @Step("Открыть страницу проверки текст бокса")
    public void goToTextBoxPage() { open(PagePath.TEXT_BOX_PAGE); }

    @Step("Ввести значения в поля и подтвердить")
    public void setValues() {

        textBoxPage.userNameInput().setValue(name);
        textBoxPage.userEmailInput().setValue(email);
        textBoxPage.userCurrentAddressInput().setValue(currentAddress);
        textBoxPage.userPermanentAddressInput().setValue(permanentAddress);
        textBoxPage.submitButton().click();

    }

    @Step("Проверить отображение введенных данных")
    public void checkSaveValues() {

        textBoxPage.userNameResult().shouldHave(text(name));
        textBoxPage.userEmailResult().shouldHave(text(email));
        textBoxPage.userCurrentAddressResult().shouldHave(text(currentAddress));
        textBoxPage.userPermanentAddressResult().shouldHave(text(permanentAddress));

    }
}

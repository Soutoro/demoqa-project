package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.TextBoxSteps;

public class TextBoxTests extends BaseTest{

    TextBoxSteps textBoxSteps = new TextBoxSteps();

    @Test
    @DisplayName("Тест на проверку текстбоксов")
    public void textBoxTest() {

        textBoxSteps.goToTextBoxPage();
        textBoxSteps.setValues();
        textBoxSteps.checkSaveValues();

    }

}

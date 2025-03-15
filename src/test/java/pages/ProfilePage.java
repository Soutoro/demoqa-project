package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProfilePage {

    public SelenideElement deleteBookButton() {return $x("//span[@id='delete-record-undefined']").as("Иконка удаления книги");}
    public SelenideElement confirmDeleteButton() {return $x("//button[@id='closeSmallModal-ok']").as("Кнопка подтверждения удаления книги");}
    public SelenideElement messageAboutEmptyTable() {return $x("//div[text()='No rows found']").as("Сообщение, что таблица пуста");}
    public SelenideElement deleteAccountButton() {return $x("//button[text()='Delete Account']").as("Кнопка 'Delete Account'");}
    public SelenideElement confirmDeleteAccountButton() {return $x("//button[@id='closeSmallModal-ok']").as("Кнопка подтверждения удаления аккаунта");}

}

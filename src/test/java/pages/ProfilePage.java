package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProfilePage {

    public SelenideElement deleteBookButton() {return $x("//span[@id='delete-record-undefined']");}
    public SelenideElement confirmDeleteButton() {return $x("//button[@id='closeSmallModal-ok']");}
    public SelenideElement messageAboutEmptyTable() {return $x("//div[text()='No rows found']");}
    public SelenideElement deleteAccountButton() {return $x("//button[text()='Delete Account']");}
    public SelenideElement confirmDeleteAccountButton() {return $x("//button[@id='closeSmallModal-ok']");}

}

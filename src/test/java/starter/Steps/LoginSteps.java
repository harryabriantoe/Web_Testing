package starter.Steps;

import starter.Pages.Loginpages;

public class LoginSteps {

    Loginpages loginPages;
    public void openHomePage() {
        loginPages.open();
    }

    public void openLoginPage() {
        loginPages.clickIconBooksStore();
        loginPages.clickButtonLogin();
    }

    public void inputAccountValid() {loginPages.inputUserNamePassValid();}
    public void inputAccountInvalid1() {loginPages.inputValidUserNameinvalidPass(); }
    public void inputAccountInvalid2() {loginPages.inputinvalidUserNameValidPass(); }
    public void inputAccountInvalid3() {loginPages.inputInvalidUserNameInvalidPass(); }

    public void clickLogin2() {
        loginPages.clickLogin2();
    }





}

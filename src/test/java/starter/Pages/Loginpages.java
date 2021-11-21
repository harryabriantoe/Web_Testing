package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpages extends PageObject {

    @FindBy(xpath ="//*[@id=\"app\"]/div/div/div[2]/div/div[6]")
    WebElement iconBooksStore;
    public void clickIconBooksStore() {
//        waitForCondition().until(ExpectedCondition.elementToBeClickable(iconBooksStore));
        iconBooksStore.click();
    }

    @FindBy(id = "login")
    WebElement buttonLogin;
    public void clickButtonLogin() {
        buttonLogin.click();
    }

    @FindBy(id = "userName")
    WebElement inputUserName;

    @FindBy(id = "password")
    WebElement inputPass;

    @FindBy(id ="login")
    WebElement ButtonLogin2;

    public void inputUserNamePassValid() {
        inputUserName.sendKeys("automation2");
        inputPass.sendKeys("November@2");
    }

    public void clickLogin2() {
        ButtonLogin2.click();
    }

    public void inputValidUserNameinvalidPass() {
        inputUserName.sendKeys("automation2");
        inputPass.sendKeys("November2");
    }
    public void inputinvalidUserNameValidPass() {
        inputUserName.sendKeys("automation");
        inputPass.sendKeys("November@2");
    }
    public void inputInvalidUserNameInvalidPass() {
        inputUserName.sendKeys("automation");
        inputPass.sendKeys("November2");
    }
}













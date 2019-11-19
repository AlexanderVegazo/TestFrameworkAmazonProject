package BrowserApp.pageobjects.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import BrowserApp.framework.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FirebaseAppHomePage extends BasePage {

    String url = "https://gbhqatest.firebaseapp.com/";

    public FirebaseAppHomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "/html/body/note-app//na-login//paper-button")
    public WebElement loginButton;

    public void openHomePage() {
        driver.get(url);
    }


    public void clickLogIn(){
        loginButton.click();
    }




}

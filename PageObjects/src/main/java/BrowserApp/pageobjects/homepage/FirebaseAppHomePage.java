package BrowserApp.pageobjects.homepage;

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


    @FindBy(how = How.ID, using = "u_0_2")
    public WebElement loginButton;

    public void openHomePage() {
        driver.get(url);
    }




}

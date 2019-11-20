package BrowserApp.tests.homepage;


import org.junit.Test;
import BrowserApp.framework.core.BaseTest;
import BrowserApp.pageobjects.homepage.FirebaseAppHomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirebaseAppHomepageTest extends BaseTest{

    FirebaseAppHomePage firebaseAppHomePage;


    @Test
    public void homepageTests() {
        firebaseAppHomePage = new FirebaseAppHomePage(getDriver());
        firebaseAppHomePage.openHomePage();
        firebaseAppHomePage.clickLogIn();




    }


}
package com.pageobjects.AmazonHomePage;

import com.testFramework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomePage extends BasePage {
    String url = "https://www.amazon.com/";

    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.CSS, using = "#nav-link-accountList")
    public WebElement accountList;

    @FindBy(how = How.ID, using = "searchDropdownBox")
    public WebElement categoriesDrop;

    @FindBy(how = How.XPATH, using = "//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
    public WebElement searchButton;

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    public WebElement searchTextBox;
    //(//span[contains(text(),'Apple iPhone 7, 32GB, Black - Fully Unlocked (Rene')])[last()]

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Apple iPhone 7')])")
    public WebElement objectToBuy;

    @FindBy(how = How.XPATH, using = "//button[@id='a-autoid-10-announce']")
    public WebElement sprintStyleLabel;

    @FindBy(how = How.ID, using = "add-to-cart-button")
    public WebElement addToCartButton;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(), 'Added to Cart')]")
    public WebElement addedToCartLabel;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'results for')]")
    public WebElement resultsLabel;




    public void openHomePage() {
        driver.get(url);
    }


    public void clickSearch(){
        waitForElementToBeLoaded(searchButton);
        searchButton.click();
        System.out.println(searchButton.getText());
    }

    public void selectCategorie(String categorie){
        Select categories = new Select(categoriesDrop);
        categories.selectByVisibleText(categorie);


    }

    public void writeArticleToFind (String article){
        waitForElementToBeLoaded(searchTextBox);
        searchTextBox.sendKeys(article);


    }

    public void clickOnAnIphone( ){

        waitForElementToBeLoaded(objectToBuy);
        objectToBuy.click();

    }

    public void selectSprintStyle(){
        waitForElementToBeLoaded(sprintStyleLabel);
        sprintStyleLabel.click();
    }

    public void addElementToCart(){
        waitForElementToBePresent(addToCartButton);
        addToCartButton.click();


    }

    public void verifyElementWasAddedToCart(){
        waitForElementToBePresent(addedToCartLabel);
        assert addedToCartLabel.isDisplayed();



    }

    public void verifyIphoneWasSelected(){
        waitForElementToBePresent(resultsLabel);
        assert resultsLabel.isDisplayed();



    }




}

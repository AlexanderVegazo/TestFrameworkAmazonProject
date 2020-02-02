package com.tests.homepage;

import com.testFramework.core.BaseTest;
import com.pageobjects.AmazonHomePage.AmazonHomePage;
import org.junit.Before;
import org.junit.Test;

public class AmazonBasicTest extends BaseTest {

    AmazonHomePage amazonHomePage;

    @Before
    public void prepare() {
        amazonHomePage  = new AmazonHomePage(getDriver());
    }

    @Test
    public void searchAnIphoneOnDeals(){

        amazonHomePage.openHomePage();
        amazonHomePage.selectCategorie("Deals");
        amazonHomePage.writeArticleToFind("Iphone 7");
        amazonHomePage.clickSearch();
        amazonHomePage.verifyIphoneWasSelected();


    }

    @Test
    public void addFullyUnlockedIphoneToCart(){

        amazonHomePage.clickOnAnIphone();
        amazonHomePage.selectSprintStyle();
        amazonHomePage.addElementToCart();
        amazonHomePage.verifyElementWasAddedToCart();




    }


}

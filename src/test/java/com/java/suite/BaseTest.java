package com.java.suite;

import com.java.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class BaseTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Test
    public void testHomePage() {
        homePage.navigateToHomePage();
        homePage.clickElement();
        // Add more test steps here

        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Expected Page Title", "Page title is incorrect.");

        // Add more assertions and test steps as needed
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

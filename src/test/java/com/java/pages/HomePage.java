package com.java.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private static final By ELEMENT_ID = By.id("elementId");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToHomePage() {
        driver.get("https://demoqa.com/");
    }

    public void clickElement() {
        click(ELEMENT_ID);
    }

}

package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleTestingApp {

    public static final String SEARCHFIELD = "q";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();

        WebElement searchField = driver.findElement(By.name(SEARCHFIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}
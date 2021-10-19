package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {
    private static final String FACE_COOKIES = "//div[contains(@class, \"xo5\")]/button[2]";
    private static final String CREATE_ACC = "//div[contains(@class, \"6ltg\")]/a";
    private static final String DAY_OF_BIRTH ="//select[contains(@name, \"birthday_day\")]";
    private static final String MONTH_OF_BIRTH = "//select[contains(@name, \"birthday_month\")]";
    private static final String YEAR_OF_BIRTH = "//select[contains(@name, \"birthday_year\")]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver face = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        face.get("https://facebook.com");

        WebElement cookies = face.findElement(By.xpath(FACE_COOKIES));
        cookies.click();

        WebElement create = face.findElement(By.xpath(CREATE_ACC));
        create.click();

        TimeUnit.SECONDS.sleep(2);
        WebElement day = face.findElement(By.xpath(DAY_OF_BIRTH));
        Select selectDat = new Select(day);
        selectDat.selectByIndex(29);

        WebElement month = face.findElement(By.xpath(MONTH_OF_BIRTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(4);

        WebElement year = face.findElement(By.xpath(YEAR_OF_BIRTH));
        Select selectYear = new Select(year);
        selectYear.selectByIndex(23);
    }
}

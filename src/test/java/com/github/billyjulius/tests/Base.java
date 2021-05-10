package com.github.billyjulius.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Base {

    protected WebDriver driver;

    @BeforeMethod
    public void beforeSetup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.phptravels.net");
    }

    @AfterMethod
    public void afterSetup() {
        driver.close();
        driver.quit();
    }
}

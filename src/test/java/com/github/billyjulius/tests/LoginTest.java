package com.github.billyjulius.tests;

import com.github.billyjulius.pages.HomePage;
import org.testng.annotations.Test;


public class LoginTest extends Base {

    HomePage homePage;

    @Test
    public void LoginSuccess() {
        homePage = new HomePage(driver);
        homePage.goToLogin();
    }

    @Test
    public void LoginFailed() {
        homePage = new HomePage(driver);
        homePage.goToLogin();
    }
}

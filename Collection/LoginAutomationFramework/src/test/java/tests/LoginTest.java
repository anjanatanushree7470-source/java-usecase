package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
                {"standard_user", "secret_sauce", "success"},
                {"standard_user", "wrongpass", "error"},
                {"wronguser", "secret_sauce", "error"},
                {"", "", "empty"}
        };
    }

    @Test(dataProvider = "loginData", retryAnalyzer = utils.RetryAnalyzer.class)
    public void loginTest(String username, String password, String expected) {

        LoginPage lp = new LoginPage(driver);
        lp.login(username, password);

        if(expected.equals("success")) {
            Assert.assertTrue(lp.getCurrentURL().contains("inventory"));
        }
        else {
            Assert.assertTrue(lp.getErrorMessage().contains("Epic sadface"));
        }
    }
}

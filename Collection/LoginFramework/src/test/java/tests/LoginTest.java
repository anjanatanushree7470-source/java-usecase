package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ExcelUtil;

public class LoginTest extends BaseTest {

    @DataProvider(name = "excelData")
    public Object[][] getData() throws Exception {
        return ExcelUtil.getTestData(
            "src/test/resources/testdata/LoginData.xlsx",
            "Sheet1"
        );
    }

    @Test(dataProvider = "excelData")
    public void loginTest(String username, String password, String expected) {

        LoginPage lp = new LoginPage(driver);
        lp.login(username, password);

        if(expected.equalsIgnoreCase("success")) {
            Assert.assertTrue(lp.getCurrentURL().contains("inventory"));
        } else {
            Assert.assertTrue(lp.getErrorMessage().contains("Epic sadface"));
        }
    }
}

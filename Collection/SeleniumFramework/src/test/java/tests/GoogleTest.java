package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GooglePage;

public class GoogleTest extends BaseTest {

    @Test
    public void verifyGoogleTitle() {

        GooglePage googlePage = new GooglePage(driver);
        String title = googlePage.getTitle();

        Assert.assertEquals(title, "Google");
    }
}

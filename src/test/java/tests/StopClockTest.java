package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NavigationPage;

public class StopClockTest extends BaseTest{

    @Test
    public void stopClockTest() {
        NavigationPage navigationPage = new NavigationPage(driver);
        boolean isCircleDisplayed = navigationPage
                .openStopClockPage()
                .isCircleDisplayed();
        Assert.assertTrue(isCircleDisplayed, "StopClock circle isn't displayed");
    }
}

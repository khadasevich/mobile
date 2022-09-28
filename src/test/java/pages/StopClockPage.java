package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class StopClockPage extends BasePage {

    private By STOPCLOCK_CIRCLE = By.id("com.google.android.deskclock:id/stopwatch_circle");

    public StopClockPage(AppiumDriver driver) {
        super(driver);
    }

    public boolean isCircleDisplayed() {
        return driver.findElement(STOPCLOCK_CIRCLE).isDisplayed();
    }
}

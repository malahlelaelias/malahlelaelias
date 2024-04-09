package EleazarAppium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SwipeDemo extends BaseTest{

    @Test
    public void swipe() throws MalformedURLException, InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        //driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Gallery\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]")).click();
        //(android.widget.ImageView)[1].
        driver.findElement(By.xpath("//(android.widget.ImageView)[1]")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//(android.widget.ImageView)[1]")).getAttribute("focusable"), "true");

        WebElement element = driver.findElement(By.xpath("//(android.widget.ImageView)[1]"));

        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId",((RemoteWebElement)element).getId(),
                "direction", "left",
                "percent", 0.75
        ));
        Assert.assertEquals(driver.findElement(By.xpath("//(android.widget.ImageView)[1]")).getAttribute("focusable"), "false");








    }
}

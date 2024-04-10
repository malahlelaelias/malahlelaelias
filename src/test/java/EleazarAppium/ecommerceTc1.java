package EleazarAppium;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ecommerceTc1 extends BaseTest
{

    @Test
    public void fillForm() throws InterruptedException {
        //driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("MatuduMalahlela");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.androidsample.generalstore:id/nameField\"]")).sendKeys("Matudu");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//android.widget.RadioButton[@text=\"Female\"]")).click();
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Argentina\"]")).click();
     //   driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.androidsample.generalstore:id/btnLetsShop\"]")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        Thread.sleep(3000);
        String toastMessage=driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
        Assert.assertEquals(toastMessage,"Please enter your name");






    }
}

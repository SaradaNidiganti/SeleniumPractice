package OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    @Test
    public void loginFunctionality() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        String actTitle = driver.getTitle();
        Assert.assertEquals(actTitle,"OrangeHRM","both values should be equal");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement value=driver.findElement(By.xpath("//h6"));
        Thread.sleep(1000);
        Assert.assertEquals(value.getText(),"Dashboard","Both values should be same");
        driver.quit();

    }
}

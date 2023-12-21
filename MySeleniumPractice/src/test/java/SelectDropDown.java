import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectDropDown {


    @Test
    public void selectClass() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement courseEle = driver.findElement(By.id("course"));
        Select dropDown = new Select(courseEle);
        System.out.println(dropDown.getOptions());
        dropDown.selectByVisibleText("Dot Net");
        Thread.sleep(2000);
        dropDown.selectByValue("python");
        Thread.sleep(2000);
        dropDown.selectByIndex(1);
        Thread.sleep(2000);
        WebElement multipleDropDown = driver.findElement(By.id("ide"));
        Select multiple = new Select(multipleDropDown);
        System.out.println(multiple.getOptions());
        multiple.selectByValue("nb");
        Thread.sleep(1000);
        multiple.selectByVisibleText("Visual Studio");
        Thread.sleep(1000);
        driver.quit();
    }
}

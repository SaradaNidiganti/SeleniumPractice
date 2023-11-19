import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // to maximize the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // to resolver page load and NoSuchElement Exc
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("name")).sendKeys("Selenium");
        driver.findElement(By.id("alertbtn")).click();
        // Alert : accept()-ok, dismiss()-cancel, sendKeys("..") - for prompt alert, getText()- to get alert window text
        Alert alertWindow = driver.switchTo().alert();
        System.out.println(alertWindow.getText());
        //simple alert
        alertWindow.accept();
        driver.findElement(By.id("name")).sendKeys("Cypress");
        //confirmation alert
        driver.findElement(By.id("confirmbtn")).click();
        Alert confWindow = driver.switchTo().alert();
        System.out.println(confWindow.getText());
        confWindow.dismiss();
        //prompt Alert

        driver.close();
        driver.quit();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ranjit on 11/14/2023
 */
public class AddToCart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(1000);
        String[] names={"Cucumber","Brocolli","Walnuts"};
        List nameList = Arrays.asList(names);
        List<WebElement> productList= driver.findElements(By.xpath("//h4[@class='product-name']"));
        System.out.println(productList.size());
        for(int i=0;i< productList.size();i++){
            String[] listNames=productList.get(i).getText().split("-");
            String vegName= listNames[0].trim();
            //List listVegName=Arrays.asList(vegName);
            if(nameList.contains(vegName)){
                //driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                System.out.println(vegName);
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                Thread.sleep(1000);
            }
        }

        driver.close();
        driver.quit();
    }
}

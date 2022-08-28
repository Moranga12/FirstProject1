package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements2_cars {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\moran\\Automation\\Chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calauto.co.il/heb/wantbuy/searchresults/");

        List<WebElement> Years = driver.findElements(By.xpath("//td[@class='year ng-binding']"));

        for (int i = 0; i < Years.size() ; i++) {
            System.out.println(Years.get(i).getText());

        }







    }



}

package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class lessom0307
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\moran\\Automation\\Chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.matzberim4u.co.il/site/Shop/manufacture/manufactureCat.asp?depart_id=459755&manufacture_id=26418");




        List<WebElement> list = driver.findElements(By.xpath("//span[@class='sop-product-our-price']//span"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
        }











    }



}

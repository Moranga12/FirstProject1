package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simania
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\moran\\Automation\\Chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://simania.co.il/");
        driver.findElement(By.id("query")).sendKeys("אין ילדים רעים");
        driver.findElement(By.className("clickable")).click();
        try {
            String name = driver.findElement(By.xpath("html/body/div[1]/div/div[5]/table/tbody/tr/td[2]/div/h3/a")).getText();
            System.out.println(name);
        }
        catch (Exception e){
            System.out.println("fail");
        }


        driver.findElement(By.xpath("//div[@id='comments']//button[@ng-click='toggleCollapse();']")).click();




    }



}

package FinalSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        mytask1();

    }

    public static void mytask1() throws InterruptedException {
      /*  System.setProperty("webdriver.chrome.driver", "C:\\moran\\Automation\\Chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.supermarker.themarker.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("txtSearch")).sendKeys("מחשבון");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='ui-id-1']//li[2]")).click();
        driver.quit();

*/      System.setProperty("webdriver.chrome.driver", "C:\\moran\\Automation\\Chromedriver//chromedriver.exe");
        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://www.supermarker.themarker.com/Calculators/Mortgage/MartgageCalculator.aspx");
        Thread.sleep(2000);
        System.out.println(driver2.getCurrentUrl());
        Thread.sleep(2000);
        driver2.findElement(By.id("txtSearch")).sendKeys("moran");
        WebElement w = driver2.findElement(By.name("ctl00$ContentPlaceHolder1$MortgageLead$btnSendLid"));
        w.click();
        //driver2.findElement(By.xpath("//span[@id='rblSelectCalcType']//label[@class='ui-button ui-widget ui-state-default ui-button-text-only ui-corner-right ui-state-active']"));
       // System.out.println("בשדה חשב לפי השדה הנבחר הוא החזר חודשי");






    }





}

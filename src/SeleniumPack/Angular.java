package SeleniumPack;

import com.paulhammant.ngwebdriver.ByAngular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Angular {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\moran\\Automation\\Chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myhealth.stanfordhealthcare.org/#/");
        Thread.sleep(3000);

        driver.findElement(ByAngular.model("id")).sendKeys("1234");
        driver.findElement(ByAngular.model("password")).sendKeys("123");
        driver.findElement(ByAngular.buttonText("Sign In")).click();


    }



}

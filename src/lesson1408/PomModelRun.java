package lesson1408;

import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PomModelRun {

    @BeforeClass
    public static void beforeClass(){
        System.setProperty("webdriver.chrome.driver", "C:\\moran\\Automation\\Chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.netogreen.co.il/Calculators/Nutrition-Calories.aspx");
        PomModel pom = new PomModel ();
        pom = PageFactory.initElements(driver, PomModel.class);


    }

    @Test
    public void test1() throws Exception {
        PomModel.search_fill.sendKeys("μην");
        PomModel.search_button.click();
        Thread.sleep(3000);
        String Fresult = PomModel.FirstResult.getText();
        System.out.println(Fresult);
        if (!Fresult.contains("μην")) {
            throw new Exception();
        }



    }










}

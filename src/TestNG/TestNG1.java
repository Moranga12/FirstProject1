package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

    static WebDriver driver;
    @BeforeClass
    static public void beforeclass(){}

    @BeforeGroups("list")
    static public void beforegroup1() throws InterruptedException {
        System.out.println("Group = list");
        System.setProperty("webdriver.chrome.driver","C:\\moran\\Automation\\Chromedriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.nisha.co.il/%D7%98%D7%91%D7%9C%D7%90%D7%95%D7%AA-%D7%A9%D7%9B%D7%A8");
        Thread.sleep(3000);
    }
    @BeforeGroups("average")
    static public void beforegroup2(){
        System.out.println("Group = average");
    }

    @BeforeTest
    static public void beforetest() throws InterruptedException {

    }

    @Test (priority = 1, groups = "list" )
    static public void t1(){
        System.out.println("list - test 1");


    }
    @Test (priority = 1, groups = "list" )
    static public void t2(){
        System.out.println("list - test 2");
    }

    @Test (priority = 1, groups = "average" )
    static public void t3(){
        System.out.println("average - test 1");
    }

    @Test (priority = 1, groups = "average" )
    static public void t4(){
        System.out.println("average - test 2");
    }




}

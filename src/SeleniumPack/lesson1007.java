package SeleniumPack;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class lesson1007 {


    public static void task1 () {
        System.setProperty("webdriver.chrome.driver", "C:\\moran\\Automation\\Chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://marcojakob.github.io/dart-dnd/basic/");

        List<WebElement> papers = driver.findElements(By.className("document"));

        for (int i = 0; i < papers.size(); i++) {

            WebElement draggable = papers.get(i);
            WebElement droppable = driver.findElement(By.className("trash"));
            new Actions(driver).dragAndDrop(draggable, droppable).perform();

        }
    }

    public static void task2 (){
        System.setProperty("webdriver.chrome.driver", "C:\\moran\\Automation\\Chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://danielauto.net/practice/action/multipick.html");

        List<WebElement> list = driver.findElements(By.tagName("option"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).click(list.get(0)).click(list.get(2)).keyUp(Keys.SHIFT).perform();
        action.keyDown(Keys.CONTROL).click(list.get(1)).click(list.get(2)).click(list.get(4)).keyUp(Keys.CONTROL).perform();


        WebElement doubleClickElement = driver.findElement(By.id("**"));
        Actions actions = new Actions(driver);
        action.doubleClick(doubleClickElement);
        action.perform();

    }

    public static void main(String[] args) throws ATUTestRecorderException, InterruptedException {

        //lesson1007.task1();
        lesson1007.task2();






        //ATUTestRecorder recorder = new ATUTestRecorder("C:\\moran\\","TestVideo-",false);
       // recorder.start();

       // recorder.stop();





    }









}

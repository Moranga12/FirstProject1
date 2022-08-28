package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\moran\\Automation\\Chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stackoverflow.com/tags");

        List<WebElement> AllTags = driver.findElements(By.className("post-tag"));
        List<WebElement> Ques = driver.findElements(By.xpath("//div[@class='mt-auto d-flex jc-space-between fs-caption fc-black-400']//div[@class='flex--item']"));
        int x = 0;
        for (int i = 0; i < AllTags.size(); i++) {

            String s1 = AllTags.get(i).getText();
            String s2 = Ques.get(x).getText();
            System.out.println("in "+ s1 + " we have "+s2);
            x++;

        }







    }



}

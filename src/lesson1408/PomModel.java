package lesson1408;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class PomModel {

    @FindBy(id = "searchTxt")
    static WebElement search_fill;

    @FindBy(id = "Button1")
    static WebElement search_button;

    @FindBy(xpath = "//*[@id=\"serachResults\"]//option[1]")
    static WebElement FirstResult;



//*[@id="serachResults"]//option[1]

}

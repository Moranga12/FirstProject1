package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.List;

public class lesson1707tables {

    public static void main(String[] args) {
        lesson1707tables.task1();
    }

    public static void task1 () {

        System.setProperty("webdriver.chrome.driver", "C:\\moran\\Automation\\Chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://danielauto.net/practice/tabls/tables.html");

        int a = 0;
        int b = 0;
        int c = 0;

        List<WebElement> list = driver.findElements(By.tagName("tr"));
        List<WebElement> list2 = driver.findElements(By.xpath("//*[@id=\"tab\"]/tbody/tr[1]/td"));
        System.out.println(list2.size());

       // List<WebElement> list3 = list.get(1).findElements(By.tagName("td"));
      //  System.out.println(list3.get(1).getText());

        List<WebElement> list3 = list.get(1).findElements(By.xpath("//td[2]"));

        for (int i = 0; i < list3.size(); i++) {

            String answer = list3.get(i).getText();
            if (answer.equals("A")){a++;}
            if (answer.equals("B")){b++;}
            if (answer.equals("C")){c++;}

        }
        System.out.println("A=" + a + " B="+ b +" C="+ c);

        List<WebElement> biger = list.get(1).findElements(By.xpath("//td[3]"));
        double max = 0;
        for (int i = 0; i < biger.size(); i++) {
            String temp = biger.get(i).getText().replace(",","");
            double d = Double.parseDouble(temp);
            if (d > max){max = d;}

        }
        System.out.println("the maximum num is: "+ max);

        int Acompany = 0;
        List<WebElement> list4 = list.get(1).findElements(By.xpath("//td[1]"));
        for (int i = 0; i < list4.size(); i++) {
            String s = list4.get(i).getText();
            if (s.startsWith("A")) {
                Acompany++;
            }
        }
        System.out.println(Acompany);

        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).findElement(By.xpath("td[2]")).getText().equals("C"))
            {
                if(list.get(i).findElement(By.xpath("td[1]")).getText().startsWith("A")){
                    count++;
                }
            }

            System.out.println("The num of company that start with A and with group C is: " + count);



            
        }









    }






}

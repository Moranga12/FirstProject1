package SeleniumPack;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUNITsupermarket {

    static WebDriver driver;
    static double supersul;
    static double rami;
    static double quik;

    @BeforeClass
    public static void beforeClass(){
        System.setProperty("webdriver.chrome.driver", "C:\\moran\\Automation\\Chromedriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void afterClass(){
        driver.quit();
    }


    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.shufersal.co.il/online/he/");
        Thread.sleep(5000);
        driver.findElement(By.name("text")).sendKeys("שניצל תירס טבעול");
        Thread.sleep(2000);
        String num = driver.findElement(By.xpath("//*[@id=\"formSearchSubmit\"]/fieldset/div/span/div/div[2]/div[2]/div/div[2]/div[1]/span/span[1]")).getText();
        supersul = Double.valueOf(num);
        System.out.println(supersul);
    }
    @Test
    public void test2() throws InterruptedException {
        driver.get("https://www.rami-levy.co.il/he/online/market");
        Thread.sleep(5000);
        driver.findElement(By.id("destination")).sendKeys("שניצל תירס טבעול");
        Thread.sleep(2000);
        String num = driver.findElement(By.xpath("//*[@id=\"item-srch-0\"]/div/div[4]/span/span")).getText();
        num = num.replace("₪","");
        num = num.trim();
        rami = Double.valueOf(num);
        System.out.println(rami);


    }
    @Test
    public void test3() throws InterruptedException {
        driver.get("https://quik.co.il/");
        Thread.sleep(5000);
        driver.findElement(By.className("searchInput_KC6")).sendKeys("שניצל תירס טבעול");
        Thread.sleep(3000);
        String num = driver.findElement(By.xpath("//*[@id=\"product-7290111566752\"]/div[5]//strong")).getText();
        num = num+".";
        num = num + driver.findElement(By.xpath("//*[@id=\"product-7290111566752\"]/div[5]//small[2]")).getText();
        quik = rami = Double.valueOf(num);
        System.out.println(quik);

    }

    @Test
    public void test4()  {
        double min;
        System.out.println(rami);
        System.out.println(supersul);
        System.out.println(quik);

        if (rami<supersul && rami<quik) {
            min = rami;
            System.out.println("the lowest price is in rami levi");
        }
        if (supersul<rami && supersul<quik) {
            min = supersul;
            System.out.println("the lowest price is in supersul");
        }

        if (quik<rami && quik<supersul){
            min = quik;
            System.out.println("the lowest price is in quik");
        }

        System.out.println("no one");



    }
}

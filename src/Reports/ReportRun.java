package Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ReportRun {
    static WebDriver driver;
    static ExtentReports extent;
    static ExtentTest test;
    static ExtentManager exm = new ExtentManager(driver);

@BeforeClass
    public static void Before(){
    extent = exm.GetExtent();
    test = exm.createTest("name", "description");
}

@AfterClass
    public static void After(){
    extent.flush();
}

    @Test
    public void test1 (){
    test.pass("test pass");
    test.fail("test fail");
    test.warning("warning");
    test.skip("skip");
    test.info("info");
    }




}

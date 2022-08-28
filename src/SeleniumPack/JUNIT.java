package SeleniumPack;

import org.junit.*;



public class JUNIT {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("AfterClass");
    }
    @Before
    public void before(){
        System.out.println("beforeEach");
    }
    @After
    public void after(){
        System.out.println("afterEach");
    }
    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }

}

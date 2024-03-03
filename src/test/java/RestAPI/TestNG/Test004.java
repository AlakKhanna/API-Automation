package RestAPI.TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test004 {

    @BeforeTest
    public  void t1(){
        System.out.println("1");
    }
    @BeforeTest
    public  void t2(){
        System.out.println("2");
    }
    @Test
    public  void t3(){
        System.out.println("3");
    }
}

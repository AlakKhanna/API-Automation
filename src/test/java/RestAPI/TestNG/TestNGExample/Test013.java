package RestAPI.TestNG.TestNGExample;

import org.testng.annotations.Test;

public class Test013 {
    @Test(priority = 1, groups = {"reg"})
    void  demo1()
    {
        System.out.println("1");
    }
    @Test(priority = 3)
    void  demo2()
    {
        System.out.println("2");
    }
    @Test
    void  demo3()
    {
        System.out.println("3");
    }
}

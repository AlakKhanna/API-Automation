package RestAPI.TestNG.TestNGExample;

import org.testng.annotations.Test;

public class Test009 {
    @Test
    public  void serverStartedOk ()
    {
        System.out.println("I will run First");
    }

    @Test (dependsOnMethods = "serverStartedOk")
    public  void method()
    {
        System.out.println("method");
    }
}

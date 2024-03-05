package RestAPI.TestNG.TestNGExample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test012 {

    @Parameters("browser")
    @Test (priority = 1)
    void demo1(String value)
    {
        System.out.println("browser is " + value);
    }


}

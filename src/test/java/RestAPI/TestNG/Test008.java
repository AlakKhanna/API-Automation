package RestAPI.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test008 {

    @Test
    void  TC1()
    {
        SoftAssert s= new SoftAssert();
        s.assertEquals(true,false, "True should not be equal to false");
        System.out.println("Please execute me");
        s.assertAll();


        //hard assertion
        Assert.assertEquals(true, false, "failed");
        System.out.println("This will not print");
    }
}

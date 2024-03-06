package RestAPI.ListenerDemo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomizeListener.class)
public class TC001 {

    @Test (groups = "sanity")
    public  void test1(){
        System.out.println("Test1");
        Assert.assertTrue(false);
    }

    @Test (groups = "sanity")
    public  void test2(){
        System.out.println("Test2");
        Assert.assertTrue(true);
    }

}

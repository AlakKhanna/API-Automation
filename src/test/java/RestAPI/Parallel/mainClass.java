package RestAPI.Parallel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class mainClass {
    @BeforeSuite

    public  void beforeMethod ()
    {
        long id = Thread.currentThread().getId();
        System.out.println("before test method. Thread id is " + id +getClass().getSimpleName());
    }


    @Test
    public  void testMethod1 ()
    {
        long id = Thread.currentThread().getId();
        System.out.println("test method one. Thread id is " + id +getClass().getSimpleName());
    }

    @Test
    public  void testMethod2 ()
    {
        long id = Thread.currentThread().getId();
        System.out.println("test method two. Thread id is " + id +getClass().getSimpleName());
    }

    @AfterMethod
    public  void AfterMethod ()
    {
        long id = Thread.currentThread().getId();
        System.out.println("After method . Thread id is " + id +getClass().getSimpleName());
    }
}

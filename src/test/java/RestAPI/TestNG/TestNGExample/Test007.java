package RestAPI.TestNG.TestNGExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test007 {

    @Test(groups = {"sanity", "QA"})
    public  void sanityrun()
    {
        System.out.println("Sanity");
        System.out.println("QA");
    }

    @Test(groups = {"reg", "sanity", "QA", "e2e","Preprod"})
    public  void RegRun()
    {
        System.out.println("Reg");
    }

    @Test(groups = {"smoke", "sanity", "Dev"})

    public  void SmokeRun()
    {
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }
}

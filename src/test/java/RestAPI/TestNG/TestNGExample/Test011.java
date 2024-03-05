package RestAPI.TestNG.TestNGExample;

import org.testng.annotations.Test;

public class Test011 {

    @Test(groups = {"init"}, priority = 1)
    public void gettoke()
    {
        System.out.println("serverStartedok");
    }
    @Test(groups = {"init"}, priority = 2)
    public  void getbookingid (){
        System.out.println("initenviornment");
    }
    @Test(dependsOnGroups = "init.*")
    public  void testPutReq()
    {
        System.out.println("Now I will run");
    }
}

package RestAPI.TestNG.TestNGExample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test010 {
    @DataProvider
    public Object[][] getData(){
        return  new  Object[][]{
                new Object[]{"Admin", "Admin"},
                new Object[]{"Admin", "Password123"},
                new Object[]{"Admin", "Password1234"},
                new Object[]{"Admin", "Password1234"},
                new Object[]{"Admin", "Password1234"},
                new Object[]{"Admin", "Password1234"},
                new Object[]{"Admin", "Password1234"},
                new Object[]{"Admin", "Password1234"},
                new Object[]{"Admin", "Password1234"},
                new Object[]{"Admin", "Password1234"},
                new Object[]{"Admin", "Password1234"},
                new Object[]{"Admin", "Password1234"},
                new Object[]{"Admin", "Password1234"},
                new Object[]{"Admin", "Password1234"},
                new Object[]{"Admin", "Password1234"},
                new Object[]{"Admin", "Password1234"},
                new Object[]{"Admin", "Password1234"},
                new Object[]{"Admin", "Password1234"}
        };

    }

    @Test (dataProvider = "getData")
    public  void  loginTest(String username, String password){
        System.out.println(username);
        System.out.println(password);
    }
}

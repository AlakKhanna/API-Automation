package RestAPI.TestNG.TestNGExample;

import org.testng.annotations.BeforeTest;

public class Test003 {
    String token;
    //put
    @BeforeTest
    public void gettoken (){
        token= "123";

    }
}

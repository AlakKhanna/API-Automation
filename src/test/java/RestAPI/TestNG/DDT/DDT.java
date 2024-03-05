package RestAPI.TestNG.DDT;

import org.testng.annotations.Test;

public class DDT {

    //someone who will give us data in excel file
    //read the Excel file- apache poi or fillo library
    //test case login where we will inject the username & password

    @Test(dataProvider = "getdata", dataProviderClass = UtilExcel.class)

    public  void testLogin (String username, String passowrd)
    {
        System.out.println(username);
        System.out.println(passowrd);
    }

}

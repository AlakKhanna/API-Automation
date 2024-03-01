package RestAPI.TestCases.CRUD.Get;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDStylewithTestNG {
    RequestSpecification r;


    @Test
    public void  Testgetallbookingpositibe()
    {
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/679").log().all();

        r.when().get();
        r.then().log().all().statusCode(200);

    }
    @Test (enabled = false)
    public void  Testgetallbookingnegative()
    {
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/-2975").log().all();

        r.when().get();
        r.then().log().all().statusCode(404);


    }
    @Test
    public void  Testgetallbookingnegative2()
    {
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/abc").log().all();

        r.when().get();
        r.then().log().all().statusCode(404);


    }

}

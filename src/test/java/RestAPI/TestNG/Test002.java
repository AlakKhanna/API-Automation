package RestAPI.TestNG;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Test002 {

    //put request
    //before-token, ID

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;

    Response response;


    String token;

    @BeforeTest
    public  void getToken ()
    {
        requestSpecification = RestAssured.given();
        String payload = "{\n" +
                "        \"username\": \"admin\",\n" +
                "        \"password\": \"password123\"\n" +
                "}";
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("auth");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload);
        Response response = requestSpecification.post();
        validatableResponse= response.then();
        validatableResponse.body("token", Matchers.notNullValue());
        token = response.then().log().all().extract().path("token");
        System.out.println(token);

    }

    @Test
  public  void testNonBDDStylePutReq ()
  {
      String payload = "{\n" +
              "    \"firstname\" : \"Pramod\",\n" +
              "    \"lastname\" : \"Brown\",\n" +
              "    \"totalprice\" : 111,\n" +
              "    \"depositpaid\" : true,\n" +
              "    \"bookingdates\" : {\n" +
              "        \"checkin\" : \"2018-01-01\",\n" +
              "        \"checkout\" : \"2019-01-01\"\n" +
              "    },\n" +
              "    \"additionalneeds\" : \"Breakfast\"\n" +
              "}";

      requestSpecification = RestAssured.given();
      requestSpecification.baseUri("https://restful-booker.herokuapp.com");
      requestSpecification.basePath("booking/5017");
      requestSpecification.contentType(ContentType.JSON);
      requestSpecification.cookie("token", token);
      requestSpecification.body(payload);

      response = requestSpecification.when().put();

      validatableResponse= response.then().log().all();
      validatableResponse.statusCode(200);
      validatableResponse.body("firstname", Matchers.equalTo("Pramod"));
      validatableResponse.body("lastname", Matchers.equalTo("Brown"));

  }


}

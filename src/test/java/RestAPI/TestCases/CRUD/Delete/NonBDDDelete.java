package RestAPI.TestCases.CRUD.Delete;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class NonBDDDelete {
    @Test
    public void testDeleteRequest() {
        //url
        //auth-token, headers
        //id
        //payload

        RequestSpecification requestSpecification;
        Response response;
        ValidatableResponse validatableResponse;
        String token = "e316dc4277731e0";


        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("booking/127");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token", token);

        response = requestSpecification.when().delete();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(201);


    }
}

package RestAPI.TestCases.CRUD.Patch;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class NonBDDPatch {

    @Test
    public void testPatchRequest() {
        //url
        //auth-token, headers
        //id
        //payload

        RequestSpecification requestSpecification;
        Response response;
        ValidatableResponse validatableResponse;
        String token = "e316dc4277731e0";

        String payload = "{\n" +
                "    \"firstname\" : \"Alak\",\n" +
                "    \"lastname\" : \"Khanna\"\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("booking/127");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token", token);
        requestSpecification.body(payload);

        response = requestSpecification.when().patch();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
        validatableResponse.body("firstname", Matchers.equalTo("Alak"));
        validatableResponse.body("lastname", Matchers.equalTo("Khanna"));


    }
}

package RestAPI.TestCases.CRUD.Get;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NonBDDStyleGet {
    //get request

    public static void main(String[] args) {

        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/2975").log().all();

        r.when().get();
        r.then().log().all().statusCode(200);


        //we can't use this style as we can't put all the test cases under one main method




    }
}

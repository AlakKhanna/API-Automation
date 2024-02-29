package RestAPI.TestCases.CRUD.Get;

import io.restassured.RestAssured;

public class BDDStyleGet {

    public static void main(String[] args) {
        //Get Request
        //URL
        //header-X
        //Base url- https://api.zippopotam.us
        //Base path- /IN/226003
        //Payload- X
        //Auth- X

        //Status code
        //Response body
        //time
        //headers
        //cookies


        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us").basePath("IN/226003")

                .when().log().all()
                .get()

                .then().log().all()
                .statusCode(200);






    }
}

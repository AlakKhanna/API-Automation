package RestAPI.misc.Gson;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Demo {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    @Test
    public void testpost ()
    {

        Booking booking = new Booking();
        booking.setFirstname("Alak");
        booking.setLastname("Khanna");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-03-01");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("breakfast");
        System.out.println(booking);



        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(booking).log().all();

        response = requestSpecification.when().post();
        Integer bookingID = response.then().extract().path("bookingid");


        validatableResponse= response.then().log().all();
        validatableResponse.statusCode(200);
        System.out.println("your booking id is" + bookingID);



    }



}

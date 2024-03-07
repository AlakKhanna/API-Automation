package RestAPI.misc.Gson.Example;

import RestAPI.misc.Gson.Booking;
import RestAPI.misc.Gson.Bookingdates;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;


public class PostReqTC {

    @Test
    public  void testpositive(){

        RequestSpecification requestSpecification;
        Response response;
        ValidatableResponse validatableResponse;

        //step1-post
        //url- base uri + base path
        //header
        //body
        //auth-no

        //step -2
        //prepare the payload (object to json)
        //send the req

        //step 3
        //validate response (json string- object)
        //firstname
        //status code
        //time response

        Faker faker = new Faker();
        String firstname= faker.name().firstName();

        Booking booking = new Booking();
        booking.setFirstname(faker.name().firstName());
        booking.setLastname("Khanna");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-03-01");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("breakfast");
        System.out.println(booking);

        //this is object we need to convert it in json

        Gson gsonbuilder = new GsonBuilder().setPrettyPrinting().create();
        String jsonbooking= gsonbuilder.toJson(booking);
        System.out.println(jsonbooking);


        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonbooking).log().all();

        response = requestSpecification.when().post();
        String jsonResponseString = response.asString();

        //validate response

        validatableResponse= response.then().log().all();
        validatableResponse.statusCode(200);
        //deserializatiom
        BookingResponse bookingresponseobject= gsonbuilder.fromJson(jsonResponseString,BookingResponse.class);

        assertThat(bookingresponseobject.getBookingid()).isNotNull();
//        assertThat(bookingresponseobject.getBooking().getFirstname()).isEqualTo(firstname);



    }
}

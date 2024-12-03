package Others.RestAssuredPractise;

import io.opentelemetry.api.trace.StatusCode;
import io.restassured.response.Response;
import org.testng.annotations.*;

import static io.restassured.RestAssured.*;

public class SecondPractisePost {
    @Test
    public void postTest(){
        baseURI = "http://localhost:3000/";
        given().get("users?page=2").
                then().statusCode(200);
        Response response = get("users?page=2");
        System.out.println(response.getStatusCode());


    }
}

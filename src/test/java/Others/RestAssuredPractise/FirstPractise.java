package Others.RestAssuredPractise;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class FirstPractise {
    @Test
    public void firstTest(){
        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
    }
    @Test
    public void secondTest(){
        baseURI = "https://reqres.in/api/";
        given().get("users?page=2").
                then().
                body("data[1].id",equalTo(8));
    }

    @Test
    public void thirdTest(){
        baseURI = "https://reqres.in/api/";
        given().get("users?page=2").
                then().body("data[1].first_name",equalTo("Lindsay"));
    }



}

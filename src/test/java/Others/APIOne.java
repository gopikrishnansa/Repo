package Others;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIOne {
    public static void main(String[] args) {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.statusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());

    }
}

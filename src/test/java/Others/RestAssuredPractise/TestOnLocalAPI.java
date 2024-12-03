package Others.RestAssuredPractise;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class TestOnLocalAPI {
    @Test
    public void get(){
        baseURI = "http://localhost:3000/";
        given().get("users").
                then().statusCode(200).log().all();
    }

    @Test
    public void post(){
        JSONObject request = new JSONObject();


        request.put("firstName","Thomas");
        request.put("lastName","Edison");
        request.put("subjectId","99");
        baseURI = "http://localhost:3000/";

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())

                .when()
                    .post("users")
                    .then()
                    .statusCode(201);
    }


}

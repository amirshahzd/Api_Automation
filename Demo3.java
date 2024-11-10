package RestAssuredDemo;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Demo3 {

    public static HashMap map = new HashMap<>();

    String   empname = restUtils.get_Name();
    String   empemail = restUtils.get_email();
    int emp_id = 128848;

    @BeforeClass
    public void put_request(){

        map.put("name","empname");
        map.put("email","empemail");

        RestAssured.baseURI="https://gorest.co.in/public/v2/comments";
        RestAssured.basePath="/update/"+emp_id;

    }
    @Test
    public void tesput(){
        given()
                .contentType("application/json")
                .body(map)
                .when()
                .put()
                .then()
                .statusCode(200)
                .log().all();
    }
}

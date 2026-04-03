package RestAssured;

import RestAssured.entity.PostUser;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.sessionId;
import static org.hamcrest.Matchers.equalTo;

public class RestApiTest {
    @BeforeEach
    public void setup (){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
    }
    @Test
    public void myFirstGetRequest (){
        given().get("/posts/1").then().statusCode(200).body("userId", equalTo(1)).log().all().body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
    }
    @Test
    public void mySecondRequest (){
        String bodyRequest = """
                {
                  "userId": 1,
                  "id": 1,
                  "title": "gay",
                  "body": "gaygay"
                }
                """;
        PostUser postUser = new PostUser(1, "gay", "gaygay", 1);
        //given().log().all().contentType("application/json").body(bodyRequest).post("/posts").then().log().all().statusCode(201);
        given().contentType("application/json").body(postUser).when().post("/posts").then().log().all().statusCode(201);
    }
    @Test
    public void myDeleteRequest (){
    given().delete("/posts/1").then().statusCode(200);
    }
    @Test
    public void myPutRequest (){
        String bodyRequest = """
                {
                  "userId": 1,
                  "id": 1,
                  "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                  "body": "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"
                }
                """;
        given().contentType("application/json").body(bodyRequest).put("/posts/1").then().statusCode(200);
    }
}

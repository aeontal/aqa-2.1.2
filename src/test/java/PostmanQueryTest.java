import io.restassured.http.ContentType;

import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostmanQueryTest {


    @Test
    public void postmanTestPostRequest(){

        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Проверка") // отправляемые данные (заголовки и query можно выставлять аналогично)

                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("data", equalTo("Проверка"))
        ;


    }

}

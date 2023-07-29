package name.nikolaikochkin.book;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class BookResourceTest {

    @Test
    void hello() {
        given()
                .when().get("/api/books")
                .then()
                .statusCode(200)
                .body(is("Hello Book"));
    }
}
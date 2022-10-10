package com.sanlea.study;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class GreetingResourceTest {

    private GreetingResource greetingResource;

    @BeforeEach
    void setup() {
        this.greetingResource = new GreetingResource();
    }

    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/greeting/hello")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

    @Test
    void testHello() {
        var message = this.greetingResource.hello();
        assertEquals("Hello RESTEasy", message);
    }

    @Test
    void testShowMeTheMoney() {
        var message = this.greetingResource.showMeTheMoney();
        assertEquals("Show me the money", message);
    }

}
package org.tests;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GetPetTest {


    @Test
    public void testPetId() {
        RestAssured.given().baseUri("https://petstore.swagger.io/v2").
                when().get("/pet/112233").then().log().all();
    }
}

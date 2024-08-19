package tests;

import baseUrl.BaseUrlPetLeo;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;

import org.testng.annotations.Test;
import org.json.JSONObject;
import io.restassured.http.ContentType;
import testDatas.PetLeoData;

public class ApiTask_Post_Registration extends BaseUrlPetLeo {

    @Test
    public void postRegistration() {

        // set up path params with using baseUrl
        specPetLeo.pathParams("pp1", "v1", "pp2", "accounts");

        // Create request body dynamically using test data and the email constant
        String email = "test13@petleo.net";
        JSONObject reqBody = PetLeoData.petLeoRegistrationReqData(email, "xxxxxx", "en", null);

        Response response = given()
                .spec(specPetLeo)
                .contentType(ContentType.JSON)
                .body(reqBody.toString())
                .when()
                .post("/{pp1}/{pp2}/");

        // logging for the response
        System.out.println("Response Body: " + response.getBody().asString());

        // Assert the response
        response.then().assertThat()
                .statusCode(201)
                .contentType("application/json")
                .body("email", equalTo(email))
                .body("id", notNullValue())
                .body("country_code", nullValue());

        // Additional logging if registration complete or not
        String responseEmail = response.jsonPath().getString("email");
        if (email.equals(responseEmail)) {
            System.out.println("User successfully registered with email: " + responseEmail);
        } else {
            System.out.println("Registration failed or email does not match. Received email: " + responseEmail);
        }
    }
}


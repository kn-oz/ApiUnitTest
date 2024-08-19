package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class BaseUrlPetLeo {

    protected RequestSpecification specPetLeo;

    @BeforeClass
    public void setUp() {
        specPetLeo = new RequestSpecBuilder()
                .setBaseUri("https://api-development.petleo.de")
                .build();
    }
}


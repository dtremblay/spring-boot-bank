package com.datsystems.mybank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matchers.*;
//import static io.restassured.module.jsv.JsonSchemaValidator.*;

@SpringBootTest
@AutoConfigureMockMvc
public class TransactionComponentTest {
    
    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void endToEndRestAssuredTest() {
        RestAssured.defaultParser = Parser.JSON;
        
        given().mockMvc(mockMvc)
            .when()
                .get("/transactions/1234")
            .then()
                .assertThat().status(HttpStatus.OK);
    }
}

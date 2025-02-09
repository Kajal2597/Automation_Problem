package petstore;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Petclass {

    @Test
    public void UserCreate(){
        Response response=RestAssured.given()
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "  \"id\": 1,\n" +
                        "  \"username\": \"kajal2001\",\n" +
                        "  \"firstName\": \"kajal\",\n" +
                        "  \"lastName\": \"gaikwad\",\n" +
                        "  \"email\": \"k@gmail.com\",\n" +
                        "  \"password\": \"12345\",\n" +
                        "  \"phone\": \"97633354826\",\n" +
                        "  \"userStatus\": 0\n" +
                        "}")
                .when()
                .post("https://petstore.swagger.io/v2/user");
        response.prettyPeek();
        response.then().statusCode(200);


    }
    @Test

    public void AddPet()
    {
        Response res = RestAssured.given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(" {\n" +
                        "      \"id\": \"3\",\n" +
                        "      \"category\": {\n" +
                        "        \"id\": 3,\n" +
                        "        \"name\": \" Bella\"\n" +
                        "      },\n" +
                        "      \"name\": \"luna doggie\",\n" +
                        "      \"photoUrls\": [\n" +
                        "        \"https://www.google.com/search?q=dog+images&oq=dog+image&gs_lcrp=EgZjaHJvbWUqDggAEEUYJxg7GIAEGIoFMg4IABBFGCcYOxiABBiKBTIGCAEQRRg5Mg0IAhAAGJECGIAEGIoFMgoIAxAAGLEDGIAEMgcIBBAAGIAEMgcIBRAAGIAEMgoIBhAAGLEDGIAEMgcIBxAAGIAEMgcICBAAGIAEMgcICRAAGIAE0gEJNjYzN2oxajE1qAIAsAIA&sourceid=chrome&ie=UTF-8#vhid=vBNC6u0G9lbkqM&vssid=_h2RBZ8f5LrCWseMPyMO4uAM_41\"\n" +
                        "      ],\n" +
                        "      \"tags\": [\n" +
                        "        {\n" +
                        "          \"id\": 3,\n" +
                        "          \"name\": \"doggie\"\n" +
                        "        }\n" +
                        "      ],\n" +
                        "      \"status\": \"available\"\n" +
                        "    }")
                .when()
                .post("https://petstore.swagger.io/v2/pet");
        res.prettyPeek();
        res.then().statusCode(200);

    }
    @Test
    public void Pet_Get()
    {
        //int id= Integer.parseInt("3");

        Response res = RestAssured.given()
                .header("accept", "application/json")
              //  .pathParam("id" ,"3")
                .when()

                .get("https://petstore.swagger.io/v2/pet/3");

        res.prettyPeek();
        res.then().statusCode(200);
    }
    @Test
    public void Pet_Put() {
        Response res = RestAssured.given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"id\": 1,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 1,\n" +
                        "    \"name\": \"update dog stark\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"string\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 1,\n" +
                        "      \"name\": \"stark\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")
                .when()

                .put("https://petstore.swagger.io/v2/pet");

        res.prettyPeek();
        res.then().statusCode(200);
    }
    @Test
    public void Pet_Delete() {
        Response res = RestAssured.given()
                .header("accept", "application/json")
                //.queryParam("id" ,"3")
                .when()

                .delete("https://petstore.swagger.io/v2/pet/3");

        res.prettyPeek();
        res.then().statusCode(200);
    }


}

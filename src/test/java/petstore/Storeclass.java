package petstore;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Storeclass {
    @Test
    public void Add_Store() {
        Response res = RestAssured.given()
                .header("accept", "application/json")
               .header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"id\": 3,\n" +
                        "  \"petId\": 3,\n" +
                        "  \"quantity\": 2,\n" +
                        "  \"shipDate\": \"2024-11-25T08:07:22.329Z\",\n" +
                        "  \"status\": \"placed\",\n" +
                        "  \"complete\": false\n" +
                        "}")
                .when()
                .post("https://petstore.swagger.io/v2/store/order");
        res.prettyPeek();
        res.then().statusCode(200);
    }
    @Test
    public void Get_Store() {
        Response res = RestAssured.given()
                .header("accept", "application/json")
               // .queryParam("id" ,"1")
                .when()

                .get("https://petstore.swagger.io/v2/store/order/3");

        res.prettyPeek();
        res.then().statusCode(200);
    }
    @Test
    public void Get_Inventory() {
        Response res = RestAssured.given()
                .header("accept", "application/json")
                .queryParam("id" ,"1")
                .when()

                .get("https://petstore.swagger.io/v2/store/inventory");

        res.prettyPeek();
        res.then().statusCode(200);
    }

//    public void Json_Put() {
//        Response res = RestAssured.given()
//                .header("accept", "application/json")
//                .body("  {\n" +
//                        "      \"id\": \"1\",\n" +
//                        "      \"title\": \"software testing\",\n" +
//                        "      \"author\": \"namrata\"\n" +
//                        "    }")
//                .when()
//
//                .put("http://localhost:3000/store/order/1");
//
//        res.prettyPeek();
//        res.then().statusCode(200);
//    }
    @Test
    public void Json_Delete() {
        Response res = RestAssured.given()
                .header("accept", "application/json")
               // .queryParam("id" ,"4")
                .when()

                .delete("https://petstore.swagger.io/v2/store/order/3");

        res.prettyPeek();
        res.then().statusCode(200);
    }


}
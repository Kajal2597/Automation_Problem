package petstore;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UserClass {
    @Test
    public void Add_User() {
        Response res = RestAssured.given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"id\": 1,\n" +
                        "  \"username\": \"kajal2001\",\n" +
                        "  \"firstName\": \"kajal\",\n" +
                        "  \"lastName\": \"gaikwad\",\n" +
                        "  \"email\": \"kajal@gmail.com\",\n" +
                        "  \"password\": \"123445@12\",\n" +
                        "  \"phone\": \"161646468\",\n" +
                        "  \"userStatus\": 1\n" +
                        "}")
                .when()
                .post("https://petstore.swagger.io/v2/user");
        res.prettyPeek();
        res.then().statusCode(200);
    }
    @Test
    public void Get_User() {
      //  String username="kajal2001";
        Response res = RestAssured.given()
                .header("accept", "application/json")
            // .queryParam("user" ,"kajal2001")
                .when()

                .get("https://petstore.swagger.io/v2/user/kajal2001");

        res.prettyPeek();
        res.then().statusCode(200);
    }

    @Test
    public void GetLogin() {

        Response response = RestAssured.given()
                .header("accept", "application/json")
                // .header("Content-Type", "application/json")
//                .pathParam("un","kajal2001")
//                .pathParam("pass","kajal@12")
                .queryParam("u", "kajal2001")
                .queryParam("p", "123445@12")
//                .queryParam()
//                .queryParam()
                .when()
//              .get("https://petstore.swagger.io/v2/user/login?username={un}&password={pass}");
                .get("https://petstore.swagger.io/v2/user/login");

        response.prettyPeek();
        response.then().statusCode(200);

    }
    @Test
    public void Logout() {

        Response response = RestAssured.given()
                .header("accept", "application/json")
                .queryParam("u", "kajal2001")


                .get("https://petstore.swagger.io/v2/user/logout");
        response.prettyPeek();
        response.then().statusCode(200);
    }

@Test
        public void Update_User() {
        Response response = RestAssured.given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"id\": 1,\n" +
                        "    \"username\": \"kajal2001" +
                        "1\",\n" +
                        "    \"firstName\": \"kaju\",\n" +
                        "    \"lastName\": \"gaikwad\",\n" +
                        "    \"email\": \"k@gmail.com\",\n" +
                        "    \"password\": \"123445@12\",\n" +
                        "    \"phone\": \"9552146226\",\n" +
                        "    \"userStatus\": 1\n" +
                        "}")
                .when()
                .put("http://petstore.swagger.io/v2/user/kajal2001");
        response.prettyPeek();


       // res.then().statusCode(200);
    }
    @Test
    public void User_Delete() {
        Response res = RestAssured.given()
                .header("accept", "application/json")
                .queryParam("id" ,"1")
                .when()

                .delete("http://petstore.swagger.io/v2/user/kajal2001");

        res.prettyPeek();
        res.then().statusCode(200);
    }

}
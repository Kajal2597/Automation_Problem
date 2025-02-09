package db.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDB {
    public static Connection con;

   @BeforeMethod
    public Connection setup() throws SQLException {
        try {

            String url = "jdbc:mysql://localhost:3306/demo1";
            String username = "root";
            String pwd = "Kajal@2001";

            con = DriverManager.getConnection(url, username, pwd);
        } catch (SQLException sql) {
            System.out.println((sql.getErrorCode()));
            System.out.println(sql.getSQLState());
            System.out.println(sql.getMessage());
            sql.printStackTrace();

        }
        return con;

    }

//    @AfterMethod
//    public void tearDown() throws SQLException{
//        con.close();
//}

}
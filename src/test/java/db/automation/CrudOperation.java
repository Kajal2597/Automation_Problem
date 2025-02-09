package db.automation;

import db.base.BaseDB;
import org.testng.annotations.Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudOperation extends BaseDB {
    @Test
    public void DB_Test_CreateTable() throws SQLException
    {
        PreparedStatement ps=con.prepareStatement("create table Emp(id int primary key, name varchar(20),age int)");
        ps.executeUpdate();
        System.out.println("Succesfully table Created");

    }
    @Test
    public  void DB_Test_Insert() throws SQLException
    {
        con=this.setup();
        PreparedStatement ps=con.prepareStatement("insert into Emp values(?,?,?)");
        ps.setInt(1,4);
        ps.setString(2,"shreyAa");
        ps.setInt(3,20);
        ps.executeUpdate();
        System.out.println("Succesfully inserted Records");

         DB_Test_SelectQuery();
    }

    @Test
    public  void DB_Test_Update() throws SQLException {
        con = this.setup();
        PreparedStatement ps = con.prepareStatement("update emp set name='kajal' where id=108");
        ps.executeUpdate();
        System.out.println("Succesfully Updated Records");
        DB_Test_SelectQuery();

    }
    @Test
    public  void DB_Test_Delete() throws SQLException {
        con = this.setup();
        PreparedStatement ps = con.prepareStatement("Delete * from emp where id=108");
        System.out.println("Succesfully Deleted");

    }
    @Test
    public  void DB_Test_SelectQuery() throws SQLException {
        con = this.setup();
        PreparedStatement ps = con.prepareStatement("select * from emp");

        ResultSet resultSet = ps.executeQuery();
                     while (resultSet.next()) {
                         int id =resultSet.getInt("id");
                         String name  = resultSet.getNString("name");
                         int age = resultSet.getInt("age");
                         System.out.println("ID: " + id + "Name :" + name + " Age:" + age);
                     }
//                     System.out.println("successfully....");
    }

}

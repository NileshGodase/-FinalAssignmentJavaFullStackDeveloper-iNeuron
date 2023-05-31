import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import  java.sql.*;
import java.util.Properties;

public class JdbcMysqlCon {

    public static void main(String[] args) {


        // instance variables
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        // step 1&2 - class loading and driver registration
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Class loaded and Driver is registered successfully...");
        } catch (ClassNotFoundException ce){
            ce.printStackTrace();
        }

        // step 3 - Establish connection between java program and mysql workbench
        try{
            FileInputStream fis = new FileInputStream(new File("C:\\Users\\ASUS\\IdeaProjects\\JDBC-Statement11\\src\\properties\\application.properties"));
            Properties properties = new Properties();
            properties.load(fis);

            connection = DriverManager.getConnection(properties.getProperty("url"),
                    properties.getProperty("username"),
                    properties.getProperty("password"));
            System.out.println("Connection established succesfully...");
        }
        catch (IOException | SQLException ie){
            ie.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

        // step 4 - create statement object and execute sql query
        try{
            statement = connection.createStatement();
            String sqlQuery = "select * from MyTable";
            resultSet = statement.executeQuery(sqlQuery);

            System.out.print("\nsid\t"+"sname\t"+"sage\t"+"saddress\n");

            while (resultSet.next()){
                Integer sid = resultSet.getInt(1);
                String sname = resultSet.getString(2);
                Integer sage = resultSet.getInt(3);
                String saddress = resultSet.getString(4);

        // step 5 -processing resultSet
                System.out.print(sid+"\t"+sname+"\t"+sage+"\t\t"+saddress);
                System.out.println();
            }

        }catch (SQLException se){
            se.printStackTrace();
        }



    }

}

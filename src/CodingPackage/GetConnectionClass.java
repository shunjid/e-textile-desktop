package CodingPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnectionClass
{
     Connection connection=null;
     public Connection databaseConnection(String Instance,String Pin)
     {
         try 
         {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String ConnectionURL = "jdbc:sqlserver://localhost:1433;databaseName=TextileIndustry;user="+Instance+";password="+Pin;
             connection = DriverManager.getConnection(ConnectionURL);
             
             if(connection!=null)
             {
                 return connection;
             }
             else
             {
                 return null;
             }
         }
         catch (ClassNotFoundException | SQLException e) 
         {
             
             return null;
         }
     }
}

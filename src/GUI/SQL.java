package GUI;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class SQL {

public  Statement sql;


     {
            try{
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //加载数据库驱动

     }
        catch(ClassNotFoundException ex){
          System.out.println(ex);
     }
          try{
               Connection con;

               ResultSet rs;
               String url,userName,userPwd;
               // 连接数据库的语句
               url="jdbc:sqlserver://192.168.1.105:1433;DatabaseName=Hospital";

               userName="admin";
               userPwd="123456";
               con=DriverManager.getConnection(url,userName,userPwd);
               sql=con.createStatement();
               System.out.println("数据库连接成功");
     }
          catch(SQLException exp){
               System.out.println(exp);
               System.out.println("数据库连接失败");
          }




}



}



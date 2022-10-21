package GUI;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.List;

public class SQL {
     static Connection conn;
     List<patient> empList;
     static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
     static final String DB_URL = "jdbc:sqlserver://localhost;DatabaseName=Hospital";
     static Statement sql;
     static final String USER = "admin";
     static final String PASS = "123456";

         {
               try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //加载数据库驱动

               } catch (ClassNotFoundException ex) {
                    System.out.println(ex);
               }
               String url = "jdbc:sqlserver://192.168.1.105:1433;DatabaseName=Hospital";
               try {


                    ResultSet rs;

                    String userName;
                    String userPwd;
                    // 连接数据库的语句
                    url = "jdbc:sqlserver://192.168.1.103:1433;DatabaseName=Hospital";

                    userName = "sa";
                    userPwd = "123456";
                    conn = DriverManager.getConnection(url, userName, userPwd);
                    sql = conn.createStatement();
                    System.out.println("数据库连接成功");
               } catch (SQLException exp) {
                    System.out.println(exp);
                    System.out.println("数据库连接失败");
               }


          }
        /*  Connection conn = null;
          QueryRunner queryRunner = new QueryRunner();

          //Step 1: Register JDBC driver
          DbUtils.loadDriver(JDBC_DRIVER);

          //Step 2: Open a connection
          System.out.println("Connecting to database...");
          conn = DriverManager.getConnection(DB_URL, USER, PASS);
          //String s = "SELECT * FROM patient";

          ResultSetHandler<List<patient>> resultHandler = new BeanListHandler<patient>(patient.class);

          // List<patient> empList = QueryRunner.query(con, "SELECT * FROM employees", resultHandler);
          //List<patient> empList = QueryRunner.query(conn, s, resultHandler);
          try {
               List<patient> empList = queryRunner.query(conn, "SELECT * FROM patient", resultHandler);
               for(patient emp: empList ) {

                    //Display values
                    System.out.print("ID: " + emp.getPatient_dept());

               }
          } finally {


     }*/

  public  ResultSet ShowTable(String s) {//显示表格
      /*将数据库封装成一个ResultSet类型
      * s是表名
      */
      ResultSet rs;
      {
          try {
              rs = sql.executeQuery("select * from "+s);
          } catch (SQLException e) {
              throw new RuntimeException(e);
          }
      }
      return rs;
  }
    public  void Update(String s1,String s2,String s3,int id) {//修改
        /**
         * s1代表需要修改的表名
         * s2代表需要修改的列名
         * s3代表修改之后的数据
         * id代表数据的id
         */
        int alter;
        {
            try {
                alter = sql.executeUpdate("UPDATE " +s1+ " set " +s2+ " = "+ "'" +s3+ "'" +"where patient_id ="+id );
                System.out.println("修改成功");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public  void Insert(String...name) {//增加
        /**
       不定参数增加列
         */
        int alter;

        {
            try {
                alter = sql.executeUpdate("INSERT into" +name[1]);
                System.out.println("修改成功");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}





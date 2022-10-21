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
         * sql1.Update("patient","patient_name","刘二狗",20);//改-测试
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
    public  void Insert(String s1,int i,String...values) throws SQLException {//增加
        /**
         * s1是表名
         * i是需要设置的id名
         * values是需要增加的数值列表，用String[]数组
         * sql1.Insert("Login",0,"996","11111");//增加-测试
         */
      int alter;
    switch (s1){
        case "patient":
            patient p1 = new patient(i,values[0],values[1],values[2],values[3],values[4],values[5],values[6]);
           alter = sql.executeUpdate("INSERT into " + s1 + p1.list() + " values " + p1.set());//list已知，set需设置
        case "Login":
            login l1 = new login(values[0],values[1] );
           alter = sql.executeUpdate("INSERT into " + s1 + l1.list() + " values " + l1.set());//list已知，set需设置
            System.out.println("增加成功");
    }

    }
    public void delete(String s1,String s2,String s3) throws SQLException {
        /**
         * s1是表名
         * s2是提交的列名
         * s3是提交的数据
         * sql1.delete("Login","Login_name","996");//删除-测试
         */
        int alter;
        alter = sql.executeUpdate("DELETE FROM "+s1+" WHERE "+s2+" = "+s3);
        System.out.println("删除成功");
    }
}





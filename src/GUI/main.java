package GUI;


import java.sql.SQLException;



public class main {
    public static void main(String[] args) throws SQLException {


        SQL sql1 =   new SQL();

       /*
       *模拟表格封装成json测试，封装在source/*.json
       * ResultSet r1 =  sql1.ShowTable("Login");
        ToJson.resultSetToJson(r1,"Login");*/

        //模拟修改测试
       /* sql1.Update("patient","patient_name","刘二狗",20);//改-测试
       sql1.Insert("Login",0,"996","11111");//增加-测试
        sql1.delete("Login","Login_name","996");//删除-测试
        */







    }
}

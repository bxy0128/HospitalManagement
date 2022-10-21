package GUI;


import com.google.gson.Gson;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;



public class main {
    public static void main(String[] args) throws SQLException {

       // new loginFrame();
       // System.out.println(mainwindow.rs);
       /* while(mainwindow.rs.next()){
            String id =mainwindow.rs.getString("Login_name");
            String name = mainwindow.rs.getString("Password");
            System.out.printf("Login_name=%s Password=%s\n",id,name);
        }*/
        SQL sql1 =   new SQL();
       /*ResultSet r1 =  sql1.ShowTable("Login");
        ToJson.resultSetToJson(r1,"Login");*/

        //模拟修改测试
       // sql1.Update("patient","patient_name","刘二狗",20);//改-测试
       // sql1.Insert("Login",0,"996","11111");//增加-测试
       // sql1.delete("Login","Login_name","996");//删除-测试





       // System.out.println(mainwindow.resultSetToJson(mainwindow.rs));





    }
}

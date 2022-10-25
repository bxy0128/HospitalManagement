package GUI.Data_Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //自动设置方法
@AllArgsConstructor //有参构造器
@NoArgsConstructor //无参构造器
public class Medicine {
    private int medicine_id;//药物编号
    private String medicine_name;//药物姓名
    private Double medicine_price;//药物价格
    private int medicine_quantify;//药物数量
    public String set(){
        String s = new String();
        s = "("+medicine_id+","+medicine_name+","+ medicine_price+","+ medicine_quantify+  ")" ;
        //在数据库查询中，需要用到的(值1，值2，值3...)
        return s;

    }
    public String list(){
        String s = new String();
        s = "(medicine_id,medicine_name,medicine_price,medicine_quantify)" ;
        return s;

        //在数据库查询中，需要用到(列名1，列名2，列名3...)

    }
}

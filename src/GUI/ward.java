package GUI;

public class ward {
    /**
     * 病房的信息_数据库各列名
     */

    private String patient_name;
    private String ward_dept;
    private int ward_id;
    private int ward_bednum;


    public ward() {
    }

    public ward(String patient_name, String ward_dept, int ward_id, int ward_bednum) {
        this.patient_name = patient_name;
        this.ward_dept = ward_dept;
        this.ward_id = ward_id;
        this.ward_bednum = ward_bednum;
    }



    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getWard_dept() {
        return ward_dept;
    }

    public void setWard_dept(String ward_dept) {
        this.ward_dept = ward_dept;
    }

    public int getWard_id() {
        return ward_id;
    }

    public void setWard_id(int ward_id) {
        this.ward_id = ward_id;
    }

    public int getWard_bednum() {
        return ward_bednum;
    }

    public void setWard_bednum(int ward_bednum) {
        this.ward_bednum = ward_bednum;
    }


    public String set(){
        String s = new String();
        s = "("+patient_name+","+ward_dept+","+ ward_id+","+ ward_bednum+")" ;
        //在数据库查询中，需要用到(列名1，列名2，列名3...)
        return s;
    }
    public String list(){
        String s = new String();
        s = "(patient_name,ward_dept,ward_id,ward_bednum)" ;
        return s;
        //在数据库查询中，需要用到的(值1，值2，值3...)

    }


}



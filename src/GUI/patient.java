package GUI;

public class patient {
    private int patient_id;
    private String patient_name;
    private String patient_gender;
    private String patient_date_start;
    private String patient_dept;
    private String patient_state;
    private String patient_doc;
    private String patient_room;

    public patient() {
    }

    public patient(int patient_id, String patient_name, String patient_gender, String patient_date_start, String patient_dept, String patient_state, String patient_doc, String patient_room) {
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.patient_gender = patient_gender;
        this.patient_date_start = patient_date_start;
        this.patient_dept = patient_dept;
        this.patient_state = patient_state;
        this.patient_doc = patient_doc;
        this.patient_room = patient_room;
    }

    /*public patient(int patient_id, String patient_name, String patient_gender, String patient_date_start, String patient_dept, String patient_state, String patient_doc, String patient_room) {
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.patient_gender = patient_gender;
        this.patient_date_start = patient_date_start;
        this.patient_dept = patient_dept;
        this.patient_state = patient_state;
        this.patient_doc = patient_doc;
        this.patient_room = patient_room;
    }*/

    /**
     * 获取
     * @return patient_id
     */
    public int getPatient_id() {
        return patient_id;
    }

    /**
     * 设置
     * @param patient_id
     */
    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    /**
     * 获取
     * @return patient_name
     */
    public String getPatient_name() {
        return patient_name;
    }

    /**
     * 设置
     * @param patient_name
     */
    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    /**
     * 获取
     * @return patient_gender
     */
    public String getPatient_gender() {
        return patient_gender;
    }

    /**
     * 设置
     * @param patient_gender
     */
    public void setPatient_gender(String patient_gender) {
        this.patient_gender = patient_gender;
    }

    /**
     * 获取
     * @return patient_date_start
     */
    public String getPatient_date_start() {
        return patient_date_start;
    }

    /**
     * 设置
     * @param patient_date_start
     */
    public void setPatient_date_start(String patient_date_start) {
        this.patient_date_start = patient_date_start;
    }

    /**
     * 获取
     * @return patient_dept
     */
    public String getPatient_dept() {
        return patient_dept;
    }

    /**
     * 设置
     * @param patient_dept
     */
    public void setPatient_dept(String patient_dept) {
        this.patient_dept = patient_dept;
    }

    /**
     * 获取
     * @return patient_state
     */
    public String getPatient_state() {
        return patient_state;
    }

    /**
     * 设置
     * @param patient_state
     */
    public void setPatient_state(String patient_state) {
        this.patient_state = patient_state;
    }

    /**
     * 获取
     * @return patient_doc
     */
    public String getPatient_doc() {
        return patient_doc;
    }

    /**
     * 设置
     * @param patient_doc
     */
    public void setPatient_doc(String patient_doc) {
        this.patient_doc = patient_doc;
    }

    /**
     * 获取
     * @return patient_room
     */
    public String getPatient_room() {
        return patient_room;
    }

    /**
     * 设置
     * @param patient_room
     */
    public void setPatient_room(String patient_room) {
        this.patient_room = patient_room;
    }

/*public String settojson(){
       String s =  "[
    {
        "patient_id" : patient_id,
        "patient_name" : patient_name,
        "patient_gender" : patient_gender,
        "patient_date_start": patient_date_start,
        "patient_dept" : patient_dept,
        "patient_state" : patient_state,
        "patient_doc ": patient_doc,
        "patient_room" : patient_room
    }
                ]"";
}*/
    public String set(){
        String s = new String();
        s = "("+patient_id+","+patient_name+","+ patient_gender+","+ patient_date_start+","+ patient_dept+","+ patient_state+","+ patient_doc+","+ patient_room+")" ;
return s;

    }
    public String list(){
        String s = new String();
        s = "(patient_id,patient_name,patient_gender,patient_date_start,patient_dept,patient_state,patient_doc,patient_room)" ;
        return s;

    }


}

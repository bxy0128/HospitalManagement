package GUI;

public class login {
    String Login_name;
    String Password;

    public login() {
    }

    public login(String Login_name, String Password) {
        this.Login_name = Login_name;
        this.Password = Password;
    }

    /**
     * 获取
     * @return Login_name
     */
    public String getLogin_name() {
        return Login_name;
    }

    /**
     * 设置
     * @param Login_name
     */
    public void setLogin_name(String Login_name) {
        this.Login_name = Login_name;
    }

    /**
     * 获取
     * @return Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * 设置
     * @param Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String set(){
        String s = new String();
        s = "("+Login_name+","+Password+")";
        return s;

    }
    public String list(){
        String s = new String();
        s = "(Login_name,Password)" ;
        return s;

    }
}

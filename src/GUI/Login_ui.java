package GUI;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class Login_ui {

    public static void main(String[] args) {
        new loginFrame();
    }
}

class loginFrame extends JFrame implements ActionListener{

    JLabel userName,userPwd,tubiao;//用户名 密码 图标
    JTextField nameField;//用户名
    JPasswordField pwdField;//密码
    JButton button;//按钮
    JTabbedPane choose;//选择
    JPanel panel1,panel2;
    loginFrame(){
        setBackground(Color.blue);//背景橘色

       tubiao=new JLabel(new ImageIcon("source/beijing.jpeg"));

        add(tubiao,BorderLayout.NORTH);
        userName=new JLabel("账号",JLabel.CENTER);
        userPwd=new JLabel("密码",JLabel.CENTER);
        nameField=new JTextField(8);//账号名8位
        pwdField=new JPasswordField(8);//密码名8位
        panel1=new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setOpaque(false);
        choose=new JTabbedPane();
        choose.add("登录界面",panel1);
        panel1.setLayout(new GridLayout(2,2));
        panel1.add(userName);
        panel1.add(nameField);
        panel1.add(userPwd);
        panel1.add(pwdField);
        //panel2.add(panel1);
        add(choose,BorderLayout.CENTER);
        button=new JButton("登陆");
        add(button,BorderLayout.SOUTH);
        button.addActionListener(this);
        //小图标
        getLayeredPane().setLayout(null);

       setResizable(false);
        ImageIcon tubiao=new ImageIcon("source/tubiao.jpeg");
        setIconImage(tubiao.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(400,150,800,560);
        setTitle("医院管理系统");
        validate();
    }


    public void actionPerformed(ActionEvent e){
        String name,pwd;
        name=nameField.getText();
        pwd=pwdField.getText();

        SQL sql1 =   new SQL();

        ResultSet rs;
        try {
            rs=sql1.sql.executeQuery("select * from Login where Login_name = "+name+" and Password= "+pwd+" ");//对应自己数据库建的表填写
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        int q=0;
        while(true){
            try {
                if (!rs.next()) break;
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            q++;
        }
        if(q>0){
            JOptionPane.showMessageDialog(this, "登陆成功！","消息对话框",JOptionPane.WARNING_MESSAGE);
            this.dispose();
            System.out.println("登录成功");
            new MainWindow();
        }
        else
            JOptionPane.showMessageDialog(this, "账号或者密码错误!","消息对话框",JOptionPane.WARNING_MESSAGE);
    }


}
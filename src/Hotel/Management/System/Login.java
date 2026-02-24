package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField textfield1;
    JPasswordField passwordField1;
    JButton b1,b2;   //global declaration coz we going outside constructor

    public Login(){

        JLabel label1= new JLabel("username");
        label1.setBounds(40,80,100,30);
        label1.setFont(new Font("Tahoma",Font.BOLD,20));
        add(label1);

        textfield1=new JTextField();
        textfield1.setBounds(170,80,200,26);
        textfield1.setFont(new Font("Tahoma",Font.PLAIN,20 ));
        textfield1.setBackground(Color.lightGray);
        textfield1.setForeground(Color.BLACK);
        add(textfield1);

        JLabel label2= new JLabel("password");
        label2.setBounds(40,130,100,30);
        label2.setFont(new Font("Tahoma",Font.BOLD,20));
        add(label2);

        passwordField1=new JPasswordField();
        passwordField1.setBounds(170,130,200,26);
        passwordField1.setBackground(Color.lightGray);
        passwordField1.setForeground(Color.BLACK);
        add(passwordField1);

        ImageIcon imageIcon= new ImageIcon(ClassLoader.getSystemResource("icon/loading.gif"));
        Image i1= imageIcon.getImage().getScaledInstance(255,300,Image.SCALE_DEFAULT);
        JLabel imglabel= new JLabel(imageIcon);
        imglabel.setBounds(380,30,255,300);
        add(imglabel);

        b1= new JButton("Login");
        b1.setBounds(40,200,120,30);
        b1.setFont(new Font("serif",Font.PLAIN,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        b2= new JButton("Cancel");
        b2.setBounds(180,200,120,30);
        b2.setFont(new Font("serif",Font.PLAIN,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);

        getRootPane().setDefaultButton(b1);

        getContentPane().setBackground(Color.lightGray);
        setLayout(null);
        setTitle("Login");
        setLocation(400,150);
        setSize(660,400);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){           //figure which button triggered this
            try{
                DBConnection c= new DBConnection();
                String user = textfield1.getText();
                String pass= passwordField1.getText();

                String q= "select * from login where username='"+user+"' and password ='"+pass+"' ";
                ResultSet resultset= c.statement.executeQuery(q);
                if(resultset.next()){
                    new Dashboard();
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid");
                }
            }catch(Exception e1){
                e1.printStackTrace();
            }

        }
        else{
            System.exit(102); //any int number
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}

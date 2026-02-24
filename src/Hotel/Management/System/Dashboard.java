package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class Dashboard extends JFrame implements ActionListener{

    JButton add,rec;

    public Dashboard(){
        super("Hotel Management System");

        rec = new JButton("Reception");
        rec.setBounds(425,510,140,30);
        rec.setFont(new Font("Tahoma",Font.BOLD,20));
        rec.setBackground(Color.BLACK);
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        add(rec);

        add = new JButton("Admin");
        add.setBounds(880,510,140,30);
        add.setFont(new Font("Tahoma",Font.BOLD,20));
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        ImageIcon imageIconadmin = new ImageIcon(ClassLoader.getSystemResource("icon/admin.jpg"));
        Image iadmin= imageIconadmin.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imageadmin=new ImageIcon(iadmin);
        JLabel labeladd= new JLabel(imageadmin);
        labeladd.setBounds(850,320,200,195);
        add(labeladd);

        ImageIcon imageIconreception = new ImageIcon(ClassLoader.getSystemResource("icon/reception.jpg"));
        Image ireception= imageIconreception.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imagereception=new ImageIcon(ireception);
        JLabel labelreception= new JLabel(imagereception);
        labelreception.setBounds(400,320,200,195);
        add(labelreception);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/dashboard.gif"));
        Image i1= imageIcon.getImage().getScaledInstance(1920,1080, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(0,0,1920,1080);
        add(label);

        setLayout(null);
        setSize(1920,1080);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==rec){
            new Reception();
            setVisible(false);
        }else {
            new Login2();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
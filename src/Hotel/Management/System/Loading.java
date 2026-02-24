package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame {
    public Loading(){
        ImageIcon imageicon= new ImageIcon(ClassLoader.getSystemResource("icon/loading.gif"));
        JLabel label = new JLabel(imageicon);
        add(label);
        setLayout(new FlowLayout());
        setLocation(300,100);
        setSize(825,670);
        setVisible(true);
        setTitle("HotelManagementSystem");

        try{
            Thread.sleep(3000); //time after which frame close
            new Login();
            setVisible(false);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Loading();
    }
}



import java.awt.*;
import javax.swing.*;

public class frame{
    public static void main(String[] args) {
    new gui();
    }
}

class gui extends JFrame   {

    JPanel jp;
    JLabel jl;
    JTextField jt;
    JButton jb,jb1;

    public gui()
    {
        setLayout(null);   
     jp= new JPanel();
     jp.setBounds(2, 30, 500, 300);
     jp.setLayout(null);
     jp.setBackground(Color.DARK_GRAY);
     add(jp);

     jl = new JLabel("name");
     jl.setForeground(Color.white);
     jl.setBounds(2,10,80,25);
     jp.add(jl);

     jt =new JTextField();
     jt.setBounds(120,10,100,25);
     jt.setBackground(Color.white);
     jp.add(jt);

     jb = new JButton("submit");
     jb.setBounds(125, 100, 90, 25);
     
     jp.add(jb);

     jb1 = new JButton("cancle");
     jb1.setBounds(225, 100, 90, 25);
     jp.add(jb1);
        

        setDefaultCloseOperation(EXIT_ON_CLOSE);       
        setLocationRelativeTo(null);        
        setVisible(true);
        setSize(500,500);
    }

}

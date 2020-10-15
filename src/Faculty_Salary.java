import utilities2.Connection2;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;


public class Faculty_Salary extends JFrame{ 
    public JLabel head, h1,h2,h3,h4,h5,h6,h7,h8,l1,l2,l3,l4,l5,l6,l7,l8;
    public JLabel s1,s2,s3,s4,s5,s6,s7,s8;
    public JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    public JLabel bc1,bc2,bc3,bc4,bc5,bc6;
    public JLabel bb1,bb2,bb3,bb4,bb5,bb6;
    public JLabel bs1,bs2,bs3,bs4,bs5,bs6;
    public JLabel m1,m2,m3,m4;
    public JLabel mc1,mc2,mc3,mc4;
    public JLabel mt1,mt2,mt3,mt4;
    
    public Faculty_Salary(){
        setLayout(null);
        setBounds(20,20,1000,300);
        setBackground(Color.WHITE);
        head = new JLabel("  Faculty Salary Structure ");
        head.setFont(new Font("Trabuchet MS" ,Font.BOLD,30));
        head.setBounds(300,10,400,40);
        
        h1 = new JLabel(" Course ");
        h1.setBounds(30,100,100,30);
        
        h2 = new JLabel("B-Tech");
        h2.setBounds(140,100,100,30);
        
        h3 = new JLabel(" BCA ");
        h3.setBounds(250,100,100,30);
        
        h4 = new JLabel(" BBA ");
        h4.setBounds(360,100,100,30);
        
        h5 = new JLabel(" BSC ");
        h5.setBounds(470,100,100,30);
        
        h6 = new JLabel(" MBA ");
        h6.setBounds(580,100,100,30);
        
        h7 = new JLabel(" MCA ");
        h7.setBounds(690,100,100,30);
        
        h8 = new JLabel(" M-Tech ");
        h8.setBounds(800,100,100,30);
        
        s1 = new JLabel("Per Semester");
        s1.setBounds(30,160,100,30);
        
        b1 = new JLabel(" 25000");
        b1.setBounds(140,160,100,30);
 
        bc1 = new JLabel(" 35000");
        bc1.setBounds(250,160,100,30);
         
        bb2 = new JLabel("45000");
        bb2.setBounds(360,160,100,30);
        
        bb3 = new JLabel("55000");
        bb3.setBounds(470,160,100,30);
        
        bb4 = new JLabel("65000");
        bb4.setBounds(580,160,100,30);
        
        s2 = new JLabel("75000");
        s2.setBounds(690,160,100,30);
        
        s3 = new JLabel("85000");
        s3.setBounds(800,160,100,30);
        
        
       
        
                
         add(h1);
         add(h2);
         add(h3);
         add(h4);
         add(h5);
         add(h6);
         add(h7);
         add(h8);
         add(s1);add(s2);add(s3);
         add(b1);
         add(bc1);
         add(bb2); add(bb3); add(bb4);
        add(head);
    }
    
    public static void main(String s[]) {
        new Faculty_Salary().setVisible(true);
    }
}

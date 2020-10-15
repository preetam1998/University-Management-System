import utilities2.Connection2;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;


public class Fee_Structure extends JFrame{ 
    public JLabel head, h1,h2,h3,h4,h5,h6,h7,h8,l1,l2,l3,l4,l5,l6,l7,l8;
    public JLabel s1,s2,s3,s4,s5,s6,s7,s8;
    public JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    public JLabel bc1,bc2,bc3,bc4,bc5,bc6;
    public JLabel bb1,bb2,bb3,bb4,bb5,bb6;
    public JLabel bs1,bs2,bs3,bs4,bs5,bs6;
    public JLabel m1,m2,m3,m4;
    public JLabel mc1,mc2,mc3,mc4;
    public JLabel mt1,mt2,mt3,mt4;
    
    public Fee_Structure(){
        setLayout(null);
        setBounds(20,20,1000,1000);
        setBackground(Color.WHITE);
        head = new JLabel("  Fees   Structure");
        head.setFont(new Font("Trabuchet MS" ,Font.BOLD,30));
        head.setBounds(300,10,400,40);
        
        h1 = new JLabel(" Course ");
        h1.setBounds(30,50,100,30);
        
        h2 = new JLabel("B-Tech");
        h2.setBounds(140,50,100,30);
        
        h3 = new JLabel(" BCA ");
        h3.setBounds(250,50,100,30);
        
        h4 = new JLabel(" BBA ");
        h4.setBounds(360,50,100,30);
        
        h5 = new JLabel(" BSC ");
        h5.setBounds(470,50,100,30);
        
        h6 = new JLabel(" MBA ");
        h6.setBounds(580,50,100,30);
        
        h7 = new JLabel(" MCA ");
        h7.setBounds(690,50,100,30);
        
        h8 = new JLabel(" M-Tech ");
        h8.setBounds(800,50,100,30);
        
        s1 = new JLabel("Semester 1");
        s1.setBounds(30,100,100,30);
        
        s2 = new JLabel("Semester 2");
        s2.setBounds(30,150,100,30);
        
        s3 = new JLabel("Semester 3");
        s3.setBounds(30,200,100,30);
        
        s4 = new JLabel("Semester 4");
        s4.setBounds(30,250,100,30);
        
        s5 = new JLabel("Semester 5");
        s5.setBounds(30,300,100,30);
        
        s6 = new JLabel("Semester 6");
        s6.setBounds(30,350,100,30);
        
        s7 = new JLabel("Semester 7");
        s7.setBounds(30,400,100,30);
       
        s8 = new JLabel("Semester 8");
        s8.setBounds(30,450,100,30);
        
        b1 = new JLabel(" 25000");
        b1.setBounds(140,100,100,30);
        
        b2 = new JLabel("25000");
        b2.setBounds(140,150,100,30);
        
        b3 = new JLabel("25000");
        b3.setBounds(140,200,100,30);
        
        b4 = new JLabel("25000");
        b4.setBounds(140,250,100,30);
       
        b5 = new JLabel("25000");
        b5.setBounds(140,300,100,30);
        
        b6 = new JLabel("25000");
        b6.setBounds(140,350,100,30);
        
        b7 = new JLabel("25000");
        b7.setBounds(140,400,100,30);
       
        b8 = new JLabel("25000");
        b8.setBounds(140,450,100,30);
        
        bc1 = new JLabel(" 35000");
        bc1.setBounds(250,100,100,30);
        
        bc2 = new JLabel("35000");
        bc2.setBounds(250,150,100,30);
        
        bc3 = new JLabel("35000");
        bc3.setBounds(250,200,100,30);
        
        bc4 = new JLabel("35000");
        bc4.setBounds(250,250,100,30);
       
        bc5 = new JLabel("35000");
        bc5.setBounds(250,300,100,30);
        
        bc6 = new JLabel("35000");
        bc6.setBounds(250,350,100,30);
        
        bb1 = new JLabel("45000");
        bb1.setBounds(360,100,100,30);
        
        bb2 = new JLabel("45000");
        bb2.setBounds(360,150,100,30);
        
        bb3 = new JLabel("45000");
        bb3.setBounds(360,200,100,30);
        
        bb4 = new JLabel("45000");
        bb4.setBounds(360,250,100,30);
       
        bb5 = new JLabel("45000");
        bb5.setBounds(360,300,100,30);
        
        bb6 = new JLabel("45000");
        bb6.setBounds(360,350,100,30);
        
                
         add(h1);
         add(h2);
         add(h3);
         add(h4);
         add(h5);
         add(h6);
         add(h7);
         add(h8);
         add(s1);
         add(s2);
         add(s3);
         add(s4);
         add(s5);
         add(s6);
         add(s7);
         add(s8);
         add(b1);
         add(b2);
         add(b3);
         add(b4);
         add(b5);
         add(b6);
         add(b7);
         add(b8);
         add(bc1);
         add(bc2);
         add(bc3);
         add(bc4);
         add(bc5);
         add(bc6);
         add(bb1);add(bb2);add(bb3);add(bb4);add(bb5);add(bb6);
        add(head);
    }
    
    public static void main(String s[]) {
        new Fee_Structure().setVisible(true);
    }
}

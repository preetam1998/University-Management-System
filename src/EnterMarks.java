
import utilities2.Connection2;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;

public class EnterMarks extends JFrame implements ActionListener{
    public JLabel lb,lb1,lb2,lb3,lb4;
    public JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t14,t13,t12,t11;
    public JButton b1,b2,b3,b4;
    public JComboBox<String> c1;
    static int number = 1000;
    
    
    Random ran = new Random();
    long first4 = (ran.nextLong()%9000L) +1000L;
    long first = Math.abs(first4);
    
    
    public EnterMarks() throws HeadlessException {
       
        super("Filling Marks of Student");
        setLocation(75,75);
        setSize(600,600);
        setLayout(null);
        setBackground(Color.white);
        
        lb1 = new JLabel("Fill  Marks  Of  Student");
        lb1.setFont(new Font("Verdana",Font.ITALIC,30));
        lb1.setBounds(100,10,400,50);
       
        lb2 = new JLabel("Enter The Roll No :");
        lb2.setBounds(100, 120, 150, 30);
        lb2.setBackground(Color.RED);
        
        try{
            Connection c = Connection2.getConnection();
            String q3 = "SELECT * FROM student ;";
            PreparedStatement ps = c.prepareStatement(q3);
            ResultSet rs = ps.executeQuery();
            int i=0;
            while(rs.next()){
                i++;
            }
            String roll[] = new String[i];
            i = 0;
            rs.beforeFirst();
            while(rs.next() ) {
                roll[i] = rs.getString("Roll no.");
                i++;
            }
            c1 = new JComboBox<String>(roll);
            c1.setBounds(270, 120, 150, 30);
        }catch(Exception e) {
        e.printStackTrace();}
        
        
        lb3 = new JLabel("Enter The Subject :");
        lb3.setBounds(100, 200, 200, 30);
        lb3.setBackground(Color.white);
        lb4 = new JLabel("Enter The Marks :");
        lb4.setBounds(300, 200, 200, 30);
        lb4.setBackground(Color.white);
        
        t2 = new JTextField();
        t2.setBounds(100,240,200,30);
        t3 = new JTextField();
        t3.setBounds(100,270,200,30);
        t4 = new JTextField();
        t4.setBounds(100,300,200,30);
        t5 = new JTextField();
        t5.setBounds(100,330,200,30);
        t6 = new JTextField();
        t6.setBounds(100,360,200,30);
                
        t7 = new JTextField();
        t7.setBounds(300,240,200,30);
        t8 = new JTextField();
        t8.setBounds(300,270,200,30);
        t9 = new JTextField();
        t9.setBounds(300,300,200,30);
        t10 = new JTextField();
        t10.setBounds(300,330,200,30);
        t11 = new JTextField();
        t11.setBounds(300,360,200,30);
        
        
        b1 = new JButton("Submit   The   Marks   Of   Student");
        b1.setFont(new Font("Verdana",Font.BOLD,18));
        b1.setBounds(100,420,400,40);
        b1.addActionListener(this);
        
       add(lb1);
       add(lb2);
       add(lb4);
       add(lb3);
       add(b1);
      
       add(t2);
       add(t3);
       add(t4);
       add(t5);
       add(t6);
       add(t7);
       add(t8);
       add(t9);
       add(t10);
       add(t11);
       add(c1);
       
       

      
       
    }
    
    public void actionPerformed(ActionEvent ae) {
        String a = (String)c1.getSelectedItem();
        
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String ff = t6.getText();
        
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        String j = t10.getText();
        String k = t11.getText();
      
    
        
        if(ae.getSource() == b1) {
            try{
             String q1 = "insert into fillmark values('" +a+ "','" +bb+ "','"+g+ "')";
             String q2 = "insert into fillmark values('" +a+ "','" +c+ "','"+h+ "')";
             String q3 = "insert into fillmark values('" +a+ "','" +d+ "','"+i+ "')";
             String q4 = "insert into fillmark values('" +a+ "','" +e+ "','"+j+ "')";
             String q5 = "insert into fillmark values('" +a+ "','" +ff+ "','"+k+ "')";

             Connection cc =  Connection2.getConnection();
             PreparedStatement ps = cc.prepareCall(q1);
             PreparedStatement ps1 = cc.prepareCall(q2);
             PreparedStatement ps2= cc.prepareCall(q3);
             PreparedStatement ps3 = cc.prepareCall(q4);
             PreparedStatement ps4 = cc.prepareCall(q5);
             ps.executeUpdate(q1);
             ps1.executeUpdate(q2);
             ps2.executeUpdate(q3);
             ps3.executeUpdate(q4);
             ps4.executeUpdate(q5);
             JOptionPane.showMessageDialog(null,"Marks Added");
             this.setVisible(false);

         }catch(SQLException w) {
             w.printStackTrace();
           }
        }
        
        if(ae.getSource() == b2){
            System.exit(0);
        }
        
    
    }
    public static void main(String a[]) {
        new EnterMarks().setVisible(true);
    
    }
}
    
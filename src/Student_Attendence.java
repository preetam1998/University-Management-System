import utilities2.Connection2;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;


public class Student_Attendence extends JFrame implements ActionListener{
      
    public JLabel lb,lb1,lb2;
    public JButton b1,b2;
    public JComboBox<String> c1,c2,c3;
    
    public Student_Attendence(){
        setBounds(100,100,400,400);
        setLayout(null);
        
        lb = new JLabel("Select Roll No");
        lb.setFont(new Font("Verdana",Font.ITALIC,20));
        lb.setBounds(0,20,150,50);
       
        lb1 = new JLabel("First Half");
        lb1.setFont(new Font("Verdana",Font.ITALIC,20));
        lb1.setBounds(0, 120, 150, 30);
        lb1.setBackground(Color.RED);
        
        lb2 = new JLabel("Second Half");
        lb2.setFont(new Font("Verdana",Font.ITALIC,20));
        lb2.setBounds(0, 210, 150, 30);
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
                roll[i] = rs.getString("Roll");
                i++;
            }
            c1 = new JComboBox<String>(roll);
            c1.setBounds(230, 30, 150, 30);
        }catch(Exception e) {
        e.printStackTrace();}
        
        String present[] = {"Present","Absent"};
        c2 = new JComboBox<String>(present);
        c2.setBounds(230, 120, 150, 30);
            
        c3 = new JComboBox<String>(present);
        c3.setBounds(230, 210, 150, 30);
        
        b1 = new JButton(" Submit ");
        b1.setFont(new Font("Verdana",Font.BOLD,18));
        b1.setBounds(0,320,200,40);
        b1.addActionListener(this); 
        
        
        b2 = new JButton(" Cancel ");
        b2.setFont(new Font("Verdana",Font.BOLD,18));
        b2.setBounds(180,320,200,40);
        b2.addActionListener(this);
        
        
        add(lb);add(lb1);add(lb2);
        add(c1); add(c2); add(c3);
        add(b1);
        add(b2);
    }
    
     public void actionPerformed(ActionEvent ae) {
         
        String a = (String)c1.getSelectedItem();     
        String b = (String)c2.getSelectedItem();
        String c = (String)c3.getSelectedItem();

        if(ae.getSource() == b1) {
            try{
             java.util.Date dt = new java.util.Date();
             long num  = dt.getTime();
             java.sql.Date date = new java.sql.Date(num);
             String q1 = "insert into student_attendence values('" +a+ "','" +b+ "','"+c+ "','"+date+ "')";
             Connection cc =  Connection2.getConnection();
             PreparedStatement ps = cc.prepareCall(q1);        
             ps.executeUpdate(q1);
             JOptionPane.showMessageDialog(null,"Attendence Added");
             this.setVisible(false);

         }catch(SQLException w) {
             w.printStackTrace();
           }
        }
        
        if(ae.getSource() == b2){
            System.exit(0);
        }
        
    
    }
     public static void main(String s[]) {
        new Student_Attendence().setVisible(true);
    }
}

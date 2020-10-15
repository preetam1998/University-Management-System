

import utilities2.Connection2;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;

public class Student_Detail extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3;
    JTable t1;
    JPanel p1;
    JButton b1,b2,b3;
    JTextField tf1;
    String head[] = {"Name","Father's Name","Age"," DOB","Address","Mobile","Email","XTH %","XIIth %","Aadher No.","Emp Id","Course","Branch"};
    String d[][] = new String[25][13];
    int i= 0 ,j = 0;
    //name, father's name, age, dob, address, mobile, email, xth%, xiith%, aadhar no., emp id, course, branch
    public Student_Detail()  {
        
        super("Update the Detail of Student");
        setLayout(null);
        setBounds(60,50,1200,650);
        
         try{
            Connection c = Connection2.getConnection();
            String q3 = "SELECT * FROM student ";
            PreparedStatement ps = c.prepareStatement(q3);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                d[i][j++] = rs.getString("name");
                d[i][j++] = rs.getString("father's name");
                d[i][j++] = rs.getString("age");
                d[i][j++] = rs.getString("dob");
                d[i][j++] = rs.getString("address");
                d[i][j++] = rs.getString("mobile");
                d[i][j++] = rs.getString("email");
                d[i][j++] = rs.getString("xth%");
                d[i][j++] = rs.getString("xiith%");
                d[i][j++] = rs.getString("aadhar");
                d[i][j++] = rs.getString("Roll");
                d[i][j++] = rs.getString("course");
                d[i][j++] = rs.getString("branch");
                i++;
                j=0;
            }
        //name, father's name, age, dob, address, mobile, email, xth%, xiith%, aadhar no, Roll no, course, branch 
        }catch(Exception e) {
        e.printStackTrace();}
        t1 = new JTable(d,head);
        JScrollPane jsp = new JScrollPane(t1);
        jsp.setBounds(0,0,1200,350);
        // Creating the new panel....
        tf1 = new JTextField(10);
        tf1.setBounds(400,400,200,35);
    
        l1 = new JLabel("Enter Roll No to Delete the Student  :");
        l1.setBounds(20,400,400,35);
        l1.setFont(new Font("senserif",Font.BOLD,20));
        l1.setBackground(Color.YELLOW);
   
        l2 = new JLabel("ADD   New   Student :");
        l2.setBounds(20,450,400,35);
        l2.setFont(new Font("senserif",Font.BOLD,20));
        l2.setBackground(Color.YELLOW);
        
        l3 = new JLabel("Update Detail Of Student :");
        l3.setBounds(20,500,400,35);
        l3.setFont(new Font("senserif",Font.BOLD,20));
        l3.setBackground(Color.YELLOW);
        
        b1 = new JButton("Delete");
        b1.setFont(new Font("senserif",Font.BOLD,20));
        b1.setBounds(620,400,100,35);
        
        b2 = new JButton("  Add  ");
        b2.setFont(new Font("senserif",Font.BOLD,20));
        b2.setBounds(400,450,200,35);
        
        b3 = new JButton("  Update  ");
        b3.setFont(new Font("senserif",Font.BOLD,20));
        b3.setBounds(400,500,200,35);
        
        
        
        add(l1);add(l2);add(l3);
        add(jsp);
        add(tf1);
        add(b1);add(b2);add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
    }
      public void actionPerformed(ActionEvent ae) {
        
        Connection c = Connection2.getConnection();
        String a = tf1.getText();
        if(ae.getSource() == b1) {
            try{
                String q1 = "delete from student where Roll='"+a+"'";
                PreparedStatement ps = c.prepareCall(q1);
                ps.executeUpdate();
                this.setVisible(false);
                new Student_Detail().setVisible(true);

         }catch(Exception w) {
             w.printStackTrace();
           }
        }
        else if(ae.getSource() == b2) {
            this.setVisible(false);
            new New_Student().setVisible(true);
        }else if(ae.getSource() == b3) {
            this.setVisible(false);
            new Student_Update().setVisible(true);
        }

    }
    public static void main(String a[]) {
        new Student_Detail().setVisible(true);
    }
    
}

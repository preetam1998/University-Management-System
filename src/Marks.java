
import utilities2.Connection2;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;

public class Marks extends JFrame implements ActionListener{
    public JTextArea t1;
    public JPanel p1;
    public JButton b1;
   
    public Marks(){}
    
    public Marks(String str){
    
        setSize(600,700);
        setLayout(new BorderLayout());
        setVisible(true);
        p1 = new JPanel();
        t1 = new JTextArea(30,15);
        JScrollPane jsp = new JScrollPane(t1);
        t1.setFont(new Font("Trabuchet MS",Font.BOLD,15));
        add(p1,"North");
        add(jsp,"Center");
        b1 = new JButton("Close    The     Window");
        b1.setSize(300,30);
        add(b1,"South");
        b1.addActionListener(this);
        setLocation(20,20);
        mark1(str);
    }
    public void actionPerformed(ActionEvent ae) {
           if(ae.getSource() == b1){
            t1.setText("");
            System.exit(0);
           
           }        }
    public void mark1(String str){
        try{
           
           Connection c = Connection2.getConnection();
           String q1 = "Select * from fillmark where Rollno="+ str;
           PreparedStatement ps = c.prepareCall(q1);
           
           ResultSet rs = ps.executeQuery();
          
           int i = 1;
           if(!rs.next()) {
               t1.setText("Sorry! Selected Roll No,Dost Not Have MerkSheet");
           }
           t1.setText("\t Result of Examination\n\nSubject");
           while(rs.next()) {
              
               t1.append("\n\t" +i+++". " + rs.getString("subject"));
           }
           t1.append("\n\nMarks Obtain");
           rs.beforeFirst();
           i=1;
           while(rs.next()) {
              
               t1.append("\n\t" +i+++". " + rs.getString("mark"));
           }
            
        }catch(Exception e) {
            e.printStackTrace();
           }
    }
   
    
}

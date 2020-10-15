
import utilities2.Connection2;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Random;

public class Student_Fee_Form extends JFrame{
    JLabel lb,lb1,lb2,lb3,lb4,lb5,lb6,lb7;
    JTextField t,t1,t2,t3,t4;
    JButton b1,b2;
    JComboBox<String> c1,c2,c3,c4;
    static int number = 1000;
  
    
    public Student_Fee_Form() {
       
        super("Fee Structure For  Student");
        setLocation(30,30);
        setSize(500,500);
        setLayout(null);
        
        lb = new JLabel("Fee Structure");
        lb.setBounds(140, 0, 300, 40);
        lb.setFont(new Font("senserif",Font.BOLD,30));
        
        lb1 = new JLabel("Roll Number");
        lb1.setBounds(60, 50, 120, 40);
        lb1.setBackground(Color.RED);
        lb1.setFont(new Font("senserif",Font.BOLD,20));
        
        lb2 = new JLabel("Name");
        lb2.setBounds(60, 100, 300, 40);
        lb2.setFont(new Font("senserif",Font.BOLD,20));
        
        lb3= new JLabel("Father's Name");
        lb3.setBounds(60, 150, 300, 40);
        lb3.setFont(new Font("senserif",Font.BOLD,20));
        
        lb4 = new JLabel("Course");
        lb4.setBounds(60, 200, 300, 40);
        lb4.setFont(new Font("senserif",Font.BOLD,20));
        
        lb5 = new JLabel("Branch");
        lb5.setBounds(60, 250, 300, 40);
        lb5.setFont(new Font("senserif",Font.BOLD,20));
        
        lb6 = new JLabel("Semester");
        lb6.setBounds(60, 300, 300, 40);
        lb6.setFont(new Font("senserif",Font.BOLD,20));
        
        lb7 = new JLabel("TotalPayble");
        lb7.setBounds(60, 350, 300, 40);
        lb7.setFont(new Font("senserif",Font.BOLD,20));
        
        
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
            c1.setBounds(250, 55, 150, 30);
        }catch(Exception e) {
        e.printStackTrace();}
        
         
        t1 = new JTextField();
        t1.setBounds(250, 100, 150, 30);
        
        t2 = new JTextField();
        t2.setBounds(250, 150, 150, 30);
        
        t3 = new JTextField();
        t3.setBounds(250, 350, 150, 30);
        
        String course[] = {"B-Tech","BCA","BBA","MBA","BCA"};
        c2 = new JComboBox(course);
        c2.setBounds(250, 200, 150, 30);
        
        String branch[] = {"CSE","ELEC","MECH","MSME","CIVIl"};
        c3 = new JComboBox(branch);
        c3.setBounds(250, 250, 150, 30);
        
        String sem[] = {"1st","2nd","3rd","4th","5th","6th","7th","8th"};
        c4 = new JComboBox(sem);
        c4.setBounds(250, 300, 150, 30);
        
        b1 = new JButton(" Pay ");
        b1.setBounds(60, 400, 100, 40);
        
        b2 = new JButton(" Cancel ");
        b2.setBounds(250, 400, 100, 40);
        
        add(lb1); add(lb); add(lb2); add(lb3); add(lb4); add(lb5); add(lb6); add(lb7);
        add(c1);add(c2);add(c3);add(c4);
        add(t1); add(t2); add(t3); 
        add(b1); add(b2);
      
       
    }
    public static void main(String a[]) {
        new Student_Fee_Form().setVisible(true);
    
    }
}
    
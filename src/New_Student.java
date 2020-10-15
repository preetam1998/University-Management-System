import utilities2.Connection2;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Random;

public class New_Student extends JFrame implements ActionListener{
    JLabel lb,lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13,lb14,lb15,lb16,lb17,lab1,lab,lab2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t14,t13,t12,t11;
    JButton b1,b2,b3,b4;
    JComboBox<String> c1,c2;
    static int number = 1000;
    
    
    Random ran = new Random();
    long first4 = (ran.nextLong()%9000L) +1000L;
    long first = Math.abs(first4);
    
    
    public New_Student() throws HeadlessException {
       
        super("Add New Student");
        setLocation(30,30);
        setSize(705,705);
        setLayout(null);
       
       
        // Adding Image to Frame............
        ImageIcon icn = new ImageIcon(ClassLoader.getSystemResource("image/cambridge.jpg"));
        Image i1 = icn.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        lb15 = new JLabel(i2);
        lb15.setBounds(0,0,700,700);
        add(lb15);
        
        lb14 = new JLabel("Fill The Below Detail Correctly");
        lb14.setFont(new Font("Verdana",Font.BOLD,20));
        lb14.setBounds(130,30,500,50);
       
        lb1 = new JLabel("Name");
        lb1.setBounds(40, 80, 120, 30);
        lb1.setBackground(Color.RED);
        t1 = new JTextField();
        t1.setBounds(100,80,120,30);
        
        lb2 = new JLabel("Father's Name");
        lb2.setBounds(300, 80, 100, 30);
        lb2.setBackground(Color.RED);
        t2 = new JTextField();
        t2.setBounds(400,80,120,30);
        
        lb3 = new JLabel("Age");
        lb3.setBounds(40, 140, 120, 30);
        lb3.setBackground(Color.RED);
        t3 = new JTextField();
        t3.setBounds(100,140,120,30);
        
        lb4 = new JLabel("DOB");
        lb4.setBounds(300, 140, 120, 30);
        lb4.setBackground(Color.RED);
        t4 = new JTextField();
        t4.setBounds(400,140,120,30);
        
        lb5 = new JLabel("Address");
        lb5.setBounds(40, 200, 120, 30);
        lb5.setBackground(Color.RED);
        t5 = new JTextField();
        t5.setBounds(100,200,120,30);
        
        lb6 = new JLabel("Mobile");
        lb6.setBounds(300, 200, 120, 30);
        lb6.setBackground(Color.RED);
        t6= new JTextField();
        t6.setBounds(400,200,120,30);
        
        lb7 = new JLabel("Email Id");
        lb7.setBounds(40, 260, 120, 30);
        lb7.setBackground(Color.RED);
        t7 = new JTextField();
        t7.setBounds(100,260,120,30);
        
        lb8 = new JLabel("(Xth %)");
        lb8.setBounds(300, 260, 120, 30);
        lb8.setBackground(Color.RED);
        t8 = new JTextField();
        t8.setBounds(400,260,120,30);
        
        
        lb9 = new JLabel("(XIIth%)");
        lb9.setBounds(40, 320, 140, 30);
        lb9.setBackground(Color.RED);
        t9 = new JTextField();
        t9.setBounds(100,320,120,30);
        
        lb10 = new JLabel("AADHAR No.");
        lb10.setBounds(300, 320, 120, 30);
        lb10.setBackground(Color.RED);
        t10 = new JTextField();
        t10.setBounds(400,320,120,30);
        
        
        lb11 = new JLabel("Roll No");
        lb11.setBounds(40, 380, 140, 30);
        lb11.setBackground(Color.RED);
        t11 = new JTextField("1000" + first);
        t11.setBounds(100,380,120,30);
        
        
        lb12 = new JLabel("Course");
        lb12.setBounds(300, 380, 120, 30);
        lb12.setBackground(Color.RED);
        String course[] = {"B-Tech","BCA","BBA","MBA","BCA"};
        c1 = new JComboBox(course);
        c1.setBounds(400,380,120,30);
        
        lb13 = new JLabel("Branch");
        lb13.setBounds(40, 440, 120, 30);
        lb13.setBackground(Color.RED);
        String branch[] = {"CSE","ELEC","MECH","MSME","CIVIl"};
        c2 = new JComboBox(branch);
        c2.setBounds(100,440,120,30);
        
        
        b1 = new JButton("Submit");
        b1.setBounds(120,540,100,30);
        
        b2 =  new JButton("Cancel");
        b2.setBounds(320,540,100,30);
        
        b1.addActionListener(this);
        b2.addActionListener(this);

         lb15.add(lb1);
         lb15.add(t1);
         lb15.add(lb2);
         lb15.add(t2);
         lb15.add(lb3);
         lb15.add(t3);
         lb15.add(lb4);
         lb15.add(t4);
         lb15.add(lb5);
         lb15.add(t5);
         lb15.add(lb6);
         lb15.add(t6);
         lb15.add(lb7);
         lb15.add(t7);
         lb15.add(lb8);
         lb15.add(t8);
         lb15.add(lb9);
         lb15.add(t9);
         lb15.add(lb10);
         lb15.add(t10);
         lb15.add(lb11);
         lb15.add(t11); 
         lb15.add(c1);
         lb15.add(lb12);
         lb15.add(c2);
         lb15.add(lb13);
         lb15.add(b1);
         lb15.add(b2);
         lb15.add(lb14);
        
       
    }
    
    public void actionPerformed(ActionEvent ae) {
        String a = t1.getText();
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
        String l = (String)c1.getSelectedItem();
        String m = (String)c2.getSelectedItem();
        
        if(ae.getSource() == b1) {
            try{
             Connection cc = Connection2.getConnection();
             String q1 = "insert into student values('" +a +"','" +bb+ "','" +c+ "','"+d+ "','" +e+"','" +ff+ "','" +g+ "','" +h+ "','" +i+ "','" +j+ "','" +k+ "','" +l+ "','" +m+ "')";
             PreparedStatement ps = cc.prepareCall(q1);
            
             ps.executeUpdate(q1);
             JOptionPane.showMessageDialog(null,"New Student Added");
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
        new New_Student().setVisible(true);
    
    }
}
    
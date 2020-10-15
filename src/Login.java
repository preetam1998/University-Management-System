import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import utilities2.Connection2;



public class Login extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2;
    JPanel p1,p2,p3,p4;
    
    Login() {
        
       super("Login Page");
      
       l1 = new JLabel("Username");
       l2 = new JLabel("Password");
       tf1 = new JTextField(20);
       pf2 = new JPasswordField(20);
      
       ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("icons\\login.png"));
       Image i1 = ic1.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT); 
       b1 = new JButton("Login",new ImageIcon(i1));
       
       ImageIcon ic2 = new ImageIcon(ClassLoader.getSystemResource("icons\\cancel.jpg"));
       Image i2 = ic2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
       b2 = new JButton("Cancel",new ImageIcon(i2));
       
       b1.addActionListener(this);
       b2.addActionListener(this);
       
      ImageIcon ic3 = new ImageIcon(ClassLoader.getSystemResource("icons\\pop.png"));
      Image i3 = ic3.getImage().getScaledInstance(100,150,Image.SCALE_DEFAULT);
      ImageIcon icc3 = new ImageIcon(i3);
      l3 = new JLabel(icc3);
      
      setLayout(new BorderLayout());
      
      p1 = new JPanel();
      p2 = new JPanel();
      p3 = new JPanel();
      p4 = new JPanel();
      
      //Panel First..
      p1.add(l1);
      p1.add(tf1);
      p1.add(l2);
      p1.add(pf2);
      add(p1,BorderLayout.CENTER);
      
      //Second Panel
      p2.add(l3);
     
      add(p2,BorderLayout.WEST);
      
      //Third Panel
      p3.add(b1);
      p3.add(b2);
      add(p3,BorderLayout.SOUTH);
      
      setSize(400,300);
      setLocation(600,400);
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        try{
            Connection cc = Connection2.getConnection();
            String a = tf1.getText();
            String b = pf2.getText();
            String q = "select * from login where username  = '" +a+ "' and password = '" +b+ "'";
            PreparedStatement ps = cc.prepareCall(q);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                new Project().setVisible(true);
                this.setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Login");
                setVisible(false);
            }
        }
        catch(SQLException se) {
            se.printStackTrace();
            }
    }
    
    public static void main(String [] args) {
        new Login().setVisible(true);
    }
}
 
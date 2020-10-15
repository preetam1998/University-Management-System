
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import utilities2.Connection2;

public class Project extends JFrame implements ActionListener{ 

    public Project() throws HeadlessException {
        super("University Management System");
        
        setSize(1500,1500);
        
        /*Adding background Image*/
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("image/cambridge.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1400, 890, Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);
        
        /*First Column */
        JMenuBar mb = new JMenuBar();
        JMenu master = new JMenu("New");
        JMenuItem m2 = new JMenuItem("New_Student");
        JMenuItem m1 = new JMenuItem("New_Teacher");
        master.setForeground(Color.black);
        
        /*-----New  Teacher -------*/
        
        m1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("image/teacher.png"));
        Image image1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('T');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
        m1.setBackground(Color.white);
        
        /*------New Student -----------*/
        
        m2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("image/student.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('S');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
        m2.setBackground(Color.white);
   
        m1.addActionListener(this);
        m2.addActionListener(this);
      
        /*---------Detail of teacher and student-----------*/
        
        JMenu detail = new JMenu("Detail");
        JMenuItem d1 = new JMenuItem("Student_Detail");
        JMenuItem d2 = new JMenuItem("Teacher_Detail");
        detail.setForeground(Color.red);

                /*---------Detail of teacher -----------*/

        d1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("image\\teacherdetail.png"));
        Image image4 = icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        d1.setIcon(new ImageIcon(image4));
        d1.setMnemonic('D');
        d1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        d1.setBackground(Color.white);

                /*---------Detail of student-----------*/

        d2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("image\\studentdetail.png"));
        Image image5 = icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        d2.setIcon(new ImageIcon(image5));
        d2.setMnemonic('E');
        d2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
        d2.setBackground(Color.white);
   
        d2.addActionListener(this);
        d1.addActionListener(this);
        
        /*-----Third column----*/
        
        JMenu attend = new JMenu("Attendence");
        JMenuItem a1 = new JMenuItem("Teacher_Attendence");
        JMenuItem a2 = new JMenuItem("Student_Attendence");

        attend.setForeground(Color.blue);
        
        a1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("image\\attendee.png"));
        Image image7 = icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        a1.setIcon(new ImageIcon(image7));
        a1.setBackground(Color.white);
        
        a2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("image\\attendee.png"));
        Image image8 = icon8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        a2.setIcon(new ImageIcon(image8));
        a2.setBackground(Color.white);
        
        a1.addActionListener(this);
        a2.addActionListener(this);

        /*-----four column----*/   
        
        JMenu update = new JMenu("Update");
        JMenuItem up1 = new JMenuItem("Student_Update");
        JMenuItem up2 = new JMenuItem("Teacher_Update");
        update.setForeground(Color.black);
        
        up1.setFont(new Font("monospaced",Font.PLAIN,12));       
        up1.setBackground(Color.white);
        
        up2.setFont(new Font("monospaced",Font.PLAIN,12));  
        up2.setBackground(Color.white);
        
        up1.addActionListener(this);
        up2.addActionListener(this);
        
        
        /*-----five column----*/  
        JMenu fee = new JMenu("Fee Structure");
        JMenuItem f1 = new JMenuItem("Fee_Structure");
        JMenuItem f2 = new JMenuItem("Faculty_Salary");
        JMenuItem f3 = new JMenuItem("Student_Fee_Form");
        fee.setForeground(Color.blue);
        
        f1.setFont(new Font("monospaced",Font.PLAIN,12));
        f1.setBackground(Color.white);
        
        f2.setFont(new Font("monospaced",Font.PLAIN,12));      
        f2.setBackground(Color.white);
        
        f3.setFont(new Font("monospaced",Font.PLAIN,12));      
        f3.setBackground(Color.white);
        
        f1.addActionListener(this);
        f2.addActionListener(this);
        f3.addActionListener(this);
        /*-----six column----*/
        JMenu exam = new JMenu("Examination");
        JMenuItem e1 = new JMenuItem("Result");
        JMenuItem e2 = new JMenuItem("Marks");
        exam.setForeground(Color.red);
        
        e1.setFont(new Font("monospaced",Font.PLAIN,12));
        e1.setBackground(Color.white);
        
        e2.setFont(new Font("monospaced",Font.PLAIN,12));      
        e2.setBackground(Color.white);
        
        e1.addActionListener(this);
        e2.addActionListener(this);
        
         /*-----seventh column----*/  
        JMenu utility = new JMenu("Utility");
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculater");
        JMenuItem ut3 = new JMenuItem("Web Browser");
        utility.setForeground(Color.black);
        
        ut1.setFont(new Font("monospaced",Font.PLAIN,12));
        ut1.setBackground(Color.white);
        
        ut2.setFont(new Font("monospaced",Font.PLAIN,12));      
        ut2.setBackground(Color.white);
        
        ut3.setFont(new Font("monospaced",Font.PLAIN,12));
        ut3.setBackground(Color.white);
        
        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);
        
        /*-----Fifth column----*/
        JMenu exit = new JMenu("EXIT");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.blue);
        
        /*--------Exit-------*/
        
        ex.setFont(new Font("monospaced",Font.PLAIN,12));
        ex.setBackground(Color.white);
        
        
        ex.addActionListener(this);
        
        //  -------------------------------------------------------------------------------------------------------------
        
        master.add(m1);
        master.add(m2);
        
        detail.add(d1);
        detail.add(d2);
        
        attend.add(a1);
        attend.add(a2);
        
        update.add(up1);
        update.add(up2);
        
        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);
        
        fee.add(f1);
        fee.add(f2);
        fee.add(f3);
                        
        exam.add(e1);
        exam.add(e2);
        
        exit.add(ex);
        
        mb.add(master);
        mb.add(attend);       
        mb.add(detail);
        mb.add(update);
        mb.add(fee);
        mb.add(utility);
        mb.add(exam);
        mb.add(exit);
        
        setJMenuBar(mb);
        
        setFont(new Font("senserif",Font.BOLD,20));
        setLayout(new FlowLayout());
        setVisible(false);
        
    }
   
    public void actionPerformed(ActionEvent ae) {
        
        String msg = ae.getActionCommand();
        if(msg.equals("New_Student")) {
            new New_Student().setVisible(true);
        }else if(msg.equals("New_Teacher")) {
            new New_Teacher().setVisible(true);
        }else if(msg.equals("Student_Attendence")) {
            new Student_Attendence().setVisible(true);
        }else if(msg.equals("Teacher_Attendence")) {
             new Teacher_Attendence().setVisible(true);
        }else if(msg.equals("Student_Detail")) {
             new Student_Detail().setVisible(true);
        }else if(msg.equals("Teacher_Detail")) {
             new Teacher_Detail().setVisible(true);
        }else if(msg.equals("Student_Update")) {
             new Student_Update().setVisible(true);
        }else if(msg.equals("Teacher_Update")) {
             new Teacher_Update().setVisible(true);
        }else if(msg.equals("Student_Fee_Form")) {
             new Student_Fee_Form().setVisible(true);
        }else if(msg.equals("Faculty_Salary")) {
             new Faculty_Salary().setVisible(true);
        }else if(msg.equals("Fee_Structure")) {
             new Fee_Structure().setVisible(true);
        }else if(msg.equals("Marks")) {
             new EnterMarks().setVisible(true);
        }else if(msg.equals("Result")) {
             new ExaminationDetail().setVisible(true);
        }else if(msg.equals("Notepad")) {
          try {
                Runtime.getRuntime().exec("notepad.exe");
          }catch(Exception e) {}
        }else if(msg.equals("Calculater")) {
          try {
                Runtime.getRuntime().exec("calc.exe");
          }catch(Exception e) {}
        }else if(msg.equals("Web Browser")) {
          try {
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
          }catch(Exception e) {}
        }else if(msg.equals("Exit")) {
             System.exit(0);
        }
    }
    public static void main(String a[]) {
        new Project().setVisible(true);
    }
    
}

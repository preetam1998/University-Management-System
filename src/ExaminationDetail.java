
import java.awt.event.*;
import javax.swing.border.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import net.proteanit.sql.DbUtils;
import utilities2.Connection2;
import java.sql.*;


public class ExaminationDetail extends JFrame implements ActionListener{
   
    private final JPanel contentPane;
    private JTable table;
    private JTextField search;
    private JButton b1;
    
    public void Book(){
        try{
            Connection c = Connection2.getConnection();
            PreparedStatement ps = c.prepareCall("Select * from Student");
            ResultSet rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException s) {
            s.printStackTrace();
        }
        
    }
    public ExaminationDetail(){
        
        setBounds(100,100,800,800);
        contentPane  = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JScrollPane sp = new JScrollPane();
        sp.setBounds(120,150,900,350);
        contentPane.add(sp);
        table = new JTable();
        table.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent me) {
                int row = table.getSelectedRow();
                search.setText(table.getModel().getValueAt(row, 10).toString());
            }
        } );
        
        table.setBackground(Color.YELLOW);
        table.setForeground(Color.BLACK);
        table.setFont(new Font("Trabuchet MS",Font.BOLD,15));
        sp.setViewportView(table);
        
        b1 = new JButton("Result");
        b1.addActionListener(this);
       
        b1.setBounds(500,100,140,35);
        contentPane.add(b1);
        
        
        JLabel l1 = new JLabel("    Check   Result    ");
        l1.setBounds(400,5,400,50);
        l1.setFont(new Font("Trabuchet MS",Font.BOLD,35));
        contentPane.add(l1);
        
        search = new JTextField();
        search.setBorder(new LineBorder(new Color(250, 20, 150),2,true));
        search.setBounds(170,100,300,35);
        contentPane.add(search);
        search.setColumns(10);
        
        
        JLabel l3 = new JLabel("Back");
        l3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                setVisible(false);
            }     
        });
        
        l3.setFont(new Font("Trabuchet MS",Font.BOLD,15));
        l3.setBounds(120,100,70,35);
        contentPane.add(l3);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0,128,128),3,true),"Book_Deatil",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(0,128,0)));
        panel.setBounds(70,75,1100,450);
        contentPane.add(panel);
        Book();
        setSize(1200,700);
        
    }
    
    public void actionPerformed(ActionEvent qe) {
        Connection cc = Connection2.getConnection();
        if(qe.getSource()==b1) {
            new Marks(search.getText()).setVisible(true);
        }
    }
    
    public static void main(String s[]) {
        new ExaminationDetail().setVisible(true);
    }
}

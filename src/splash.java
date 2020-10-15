import com.sun.org.apache.bcel.internal.generic.LoadClass;
import javax.swing.*;
import java.awt.*;


public class splash {
    public static void main(String s[]) {
        
        NewFrame f1 = new NewFrame();
        f1.setVisible(true);
        int i,x = 1;
        for(i = 1; i<680; i= i+4,x += 2){
             f1.setLocation(700-(i+x)/2,500-(i/2));
             f1.setSize(i+x,i);
        try{
            Thread.sleep(10);
            }
        catch(Exception e) {
            e.printStackTrace();
            }
        }
    }       
}
 

class NewFrame extends JFrame implements Runnable{
    Thread t;
    public NewFrame() {
        super("WelCome To University");
        setLayout(new FlowLayout());
        ImageIcon icn = new ImageIcon(ClassLoader.getSystemResource("image\\cambridge.jpg"));
        Image i1 = icn.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel l1 = new JLabel(i2);
        add(l1);
        t = new Thread(this);
        t.start();
    }
    
    public void run(){
        try{
            Thread.sleep(7000);
            Login l1 = new Login();
            l1.setVisible(true);
            setVisible(false);

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}


package unitx;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class controls extends JFrame{
    JLabel l1, l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1;
    
    public void setControls(){
        l1= new JLabel("Enter Name");
        l2= new JLabel("Enter Password");
        t1 = new JTextField(20);
        p1 = new JPasswordField(20);
        b1 = new JButton("Submit");
        
        
        
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                 t1.setText("");     
                 p1.setText("");
            }
        });
       add(l1); add(t1); add(l2);add(p1); add(b1);
       
       setVisible(true);
       setTitle("Form");
       setLocationRelativeTo(null);
       setSize(250,180);
       setLayout(new FlowLayout());
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
       
    }
    

    
    

    
}

public class u1 {
    public static void main(String[] args) {
        controls c1 = new controls();
        c1.setControls();
        
//-----------------------------------------------------------------        
//        JFrame f = new JFrame("form");
//        
//         
//        JButton b1 = new JButton("Submit");
//        b1.setBounds(100,100,120,20);
//        
//        f.add(b1);
//              
//        
//        f.setSize(500,200);
//        f.setLayout(null);
//        f.setLocationRelativeTo(null);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setVisible(true);
//   
//------------------------------------------------------------------------
        
    }    
}


package unitx;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class NullLayoutExample extends JFrame{
    
    JTextField textField1, textField2;
    JButton addButton;
    JLabel label1, label2;
    
    public void setNullLayout(){
        
        label1 = new JLabel("Enter first num:");
        textField1 = new JTextField();
        
         label2 = new JLabel("Enter second num:");
         textField2 = new JTextField();
         
         addButton = new JButton("Add");
         
         label1.setBounds(20, 20, 100, 25);
         textField1.setBounds(130, 20, 100, 25);
         label2.setBounds(20, 60, 120, 25);
         textField2.setBounds(130, 60, 100, 25);
         addButton.setBounds(130, 100, 100, 30);
         
         
         label1.setBounds(20, 20, 100, 25);
          textField1.setBounds(130, 20, 100, 25);
          label2.setBounds(20, 60, 120, 25);
          textField2.setBounds(130, 60, 100, 25);
          addButton.setBounds(130, 100, 100, 30); 
         
         
              // Adding components to the frame
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(addButton);

        setVisible(true);
        
         
         
        setTitle("Null Layout Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); 
         
        
        
    }
}



public class NullLayoutDemo {
    public static void main(String[] args) {
        NullLayoutExample null1 = new NullLayoutExample();
        null1.setNullLayout();
    }
    
}

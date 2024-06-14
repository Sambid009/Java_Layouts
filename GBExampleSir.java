
package unitx;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ExampleTryGB extends JFrame{
    JLabel label1, label2;
    JTextField num1,num2;
    JButton add;
    
    
    public void setGB(){
        label1 = new JLabel("Enter 1st Number");
        label2 = new JLabel("Enter 2nd Number");
        num1 = new JTextField();
        num2 = new JTextField();
        add = new JButton("Add");
        
        //creating gridBag layout        
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        
        //adding label1 part
        gbc.gridx = 0;
        gbc.gridy=0;
        //gbc.fill = GridBagConstraints.HORIZONTAL;
        add(label1, gbc);
        
        //adding 1st textfield (num1)
        gbc.gridx= 1;
        gbc.gridy=0;
        gbc.gridwidth= 20;
        //gbc.fill = GridBagConstraints.HORIZONTAL;
        add(num1,gbc);
        
        //adding label2 part
        gbc.gridx=0;
        gbc.gridy = 1;
        //gbc.fill =GridBagConstraints.HORIZONTAL;
        add(label2,gbc);
        
                //adding 2nd textfield (num2)
        gbc.gridx= 1;
        gbc.gridy=1;
       // gbc.fill = GridBagConstraints.HORIZONTAL;
        add(num2,gbc);
        
        //adding btn
        gbc.gridx = 3;
        gbc.gridy= 3;
        //gbc.fill = GridBagConstraints.HORIZONTAL;
        add(add, gbc);
        
            setVisible(true);
          setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
                
        
}
}

public class GBExampleSir {
    public static void main(String[] args) {
            ExampleTryGB res11= new ExampleTryGB();
            res11.setGB();
    }
    
}

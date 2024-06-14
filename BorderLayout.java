
package unitx;
import javax.swing.*;
import java.awt.*;
//import.java.awt.event.*;

class BorderL extends JFrame{
    JLabel l1,l2,l3,l4,l5;
    public void setBorderLayout(){
        
        
        // Initializing the labels
        l1 = new JLabel("NORTH", SwingConstants.CENTER);
        l2 = new JLabel("EAST", SwingConstants.CENTER);
        l3 = new JLabel("SOUTH", SwingConstants.CENTER);
        l4 = new JLabel("WEST", SwingConstants.CENTER);
        l5 = new JLabel("CENTER", SwingConstants.CENTER);
        
    // Setting the layout to BorderLayout
        setLayout((LayoutManager) new BorderLayout());

        // Adding the labels to their respective regions
        add(l1, BorderLayout.NORTH);
        add(l2, BorderLayout.EAST);
        add(l3, BorderLayout.SOUTH);
        add(l4, BorderLayout.WEST);
        add(l5, BorderLayout.CENTER);
        
        setVisible(true);
        
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
}
public class BorderLayout {

    static int NORTH;
    static int EAST;
    static int SOUTH;
    static int WEST;
    static int CENTER;
    public static void main(String[] args) {
        

        
         BorderL b1 = new BorderL();
         b1.setBorderLayout();
         
    }
}

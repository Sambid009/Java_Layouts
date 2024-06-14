  package unitx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Grid layout places the component into row and column
//here w e have to specify particular row and column with component
class GridExample extends JFrame {

    JButton b1, b2, b3, b4, b5, b6,b7;

    public void setGrid() {
        b1 = new JButton("button1");
        b2 = new JButton("button2");
        b3 = new JButton("button3");
        b4 = new JButton("button4");
        b5 = new JButton("button5");
        b6 = new JButton("button6");
         b7 = new JButton("button7");

        add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);
        
        setVisible(true);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2,3,13,13));
        //here first two parameters indicates numberof row and colms and last two parameteers indicate horizontal gap and vertical gapbetween each comp
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class GridLayoutDemo {
    
    public static void main(String[] args) {
        GridExample g1 = new GridExample();
        g1.setGrid();
    }

}


package unitx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// GridBagLayout places content in a rectangular grid (i.e., rows and columns). 
// We can specify the coordinates for content placement and the number of cells each component occupies.
// To set properties of the layout, GridBagConstraints is used.



class GridBagExample extends JFrame {
    JButton b1, b2, b3, b4;

    public void setGridBag() {
        b1 = new JButton("Button1");
        b2 = new JButton("Button2");
        b3 = new JButton("Button3");
        b4 = new JButton("Button4");

        // Creating GridBagLayout
        GridBagLayout gbl = new GridBagLayout();
        setLayout(gbl);
        GridBagConstraints gbc = new GridBagConstraints();

        // Adding b1 in coordinate 0,0 and assigning only one cell
        gbc.gridx = 0; // Setting x coordinate
        gbc.gridy = 0; // Setting y coordinate
        gbc.fill = GridBagConstraints.HORIZONTAL; // Inserting content in horizontal direction
        add(b1, gbc);

         //Adding button 2 on coordinate 1,0
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 4; // Allocating 2 cells for b2
        gbc.fill = GridBagConstraints.VERTICAL;
        add(b2, gbc);

        // Adding button b3 on coordinate 0,1
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(b3, gbc);

        // Adding button b4 on coordinate 0,3
       // gbc.gridx = 0;
        //gbc.gridy = 3;
        //gbc.gridwidth = 4;
        //gbc.fill = GridBagConstraints.HORIZONTAL;
        //add(b4, gbc);

        setVisible(true);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class GridBagLayoutExample {
        public static void main(String[] args) {
        GridBagExample gb = new GridBagExample();
        gb.setGridBag();
    }
}

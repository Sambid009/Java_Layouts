package unitx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Card layout places the content as a sequence of cards, i.e., one component is placed after another.
// The first component is visible, whereas the others are hidden.

class CardExample extends JFrame {

    JButton b1, b2, b3, b4;
    JPanel p1;
    CardLayout cl;

    public void setCard() {
        b1 = new JButton("button1");
        b2 = new JButton("button2");
        b3 = new JButton("button3");
        b4 = new JButton("button4");

            p1 = new JPanel();
            cl = new CardLayout();
            p1.setLayout(cl);

        p1.add(b1, "btn1");
        p1.add(b2, "btn2");
        p1.add(b3, "btn3");
        p1.add(b4, "btn4");

        add(p1);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              //to display next component
                cl.next(p1);
                //to display last
               // cl.last(p1);
                //to display back
                //cl.previous(p1);
                //to display of our choice
                //cl.show(p1,"btn3");
            }
        });
          b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.next(p1);  // Display the first component
            }
        });
          b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.last(p1); 
            }
        });
    }
}
        


public class cardLayout {

    public static void main(String[] args) {
        CardExample c11 = new CardExample();
        c11.setCard();
    }
}


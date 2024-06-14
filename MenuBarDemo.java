
package unitx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//stepst o create menu bar and menu items
//create obj of menu bar
//create obj of menu
//create list of object of  menu items
//add menu item to menu and menu to menu bar

class menuExample extends JFrame{
    
    public void setMenu(){
        JMenuBar mb = new JMenuBar();
        
        //creating first menu
        JMenu m1= new JMenu("File");
        //creating list of menu item for m1
        JMenuItem ma1 = new JMenuItem("New Tab");
        JMenuItem ma2 = new JMenuItem("New Window");
        JMenuItem ma3= new JMenuItem("Open");
        
        //inserting menu item into menu
        m1.add(ma1);
        m1.add(ma2);
        m1.add(ma3);
        
        //adding menu into menu bar
        mb.add(m1);
        
        
        //------------------------------------------------
        
        
        //creating checkBox menu item in menu m2
        
        
        //creating seconf menu
        JMenu m2= new JMenu("New");
        
        //creating first menu
        JCheckBoxMenuItem c1= new JCheckBoxMenuItem("Bar1");
        JCheckBoxMenuItem c2= new JCheckBoxMenuItem("Bar2");
        JCheckBoxMenuItem c3= new JCheckBoxMenuItem("Bar3");
        
        
        m2.add(c1);
        m2.add(c2);
        m2.add(c3);
        
        mb.add(m2);
        //-----------------------
        //
        
         JMenu m3= new JMenu("View");
         
         JRadioButtonMenuItem r1 = new JRadioButtonMenuItem("zoom");
         JRadioButtonMenuItem r2 = new JRadioButtonMenuItem("status");
         
         m3.add(r1);
         m3.add(r2);
         
         mb.add(m3);
         
         
          setVisible(true);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        
    
        //here first two parameters indicates numberof row and colms and last two parameteers indicate horizontal gap and vertical gapbetween each comp
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        
        //adding menubar to window
        
        add(mb);
        
        
        
    }
    
}


public class MenuBarDemo {
    
    public static void main(String[] args) {
        menuExample abc = new menuExample();
        abc.setMenu();
    }
    
    
}

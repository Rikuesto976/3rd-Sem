import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MenuEx1 implements ActionListener
{
    JFrame f;
    JMenuBar mb;
    JMenu menu;
    JMenuItem one, two;
    JLabel l;

    public MenuEx1()
    {
        f = new JFrame();
        f.setSize(400, 500);
        mb = new JMenuBar();
        f.setJMenuBar(mb);
        menu = new JMenu("Menu");
        mb.add(menu);
        one = new JMenuItem("One");
        two = new JMenuItem("Two");
        menu.add(one);
        menu.add(two);
        l = new JLabel();
        f.add(l);

        f.setLayout(new FlowLayout());
        f.setVisible(true);
        one.addActionListener(this);
        two.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        String v = e.getActionCommand();
        l.setText(v + " is selected.");
    }

    public static void main(String[] args)
    {
        new MenuEx1();
    }
}
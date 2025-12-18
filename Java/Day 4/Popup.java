import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Popup  extends MouseAdapter implements ActionListener
{
    JFrame f;
    JPopupMenu pop;
    JMenuItem one, two;
    JLabel l;

    public Popup()
    {
        f = new JFrame();
        f.setSize(400, 500);

        pop = new JPopupMenu();
        f.add(pop);       

        one = new JMenuItem("One");
        two = new JMenuItem("Two");
        pop.add(one);
        pop.add(two);

        l = new JLabel();
        f.add(l);

        one.addActionListener(this);
        two.addActionListener(this);
        
        f.addMouseListener(this);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String v = e.getActionCommand();
        l.setText(v + " is selected.");
    }

    public void mouseClicked(MouseEvent e)
    {
        pop.show(f, e.getX(), e.getY());
    }

    public static void main(String[] args)
    {
        new Popup();
    }
}
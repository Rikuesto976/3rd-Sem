import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Popup2 extends MouseAdapter implements ActionListener
{
    JFrame f;
    // JMenuBar mb;
    JMenuItem sa, cut, cp, ps, exit;
    JPopupMenu pop;
    JTextArea ta;

    public Popup2()
    {
        f = new JFrame();
        f.setSize(400, 500);

        // mb = new JMenuBar();
        // f.add(mb);

        pop = new JPopupMenu();
        f.add(pop);
                
        exit = new JMenuItem("Exit");
        sa = new JMenuItem("Select");
        cut = new JMenuItem("Cut");
        cp = new JMenuItem("Copy");
        ps = new JMenuItem("Paste");
        
        pop.add(sa);
        pop.add(cut);
        pop.add(cp);
        pop.add(ps);
        pop.add(exit);

        ta = new JTextArea("Type Here...");
        // ta.setBounds(10, 10, 40, 50);
        f.add(ta);

        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addMouseListener(this);

        sa.addActionListener(this);
        cut.addActionListener(this);
        cp.addActionListener(this);
        ps.addActionListener(this);
        exit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        String choice = e.getActionCommand();
        switch(choice){
            case "Select":
                ta.selectAll();
                break;
            case "Cut":
                ta.cut();
                break;
            case "Copy":
                ta.copy();
                break;
            case "Paste":
                ta.paste();
                break;
            case "Exit":
                System.exit(0);
        }
    }

    public void mouseClicked(MouseEvent e)
    {
        pop.show(f, e.getX(), e.getY());
    }

    public static void main(String[] args)
    {
        new Popup2();
    }
}

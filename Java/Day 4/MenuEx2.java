import javax.swing.*;

import java.awt.FlowLayout;
// import java.awt.*;
import java.awt.event.*;

class MenuEx2 implements ActionListener
{
    JFrame f;
    JMenuBar mb;
    JMenuItem sa, cut, cp, ps, exit;
    JMenu menu;
    JTextArea ta;

    public MenuEx2()
    {
        f = new JFrame();
        f.setSize(400, 500);
        mb = new JMenuBar();
        f.add(mb);

        menu = new JMenu("Menu");
        mb.add(menu);
        f.setJMenuBar(mb);
        
        exit = new JMenuItem("Exit");
        sa = new JMenuItem("Select");
        cut = new JMenuItem("Cut");
        cp = new JMenuItem("Copy");
        ps = new JMenuItem("Paste");
        
        menu.add(sa);
        menu.add(cut);
        menu.add(cp);
        menu.add(ps);
        menu.add(exit);

        ta = new JTextArea("Type Here...");
        // ta.setBounds(10, 10, 40, 50);
        f.add(ta);

        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

    public static void main(String[] args)
    {
        new MenuEx2();
    }
}

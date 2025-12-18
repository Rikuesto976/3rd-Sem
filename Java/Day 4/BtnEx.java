import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;

public class BtnEx {
    JFrame f;
    JButton b1, b2, b3, b4, b5;

    public BtnEx()
    {
        f = new JFrame();
        f.setLayout(new GridBagLayout());

        b1 = new JButton("Btn 1");
        b2 = new JButton("Btn 2");
        b3 = new JButton("Btn 3");
        b4 = new JButton("Btn 4");
        b5 = new JButton("5");
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        gbc.gridx= 0;       gbc.gridy=0;
        gbc.weightx=2;
        f.add(b1, gbc);
        
        gbc.gridx= 1;       gbc.gridy=0;
        f.add(b2, gbc);

        gbc.gridx= 2;       gbc.gridy=0;
        f.add(b3, gbc);

        gbc.gridx= 0;       gbc.gridy=1;
        gbc.gridwidth=3;    
        gbc.ipady=40;
        f.add(b4, gbc);
        
        gbc.insets = new Insets(10, 0,0, 0);
        gbc.gridx= 2;       gbc.gridy=2;
        gbc.ipady = 0;
        gbc.weighty=1;
        gbc.anchor=GridBagConstraints.PAGE_END;
        f.add(b5, gbc);

        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        new BtnEx();
    }
}

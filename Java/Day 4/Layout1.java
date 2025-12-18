//BoxLayout
import javax.swing.*;

class Layout1 
{
    public Layout1()
    {
        JFrame f = new JFrame();
            // f.setSize(400, 500);
        JButton[] btn = new JButton[6];

        for (int i=0; i<6; i++)
        {
            btn[i] = new JButton(" " + (i+1));
            f.add(btn[i]);
        }
        f.setLayout( new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS) ); 
        f.setVisible(true);
        f.pack();
    }
    public static void main(String[] args)
    {
        new Layout1();
    }
}
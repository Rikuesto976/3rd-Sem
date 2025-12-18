import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class GuessNum extends WindowAdapter implements ActionListener 
{
    JFrame f;
    JTextField t;
    JButton b;

    int num, attempts = 0;
    public GuessNum()
    {
        num = (int)(Math.random()*10)+1;
        f = new JFrame();
        f.setSize(400, 500);
        f.setLayout(new FlowLayout());
        f.addWindowListener(this);

        JLabel l= new JLabel("Guess a num from 1-10: ");
        t = new JTextField("Num: ");
        b= new JButton("Guess");

        f.add(l);
        f.add(t);
        f.add(b);
        b.addActionListener(this);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        attempts++;
        try
        {
            int guess = Integer.parseInt(t.getText());

            if(guess==num)
            {
                JOptionPane.showMessageDialog(f, "Correct \n Attempts: "+ attempts);
                resetGame();
            }
            else
            {
                JOptionPane.showMessageDialog(f, "Wrong Guess! Try Again \n Attempts: "+attempts);    
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(f, "Enter Valid Number: ", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void resetGame()
    {
        num = (int)(Math.random()*10)+1;
        attempts=0;
        t.setText("");
    }

    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }

    public static void main(String[] args)
    {
        new GuessNum();
    }
}

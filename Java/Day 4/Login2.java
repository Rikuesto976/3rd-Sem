import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login2 extends WindowAdapter implements ActionListener {
    JFrame first, second;
    JTextField uname;
    JPasswordField pwd;
    JButton btn;

    public void showLogin()
    {
        first = new JFrame("Sign In");
        first.setLayout(new GridBagLayout());

        uname = new JTextField(15);
        pwd = new JPasswordField(15);
        btn = new JButton("Login");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx=0;        gbc.gridy=0;
        first.add(new JLabel("Username "), gbc);

        gbc.gridx=1;        gbc.gridy=0;
        first.add(uname, gbc);

        gbc.gridx=0;        gbc.gridy=1;
        first.add(new JLabel("Password "), gbc);

        gbc.gridx=1;        gbc.gridy=1;
        first.add(pwd, gbc);

        gbc.gridx=0;        gbc.gridy=2;
        gbc.gridwidth=2;  
        first.add(btn, gbc);
        
        btn.addActionListener(this);

        first.setVisible(true);
        first.pack();
        first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   

    public void showDashBoard()
    {
        second = new JFrame("Dashboard");
        second.setSize(300, 300);
        second.add(new JLabel("Hello"));
        second.setVisible(true);

        second.addWindowListener(this);
    }

    public void windowClosing(WindowEvent e)
    {
        int ch = JOptionPane.showConfirmDialog(second, "Do you want to exit: ");
        if (ch == JOptionPane.YES_OPTION)
        {
            second.dispose();
            showLogin();
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        String id = uname.getText();
        String pass = String.valueOf(pwd.getPassword());

        if (id.equals("Ncit") && pass.equals("abc"))
        {
            first.dispose();
            showDashBoard();
        }
        else
        {
            JOptionPane.showMessageDialog(first, "Wrong Credentials");
        }
    }

    public static void main(String[] args)
    {
        new Login2().showLogin();
    }
}

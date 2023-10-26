package com.ProjectExhibition;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.Random;

class CreateLoginForm extends JFrame implements ActionListener
{
    JButton b1;
    JPanel newPanel;
    public int a=9850;
    public int b=9920;
    public int c=9964;
    public int d=9974;
    JLabel userLabel, passLabel;
    final JTextField textField2;
    String[] arr = {"9850", "9920", "9964", "9974"};
    Random r = new Random();
    int randomNumber = r.nextInt(arr.length);
    int ab = Integer.parseInt(arr[randomNumber]);
    String qwe = ab+"";
    CreateLoginForm()
    {
        Icon icon = new ImageIcon("C:\\Users\\Amar\\Desktop\\CAPTCHA IMAGES\\9974.png");
        JButton button1 = new JButton(icon );
        Icon icon2 = new ImageIcon("C:\\Users\\Amar\\Desktop\\CAPTCHA IMAGES\\9920.png");
        JButton button2 = new JButton(icon2);
        Icon icon3 = new ImageIcon("C:\\Users\\Amar\\Desktop\\CAPTCHA IMAGES\\9964.png");
        JButton button3 = new JButton(icon3);
        Icon icon4 = new ImageIcon("C:\\Users\\Amar\\Desktop\\CAPTCHA IMAGES\\9850.png");
        JButton button4 = new JButton(icon4);
        Box box = Box.createVerticalBox();
        box.add(button1);
        box.add(button2);
        box.add(button3);
        box.add(button4);
        add(box, BorderLayout.CENTER);
        JFrame frame = new JFrame();
        frame.add(box);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.setSize(500, 500);
        frame.setVisible(true);
        userLabel = new JLabel();
        userLabel.setText("Select the Matching Image");
        passLabel = new JLabel();
        passLabel.setText(qwe);
        textField2 = new JTextField(15);
        //b1 = new JButton("SUBMIT");
        newPanel = new JPanel(new GridLayout(5, 2));
        newPanel.add(userLabel);
        //newPanel.add(textField1);
        newPanel.add(passLabel);
        //newPanel.add(textField2);
        //newPanel.add(b1);
        add(newPanel, BorderLayout.CENTER);
        //b1.addActionListener(this);
        button1.addActionListener(this);
        button1.setActionCommand("9850");
        button2.addActionListener(this);
        button2.setActionCommand("9920");
        button3.addActionListener(this);
        button3.setActionCommand("9964");
        button4.addActionListener(this);
        button4.setActionCommand("9974");
        setTitle("Captcha");
    }
    public void actionPerformed(ActionEvent ae)
    {
        String passValue = ae.getActionCommand();

        if (passValue.equals(qwe)) {

            NewPage page = new NewPage();

            page.setVisible(true);

            JLabel wel_label = new JLabel("Verified");
            page.getContentPane().add(wel_label);
        }
        else{
            System.out.println("Please enter valid Captcha");
        }
    }
}
class LoginFormDemo
{
    public static void main(String arg[])
    {
        try
        {
            CreateLoginForm form = new CreateLoginForm();
            form.setSize(800,300);
            form.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
class RandArray {
    public static String main(String[] args) {
        String[] arr = {"9850", "9920", "9964", "9974"};
        Random r = new Random();
        int randomNumber = r.nextInt(arr.length);
        int ab = Integer.parseInt(arr[randomNumber]);
        String qwe = ab+"";
        System.out.println(ab);
        return qwe;
    }
}
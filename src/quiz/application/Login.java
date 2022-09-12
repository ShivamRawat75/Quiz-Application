
package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Login extends JFrame implements ActionListener{
    
    JButton rules,back;

    public Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(Color.blue);
        add(heading);
        
        JLabel name=new JLabel("Enter your name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian",Font.BOLD,18));
        name.setForeground(Color.blue);
        add(name);
        
        JTextField tfname=new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
        rules=new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setForeground(Color.WHITE);
        rules.setBackground(Color.blue);
        rules.addActionListener(this);
        add(rules);
        
        back=new JButton("Back");
        back.setBounds(900,270,120,25);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.blue);
        back.addActionListener(this);
        add(back);
                
                
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
        
        
    }
    
    
    
    
    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==rules)
        {
            setVisible(false);
            new Rules();
        }
        else if(ae.getSource()==back)
        {
            setVisible(false);
        }
        
        
    }
    
}

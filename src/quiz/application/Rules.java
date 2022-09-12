
package quiz.application;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Rules extends JFrame{

    public Rules() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        
        JLabel heading=new JLabel("Rules");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(Color.blue);
        add(heading);
        
        
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
        
        
        
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        new Rules();
    }
    
}

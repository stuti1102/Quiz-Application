package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Hello " + name + ",  Welcome to Quiz Master!");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 12));
        rules.setText(
            "<html>"+ 
                "1. There are a total of 10 questions in this quiz." + "<br><br>" +
                "2. Each question carries a weightage of 10 marks. There is no negative marking for incorrect answers." + "<br><br>" +
                "3. You have 20 seconds to answer each question." + "<br><br>" +
                "4. You have one lifeline available: the 50-50 lifeline.You can use this lifeline to eliminate two incorrect options, making it easier for you to choose the correct answer." + "<br><br>" +
                "5. Read each question carefully before selecting your answer." + "<br><br>" +
                "6. Your final score will be calculated based on the number of correct answers.Aim to score as high as possible to prove your knowledge." + "<br><br>" +
                "7. Most importantly, have fun! This quiz is designed to challenge your knowledge and provide an enjoyable experience." + "<br><br>" +
                "8. Best of luck!" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
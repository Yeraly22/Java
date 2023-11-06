import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuS extends Container {
    private JButton calculateButton;
    private JButton taskButton;

    private JButton adwEsButton;
    private JButton exitButton;

    public MainMenuS(){
        setSize(700,500);
        setLayout(null);


        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(150,150,350,30);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.calculateSWindow.setVisible(true);
                Main.frame.menuWindow2.setVisible(false);

            }
        });

        add(calculateButton);


        taskButton = new JButton("Task Planner");
        taskButton.setBounds(150,190,350,30);
        taskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.taskWindow.setVisible(true);
                Main.frame.menuWindow2.setVisible(false);
            }
        });
        add(taskButton);

        adwEsButton = new JButton("Calculator");
        adwEsButton.setBounds(150,230,350,30);
        adwEsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.adwEsWindow.setVisible(true);
                Main.frame.menuWindow2.setVisible(false);
            }
        });
        add(adwEsButton);


        exitButton = new JButton("Exit");
        exitButton.setBounds(150, 270,350, 30);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.first.setVisible(true);
                Main.frame.menuWindow2.setVisible(false);
            }
        });
        add(exitButton);


    }

}

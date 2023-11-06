import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {
    private JButton addButton;
    private JButton listButton;
    private JButton Delete_student;
    private JButton exitButton;

    public MainMenu(){
        setSize(700,500);
        setLayout(null);


        addButton = new JButton("Add");
        addButton.setBounds(150,150,350,30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.addWindow.setVisible(true);
                Main.frame.menuWindow.setVisible(false);

            }
        });

        add(addButton);

        listButton = new JButton("List");
        listButton.setBounds(150,190,350,30);
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.listWindow.setVisible(true);
                Main.frame.menuWindow.setVisible(false);
            }
        });
        add(listButton);
        Delete_student = new JButton("Delete Student");
        Delete_student.setBounds(150, 230,350, 30);
        Delete_student.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.frame.deleteWindow.setVisible(true);
                Main.frame.menuWindow.setVisible(false);
            }
        });
        add(Delete_student);

        exitButton = new JButton("Exit");
        exitButton.setBounds(150,270,350,30);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.first.setVisible(true);
                Main.frame.menuWindow.setVisible(false);
            }
        });
        add(exitButton);


    }

}

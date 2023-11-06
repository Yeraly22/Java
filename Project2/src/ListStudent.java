import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListStudent extends Container {
    public static JTextArea text;
    private JButton buttonLIST;
    private JButton buttonBACK;

    public ListStudent(){
        setSize(700,500);
        setLayout(null);

        text = new JTextArea();
        text.setBounds(190,20,300,350);
        add(text);

        buttonLIST = new JButton("List");
        buttonLIST.setBounds(190,390,150,50);
        buttonLIST.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PackageData pd = new PackageData("List");
                Main.connect(pd);
            }
        });
        add(buttonLIST);


        buttonBACK = new JButton("Back");
        buttonBACK.setBounds(340, 390, 150, 50);
        buttonBACK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.listWindow.setVisible(false);
                Main.frame.menuWindow.setVisible(true);
            }
        });
        add(buttonBACK);

    }
}

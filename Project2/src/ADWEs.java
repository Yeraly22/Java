import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ADWEs extends Container {

    private JLabel num1;
    private JLabel num2;
    private JLabel result;

    private JTextField txtnum1;

    private JTextField txtnum2;
    private JTextField txtresult;

    private JButton mult;


    private JButton divButton;

    private JButton minButton;

    private JButton plusButton;

    private JButton backButton;

    public ADWEs() {
        setSize(800, 600);
        setLayout(null);

        /*
        nameLabel.setBouds()
         */

        num1 = new JLabel("Number1");
        num1.setBounds(150, 50, 150, 30);
        add(num1);

        txtnum1 = new JTextField();
        txtnum1.setBounds(250, 50, 200, 30);
        add(txtnum1);

        num2 = new JLabel("Number2");
        num2.setBounds(150, 90, 150, 30);
        add(num2);

        txtnum2 = new JTextField();
        txtnum2.setBounds(250, 90, 200, 30);
        add(txtnum2);


        result = new JLabel("Result");
        result.setBounds(160, 210, 150, 30);
        add(result);

        txtresult = new JTextField();
        txtresult.setBounds(250, 210, 200, 30);
        add(txtresult);

        plusButton = new JButton("+");
        plusButton.setBounds(100, 150, 100, 30);
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1,num2,tot;
                num1 = Double.parseDouble(txtnum1.getText());
                num2 = Double.parseDouble(txtnum2.getText());

                tot = num1 + num2;
                txtresult.setText(String.valueOf(tot));

            }
        });
        add(plusButton);

        minButton = new JButton("-");
        minButton.setBounds(220, 150, 100, 30);
        minButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1,num2,tot;
                num1 = Double.parseDouble(txtnum1.getText());
                num2 = Double.parseDouble(txtnum2.getText());

                tot = num1 - num2;
                txtresult.setText(String.valueOf(tot));

            }
        });
        add(minButton);

        divButton = new JButton("/");
        divButton.setBounds(340, 150, 100, 30);
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1,num2,tot;
                num1 = Double.parseDouble(txtnum1.getText());
                num2 = Double.parseDouble(txtnum2.getText());

                tot = num1 / num2;
                txtresult.setText(String.valueOf(tot));

            }
        });
        add(divButton);


        mult = new JButton("*");
        mult.setBounds(460, 150, 100, 30);
        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1,num2,tot;
                num1 = Double.parseDouble(txtnum1.getText());
                num2 = Double.parseDouble(txtnum2.getText());

                tot = num1 * num2;
                txtresult.setText(String.valueOf(tot));

            }
        });
        add(mult);

        backButton = new JButton("Back");
        backButton.setBounds(300, 320, 100, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.adwEsWindow.setVisible(false);
                Main.frame.menuWindow2.setVisible(true);
            }
        });
        add(backButton);
    }
}

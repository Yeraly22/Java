import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateS extends Container  {

    //private JLabel subjLabel;
    private JLabel RK1Label;
    private JLabel RK2Label;
    private JLabel reteikLabel;
    private JLabel ScholLabel;

    private JLabel raiseLabel;
    private JLabel finLabel;


    //private JTextField txtsubj;

    private JTextField txtRK1;
    private JButton calButton;
    private JTextField txtRK2;
    private JTextField txtreteik;
    private JTextField txtSchol;
    private JTextField txtraise;
    private JTextField txtfin;


    private JButton backButton;


    public CalculateS() {
        setSize(700, 500);
        setLayout(null);


//        subjLabel = new JLabel("Subject");
//        subjLabel.setBounds(110, 20, 150, 30);
//        add(subjLabel);
//
//        txtsubj = new JTextField();
//        txtsubj.setBounds(200, 20, 200, 30);
//        add(txtsubj);


        RK1Label = new JLabel("RK1");
        RK1Label.setBounds(140, 60, 170, 30);
        add(RK1Label);

        txtRK1 = new JTextField();
        txtRK1.setBounds(240, 60, 220, 30);
        add(txtRK1);


        RK2Label = new JLabel("RK2");
        RK2Label.setBounds(140, 100, 170, 30);
        add(RK2Label);

        txtRK2 = new JTextField();
        txtRK2.setBounds(240, 100, 220, 30);
        add(txtRK2);

        reteikLabel = new JLabel("Что бы не получить ретейк");
        reteikLabel.setBounds(70, 140, 200, 30);
        add(reteikLabel);

        txtreteik = new JTextField();
        txtreteik.setBounds(240, 140, 220, 30);
        add(txtreteik);

        ScholLabel = new JLabel("Баллы для степендии");
        ScholLabel.setBounds(90, 180, 170, 30);
        add(ScholLabel);

        txtSchol = new JTextField();
        txtSchol.setBounds(240, 180, 220, 30);
        add(txtSchol);

        raiseLabel = new JLabel("Баллы для повышки");
        raiseLabel.setBounds(90, 220, 170, 30);
        add(raiseLabel);

        txtraise = new JTextField();
        txtraise.setBounds(240, 220, 220, 30);
        add(txtraise);

        finLabel = new JLabel("Если файнал 100");
        finLabel.setBounds(90, 260, 170, 30);
        add(finLabel);

        txtfin = new JTextField();
        txtfin.setBounds(240, 260, 220, 30);
        add(txtfin);

        calButton = new JButton("Calculate");
        calButton.setBounds(150, 350, 150, 50);
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double rk1,rk2;
                double tot;
                rk1 = Double.parseDouble(txtRK1.getText());
                rk2 = Double.parseDouble(txtRK2.getText());

                double average = (rk1 + rk2) / 2;

                double neededForScholarship = (double) ((70 - (average * 0.6))/0.4);

                double tot1 = average * 0.6 + neededForScholarship * 0.4;

                double neededForPromotion = (double) ((90 - (average * 0.6))/0.4);

                int ret = 50;
                txtreteik.setText(String.valueOf(ret));



                int fin = 100;
                tot = average * 0.6 + fin * 0.4;
                txtfin.setText(String.valueOf(tot));

                if(average < 49){
                    txtSchol.setText("У вас не хватает на проходной");
                    txtraise.setText("У вас не хватает на проходной");
                } else if
                (neededForScholarship >= 50) {
                    txtSchol.setText(Double.toString(neededForScholarship));
                } else if(neededForScholarship < 50) {
                    txtSchol.setText("50");
                } else{
                    txtSchol.setText("У вас хватает на степендии");
                }

                if(average < 49){
                    txtSchol.setText("У вас не хватает на проходной");
                    txtraise.setText("У вас не хватает на проходной");
                }
                else if (neededForPromotion <= 90) {
                    txtraise.setText(Double.toString(neededForPromotion));
                } else {
                    txtraise.setText("У вас не хватает на повышку");
                }


            }
        });
        add(calButton);

        backButton = new JButton("Back");
        backButton.setBounds(300, 350, 150, 50);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.calculateSWindow.setVisible(false);
                Main.frame.menuWindow2.setVisible(true);
            }
        });
        add(backButton);


    }

}




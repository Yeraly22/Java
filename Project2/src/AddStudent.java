import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudent extends Container {
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel groupLabel;
    private JLabel professionLabel;

    private JTextField nameText;
    private JTextField surnameText;
    private JTextField groupText;
    private JTextField professionText;

    private JButton addButton;
    private JButton backButton;


    public AddStudent(){
        setSize(700,500);
        setLayout(null);


        nameLabel = new JLabel("Name");
        nameLabel.setBounds(150, 100, 80, 40);
        add(nameLabel);

        nameText = new JTextField();
        nameText.setBounds(240, 100, 210, 40);
        add(nameText);


        surnameLabel = new JLabel("Surname");
        surnameLabel.setBounds(150, 150, 80, 40);
        add(surnameLabel);

        surnameText = new JTextField();
        surnameText.setBounds(240, 150, 210, 40);
        add(surnameText);


        groupLabel = new JLabel("Group");
        groupLabel.setBounds(150, 200, 80, 40);
        add(groupLabel);

        groupText = new JTextField();
        groupText.setBounds(240, 200, 210, 40);
        add(groupText);


        professionLabel = new JLabel("Profession");
        professionLabel.setBounds(150, 250, 80, 40);
        add(professionLabel);

        professionText = new JTextField();
        professionText.setBounds(240, 250, 210, 40);
        add(professionText);


        addButton = new JButton("Add student");
        addButton.setBounds(150, 350, 150, 50);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                String surname = surnameText.getText();
                String group = groupText.getText();
                String profession = professionText.getText();


                Student student = new Student(name,surname,group,profession);
                PackageData pd = new PackageData("Add", student);
                Main.connect(pd);

                nameText.setText("");
                surnameText.setText("");
                groupText.setText("");
                professionText.setText("");
            }
        });
        add(addButton);

        backButton = new JButton("Back");
        backButton.setBounds(300, 350, 150, 50);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.addWindow.setVisible(false);
                Main.frame.menuWindow.setVisible(true);
            }
        });
        add(backButton);


    }

}

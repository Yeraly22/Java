import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstWindow extends Container{
    public static MainFrame frame;
    private static String AdminName="Admin";
    private static String AdminPass="Admin";
    private static String AdminName2="Student";
    private static String AdminPass2="Student";
    public firstWindow() {
        setSize(700,500);
        setLayout(null);


        JLabel log = new JLabel("login:");
        JLabel pass=new JLabel("password:");


        log.setSize(250,60);
        log.setLocation(100,170);
        add(log);

        pass.setSize(250,60);
        pass.setLocation(100,220);
        add(pass);

        JTextField login=new JTextField();
        login.setSize(400,30);
        login.setLocation(170,180);
        add(login);

        JPasswordField password=new JPasswordField();
        password.setEchoChar('*');
        password.setSize(400,30);
        password.setLocation(170,235);
        add(password);

        JButton btn=new JButton("log in");
        btn.setSize(100,30);
        btn.setLocation(300,290);
        add(btn);

        JLabel alert=new JLabel("");
        alert.setSize(200,30);
        alert.setLocation(260,320);
        add(alert);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String LogS=login.getText();
                String PassS=password.getText();
                if((PassS.equals(AdminPass)&&(LogS.equals(AdminName)))) {
                    frame.first.setVisible(false);
                    frame.menuWindow.setVisible(true);
                    login.setText("");
                    password.setText("");
                } else if(PassS.equals(AdminPass2)&&(LogS.equals(AdminName2))) {
                    frame.first.setVisible(false);
                    frame.menuWindow2.setVisible(true);
                    login.setText("");
                    password.setText("");
                } else{
                    alert.setText("Incorrect password or login");
                }

            }
        });
    }

}
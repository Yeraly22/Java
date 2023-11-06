import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static MainMenu menuWindow;
    public static AddStudent addWindow;
    public static ListStudent listWindow;
    public static DeleteStudent deleteWindow;

    public static firstWindow first;
    public static MainMenuS menuWindow2;
    public static CalculateS calculateSWindow;
    public static Tasks taskWindow;
    public static ADWEs adwEsWindow;


    public MainFrame(){


        setSize(700,500);
        setTitle("Student App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        first=new firstWindow();
        first.setVisible(true);
        add(first);

        menuWindow2 = new MainMenuS();
        setLocation(0,0);
        menuWindow2.setVisible(false);
        add(menuWindow2);

        calculateSWindow = new CalculateS();
        setLocation(0,0);
        calculateSWindow.setVisible(false);
        add(calculateSWindow);

        taskWindow = new Tasks();
        setLocation(0,0);
        taskWindow.setVisible(false);
        add(taskWindow);

        adwEsWindow = new ADWEs();
        setLocation(0,0);
        adwEsWindow.setVisible(false);
        add(adwEsWindow);

        menuWindow = new MainMenu();
        setLocation(0,0);
        menuWindow.setVisible(false);
        add(menuWindow);

        addWindow = new AddStudent();
        setLocation(0,0);
        addWindow.setVisible(false);
        add(addWindow);


        listWindow = new ListStudent();
        setLocation(0,0);
        listWindow.setVisible(false);
        add(listWindow);

        deleteWindow = new DeleteStudent();
        setLocation(0,0);
        deleteWindow.setVisible(false);
        add(deleteWindow);

    }



}

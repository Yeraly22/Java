import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DeleteStudent extends Container {

    private JLabel label;
    private JTextField textField;
    private JButton delete;
    private JButton back;
    public static JTextArea area;

    public DeleteStudent(){
        setLayout(null);
        setSize(700,500);

        area=new JTextArea();
        area.setBounds(190,20,300,350);
        add(area);

        label=new JLabel("INSERT Id:");
        label.setBounds(190,370,150,30);
        add(label);

        textField=new JTextField("");
        textField.setBounds(280,370,100,30);
        add(textField);

        delete=new JButton("DELETE");
        delete.setBounds(180,400,100,30);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = textField.getText();
                try{
                    PackageData pd = new PackageData("Delete",id);
                    Main.connect(pd);
//                    DBManager.updateArea();



                    textField.setText("");

                }catch(Exception ex){
                    ex.printStackTrace();
                }

            }
        });
        add(delete);

        back=new JButton("BACK");
        back.setBounds(300,400,70,30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.deleteWindow.setVisible(false);
                Main.frame.menuWindow.setVisible(true);
            }
        });
        add(back);

    }
//    public void updateArea(ArrayList<Student> students){
//
//
//        area.setText("");
//        String s="";
//        for(Student p: students){
//            s=s+p.toString()+"\n";
//        }
//        area.append(s);
//    }
}

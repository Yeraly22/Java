import javax.swing.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Main {

    public static MainFrame frame;


    public static void connect(PackageData pd){
        try {
            Socket socket = new Socket("127.0.0.1",1124);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());


            if(pd.getOperationType().equals("Add")){
                outputStream.writeObject(pd); //add
            }
            else if(pd.getOperationType().equals("List")){
                outputStream.writeObject(pd);
                PackageData infoFromServer = (PackageData) inputStream.readObject();
                ArrayList<Student> arrayListFromServer = infoFromServer.getStudents();

                String s="";

                for (int i = 0; i < arrayListFromServer.size(); i++) {
                    s += arrayListFromServer.get(i).info()+"\n";
                }

                ListStudent.text.append(s);


            }
            else if(pd.getOperationType().equals("Delete")) {
                outputStream.writeObject(pd);//delete


            }


            inputStream.close();
            outputStream.close();
            socket.close();



        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        frame = new MainFrame();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);



    }
}

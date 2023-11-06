import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread{
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    public void run(){
        try{
            DBManager manager = new DBManager();
            manager.connect();

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            PackageData packageData = null;
            while ((packageData = (PackageData) inputStream.readObject()) != null){
                if(packageData.getOperationType().equals("Add")){
                    Student student = packageData.getStudent();
                    manager.addStudent(student);

                } else if(packageData.getOperationType().equals("List")) {
                    ArrayList<Student> infoforClient = manager.getAllStudents();
                    PackageData toClient = new PackageData(infoforClient);
                    outputStream.writeObject(toClient);

                } else if(packageData.getOperationType().equals("Delete")) {
                    String id=packageData.getId();
                    manager.deleteStudent(id);


                }
            }

            inputStream.close();
            outputStream.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

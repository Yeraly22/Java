import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(1124);
            while (true){
                System.out.println("Waiting client");
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");

                ServerThread st = new ServerThread(socket);
                st.start();

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

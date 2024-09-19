import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {



    public static void main(String[] args) {
        ServerSocket serverSocket;
        Socket socket;

        try {
            serverSocket = new ServerSocket(5000);
            System.out.println("Lytter port 5000");


            socket = serverSocket.accept();
            System.out.println("Ny klient");
            InputStream inputStream = socket.getInputStream();
            OutputStream dos = socket.getOutputStream();






        } catch (IOException e) {
           e.printStackTrace();
        }

    }
}

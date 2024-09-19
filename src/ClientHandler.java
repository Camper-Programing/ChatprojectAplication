import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;


public class ClientHandler implements Runnable {
    Scanner scanner = new Scanner(System.in);

    final DataInputStream dataInputStream; //Data input Stream
    final DataOutputStream dataOutputStream; // Data output Stream
    boolean isLoggedIn; // kontrol af login



    private String hostname;
    private static int port = 5000;
    private static int threadPoolSize = 10;

    public ClientHandler(Scanner scanner, DataInputStream dis, DataOutputStream dos, boolean isLoggedIn, String hostname) {
        this.scanner = scanner;
        this.dataInputStream = dis;
        this.dataOutputStream = dos;
        this.isLoggedIn = isLoggedIn;
        this.hostname = hostname;
    }


    @Override
    public void run (){
          {

        }
    }

    /*
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port 5000");

            ExecutorService threadPool = Executors.newFixedThreadPool(threadPoolSize);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");

                threadPool.execute(new ClientHandler(socket));
            }
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
     */
}

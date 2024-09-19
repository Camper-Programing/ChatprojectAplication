import java.net.Socket;

public class ChatClient {
    private String hostname = "localhost";
    private int port = 5000;

    public ChatClient(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }

    public void Start() {
        try (Socket socket = new Socket(hostname, port)) {
            System.out.println("Connected to server");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

    }
}

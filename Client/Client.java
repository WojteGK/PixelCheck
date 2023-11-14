package Client;
import java.io.*;
import java.net.*;

public class Client {
    private BufferedReader in;
    private PrintWriter out;

    void startClient() {
        try (Socket socket = new Socket("localhost", 9998)) {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
    
            System.out.println("Connected to the server.");
            while (true) {
                String board = receiveBoardFromServer();
                displayBoard(board);
    
                String move = getUserMove();
                sendMoveToServer(move);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String receiveBoardFromServer() throws IOException {
        return in.readLine();
    }

    void displayBoard(String board) {
        System.out.println(board);
    }

    String getUserMove() {
        System.out.println("Enter your move:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String move = null;
        try {
            move = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return move;
    }

    void sendMoveToServer(String move) {
        out.println(move);
    }
}
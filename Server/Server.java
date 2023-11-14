package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Server {
    private BufferedReader in1, in2;
    private PrintWriter out1, out2;
    private String board;

    void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(9998)) {
            System.out.println("Server started. Waiting for clients...");

            Socket clientSocket1 = serverSocket.accept();
            System.out.println("Client 1 connected.");
            in1 = new BufferedReader(new InputStreamReader(clientSocket1.getInputStream()));
            out1 = new PrintWriter(clientSocket1.getOutputStream(), true);

            Socket clientSocket2 = serverSocket.accept();
            System.out.println("Client 2 connected.");
            in2 = new BufferedReader(new InputStreamReader(clientSocket2.getInputStream()));
            out2 = new PrintWriter(clientSocket2.getOutputStream(), true);

            // Initialize the board
            board = initializeBoard();

            while (true) {
                // Send the board to both clients
                sendBoardToClients();

                // Get move from client 1, validate it, and update the board
                String move1 = getMoveFromClient(in1);
                if (isValidMove(move1)) {
                    updateBoard(move1);
                }

                // Send the updated board to both clients
                sendBoardToClients();

                // Get move from client 2, validate it, and update the board
                String move2 = getMoveFromClient(in2);
                if (isValidMove(move2)) {
                    updateBoard(move2);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String initializeBoard() {
        // Initialize the board
        return "";
    }

    void sendBoardToClients() {
        out1.println(board);
        out2.println(board);
    }

    String getMoveFromClient(BufferedReader in) throws IOException {
        return in.readLine();
    }

    boolean isValidMove(String move) {
        // Validate the move
        return true;
    }

    void updateBoard(String move) {
        // Update the board
    }
}

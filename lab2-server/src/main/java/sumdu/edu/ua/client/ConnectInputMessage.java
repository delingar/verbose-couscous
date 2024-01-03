package sumdu.edu.ua.client;

import java.io.*;
import java.net.Socket;

public class ConnectInputMessage implements Runnable {
    private Socket serverConnect;
    private InputStream inputStreamServer;

    public ConnectInputMessage() {
        try {
            serverConnect = new Socket("localhost", 8887);
            inputStreamServer = serverConnect.getInputStream();
        } catch (IOException e) {
            System.err.println("Error connecting to the server: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        try (
            BufferedReader in = new BufferedReader(new InputStreamReader(inputStreamServer));
            BufferedReader inputUser = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String serverMessage;
            String userMessage;

            while (true) {
                serverMessage = in.readLine();
                if (serverMessage != null) {
                    System.out.println(serverMessage + '\n');
                    break;
                }
            }

            PrintWriter out = new PrintWriter(serverConnect.getOutputStream(), true);

            while (true) {
                System.out.println("Enter message: ");
                userMessage = inputUser.readLine();
                out.println(userMessage);
            }
        } catch (IOException e) {
            System.err.println("Error during communication with the server: " + e.getMessage());
            throw new RuntimeException(e);
        } finally {
            closeResources();
        }
    }

    private void closeResources() {
        try {
            if (serverConnect != null && !serverConnect.isClosed()) {
                serverConnect.close();
            }
        } catch (IOException e) {
            System.err.println("Error closing client socket: " + e.getMessage());
        }
    }

    public InputStream getInputStreamServer() {
        return inputStreamServer;
    }
}

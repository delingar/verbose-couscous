package sumdu.edu.ua.client;

public class MainClient {
    public static void main(String[] args) {
        ConnectInputMessage connectWithServer = new ConnectInputMessage();
        ReceiveMessageFromServer receiveMessage =
                new ReceiveMessageFromServer(connectWithServer.getInputStreamServer());

        Thread tConnectInputMessage = new Thread(connectWithServer);
        Thread tReceiveMessage = new Thread(receiveMessage);

        tConnectInputMessage.start();
        tReceiveMessage.start();
    }
}

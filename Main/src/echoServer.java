import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Cathal on 24/01/2017.
 */
public class echoServer {
    ServerSocket myService;
    Socket serviceSocket;

    public void runEchoServer() throws IOException {
        String inputFromClient;
        BufferedReader serverInput = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
        PrintStream serverOutput = new PrintStream(serviceSocket.getOutputStream());
        while ((inputFromClient = serverInput.readLine()) != null) {
            System.out.println(inputFromClient);
        }
        serverOutput.close();
        serverInput.close();
        serviceSocket.close();
        myService.close();
    }

    public void startServer() throws IOException {
        myService = new ServerSocket(5555);
    }

    public void acceptConnection() throws IOException {
        serviceSocket = myService.accept();
    }
}

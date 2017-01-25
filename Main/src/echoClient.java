import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * Created by Cathal on 24/01/2017.
 */
public class echoClient {
    Socket myClient;

    public void runEchoClient() throws IOException {
        BufferedReader clientInput = new BufferedReader(new InputStreamReader(myClient.getInputStream()));
        PrintStream clientOutput = new PrintStream(myClient.getOutputStream());
        clientOutput.print("Howdy ");
        clientOutput.print("Pahtner \n");
        clientOutput.print("Exit your wagon");
        clientOutput.close();
        clientInput.close();
        myClient.close();
    }

    public void clientSocketConnect() throws IOException {
        myClient = new Socket("cathals-tablet", 5555);
    }
}

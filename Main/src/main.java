public class main {

    public static void main(String[] args) throws Exception {
        echoServer server =  new echoServer();
        echoClient client =  new echoClient();
        server.startServer();
        client.clientSocketConnect();
        server.acceptConnection();
        client.runEchoClient();
        server.runEchoServer();

    }
}


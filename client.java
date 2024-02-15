public class Client { 
    public static void main(String[] args) throws IOException{
        String hostName = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(hostName, port));
        BufferedReader in = new BufferReader(new InputStreamReader(socket.getInputStream()))){
            string fromServer;
            while ((fromServer = in.readLine()) != null){
                System.out.println("Server: " + fromServer);
                break;
            }
        }
    }
}
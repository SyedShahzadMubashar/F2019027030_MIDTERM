
package FirstQuestion_030;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author CN Solution
 */
public class ServerSide {
     public static void main(String[] args)  {
        try {
            ServerSocket Ssocket = new ServerSocket(786);
            
            System.out.println("First we are going to Establish connection \n");
            Socket soc = Ssocket.accept();   
            System.out.println(" Now Our Connection Is Established \n\n");
            DataInputStream dis = new DataInputStream(soc.getInputStream());
            String Msg = (String) dis.readUTF();
            System.out.println("The Clients message is= " + Msg);
            
            Ssocket.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


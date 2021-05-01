package FirstQuestion_030;
import java.io.DataOutputStream;
import java.net.Socket;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author CN Solution
 */
public class ClientSide {
    public static void main(String[] args) {
        try{
            
            Socket Csocket = new Socket("localhost", 786);
            DataOutputStream doutput = new DataOutputStream(Csocket.getOutputStream());  
            doutput.writeUTF("Assalamoalikum Shah Sab");
            doutput.flush();
            doutput.close();
            Csocket.close();  
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    }
}



    

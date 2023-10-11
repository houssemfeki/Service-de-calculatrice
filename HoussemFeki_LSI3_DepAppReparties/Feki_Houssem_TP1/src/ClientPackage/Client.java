package ClientPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // La deuxiéme étape:
		try {
			Socket socket=new Socket("localhost",1234);
			System.out.println("un client est connecté ");
		    InputStream is= socket.getInputStream();
		    OutputStream os=socket.getOutputStream();	
		    Scanner scanner =  new Scanner(System.in);
			System.out.println("Donner un nb " );
		    int x=scanner.nextInt();
		    os.write(x);
		    
		    int nb = is.read();
			System.out.println("La réponse " +nb);
		    socket.close();
	
		  }catch (IOException e){
			e.printStackTrace();
		}
	}

}

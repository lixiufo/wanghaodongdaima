package threadsocked;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {
public static void main(String[] args) {
	try {
		ServerSocket ss=new ServerSocket(8802);
		while(true) {
		Socket socket=ss.accept();
		LoginThread lt=new LoginThread(socket);
//		new Thread(lt).start();
		Thread A=new Thread(lt);   A.start();    //与上一行等效
		
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

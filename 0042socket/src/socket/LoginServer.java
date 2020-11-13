package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {
	public static void main(String[] args) {
//		BufferedReader br=null;
//		InputStream is=null;
//		Socket socket=null;
//		ServerSocket ss=null;
		try {
			ServerSocket ss=new ServerSocket(8800);
			Socket 	socket=ss.accept();
			InputStream 	is=socket.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
//			 ss=new ServerSocket(8800);
//			socket=ss.accept();
//			is=socket.getInputStream();
//			br=new BufferedReader(new InputStreamReader(is));
		
	String info;
	while ((info=br.readLine())!=null) {
	System.out.println("客户端发送的信息是"+info);
	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally {
//			try {
//				socket.close();
//				br.close();
//				ss.close();
//				is.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//	}
	}

}

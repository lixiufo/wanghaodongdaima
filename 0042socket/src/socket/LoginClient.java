package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class LoginClient {
	public static void main(String[] args) {
		OutputStream os=null;
		Socket socket=null;
		try {
		socket=new Socket("localhost",8800);
		String info="·þÎñÆ÷ÄãºÃ";
		os=socket.getOutputStream();
		os.write(info.getBytes());
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	}
}
package threadsocked;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class LoginClient2 {
public static void main(String[] args) {
	try {
		Socket socket=new Socket("localhost",8802);
		Stu stu=new Stu("ÀîÀ×½¡", "54321");
		OutputStream os=socket.getOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(os);
		oos.writeObject(stu);
		oos.flush();
		oos.close();
		os.close();
		socket.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}


package threadsocked;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class LoginThread  implements Runnable{
private Socket socket;

public LoginThread(Socket socket) {
	this.socket=socket;
}

	public void run() {
		try {
			InputStream is= socket.getInputStream();
			ObjectInputStream ois=new ObjectInputStream(is);
			Stu stu=(Stu) ois.readObject();
			System.out.println("��������ȡ���ͻ��˷��͵���Ϣ"+stu);
			ois.close();
			is.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
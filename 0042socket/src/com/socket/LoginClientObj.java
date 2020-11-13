package com.socket;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class LoginClientObj {
public static void main(String[] args) {
	try {
		Socket socket=new Socket("localhost",8801);
		Stu stu=new Stu("ÀîÐã·ð" ,18);
		
		OutputStream os=socket.getOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(os);
		oos.writeObject(stu);
		oos.close();
		os.close();
		socket.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}
}

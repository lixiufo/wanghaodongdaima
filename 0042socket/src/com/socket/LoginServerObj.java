package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.Provider.Service;

public class LoginServerObj {
public static void main(String[] args) {
	try {
		ServerSocket ss=new ServerSocket(8801);
		Socket socket=ss.accept();
		InputStream is=socket.getInputStream();
		ObjectInput ois=new ObjectInputStream(is);
		Stu stu = (Stu) ois.readObject();
		System.out.println(stu.getName()+stu.getAge());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyImage {
public static void main(String[] args) {
	FileInputStream fis;
	try {
		fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\qwe.jpg");
		DataInputStream dis=new DataInputStream(fis);
		FileOutputStream fos=new FileOutputStream("nv.jpg");
		DataOutputStream dos=new DataOutputStream(fos);
		int data;
		while((data=dis.read())!=-1){
			System.out.println(data);
			dos.write(data);
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}


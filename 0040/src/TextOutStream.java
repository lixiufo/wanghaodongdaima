import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextOutStream {
public static void main(String[] args) {
	FileOutputStream fos=null;
	try {
		 fos=new FileOutputStream("c.txt" ,true);
		String str="ƒ„∫√ ¿ΩÁ";
		byte datas[]=str.getBytes();
		try {
			fos.write(datas, 0, datas.length);
		} catch (IOException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}finally {
		if(fos!=null) {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
}

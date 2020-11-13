import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TextFileInputStreamChinese {
public static void main(String[] args) {
	File file=new File("b.txt");
	try {
		file.createNewFile();
		FileInputStream fis =new FileInputStream(file);
		byte [] b=new byte[fis.available()];
		//System.err.println(fis.available());
		int data;
		while((data=fis.read(b))!=-1) {
			System.out.println(new String(b, 0, data));
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

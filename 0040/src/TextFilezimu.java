import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TextFilezimu {
public static void main(String[] args) {
	File file= new File("a.txt");
	try {
		file.createNewFile();
		FileInputStream fis=new FileInputStream(file);
		int data;
		while((data=fis.read())!=-1)
		{
		System.out.print((char)data);
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

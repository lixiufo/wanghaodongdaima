import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class xie {
public static void main(String[] args) {
	try {
		FileOutputStream fos=new FileOutputStream("vb.txt");
		String str="世界，世界都不爱我了，怎么办";
		byte [] b=str.getBytes();
		try {
			fos.write(b, 0, b.length);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

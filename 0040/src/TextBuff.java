import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TextBuff {
public static void main(String[] args) {
	try {
		Writer write=new FileWriter("w.txt");
		BufferedWriter be=new BufferedWriter(write);
		be.write("第一行内fgfd 容");
		be.newLine();
		be.write("第2行内容");
		be.newLine();
		be.flush();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

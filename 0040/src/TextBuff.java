import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TextBuff {
public static void main(String[] args) {
	try {
		Writer write=new FileWriter("w.txt");
		BufferedWriter be=new BufferedWriter(write);
		be.write("��һ����fgfd ��");
		be.newLine();
		be.write("��2������");
		be.newLine();
		be.flush();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

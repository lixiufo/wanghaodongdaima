import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class TextBufferreader {
public static void main(String[] args) {
	try {
		FileReader fr=new FileReader("q.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		try {
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
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

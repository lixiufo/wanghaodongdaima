import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TextFileReade {
	public static void main(String[] args) {
		File file=new File("q.txt");
		try {
			file.createNewFile();
			Reader reader=new FileReader(file);
			int datas;
			while((datas=reader.read())!=-1)
			{
			System.out.print((char)datas);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjectSer {
public static void main(String[] args) {
	Student stu1= new Student("ÀîÐã·ð",16);
	Student stu2= new Student("ÀîÐã·ð",25);
	FileOutputStream fos;
	try {
		fos = new FileOutputStream("stu.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(stu1);
		oos.writeObject(stu2);
		oos.flush();
		FileInputStream fis=new FileInputStream("stu.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);

		while(fis.available()>0) {
			Student  tu=(Student) ois.readObject();
			System.out.println(tu);
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}

}


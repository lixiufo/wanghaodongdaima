import java.io.FileNotFoundException;
import java.util.Scanner;

public class Text {
	public static void main(String[] args) {
		Text a=new Text();
		try {
			a.wenti();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
			
		}
	}
	
	
	public void wenti() throws FileNotFoundException{
		Scanner in = new Scanner(System.in);
		System.out.print("�����뱻����:");
		int num1 = in.nextInt();
		System.out.print("���������:");
		int num2 = in.nextInt();
		System.out.println(num1+"/"+ num2 +"="+ num1/ num2);
		System.out.println("��лʹ�ñ�����");
	}
	
	
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Yichang1 {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("�����뱻����:");
			int num1 = in.nextInt();
			System.out.print("���������:");
			int num2 = in.nextInt();
			System.out.println(num1+"/"+ num2 +"="+ num1/ num2);
		}catch(InputMismatchException a){
			System.out.println("���쳣");
			a.printStackTrace();
			System.out.println(a.getMessage());
			}
		
			catch(Exception a) {
				System.out.println("���쳣");
				a.printStackTrace();
				System.out.println(a.getMessage());
			}
		System.out.println("��лʹ�ñ�����");
		}
	
	
	}
	


import java.util.Scanner;

public class Yichang {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in); 
	System.out.print("�����뱻����:"); 
	int num1 = in.nextInt();
	Yichang n=new Yichang();
	int num4=n.getnum();
	System.out.println(num1+"/"+ num4 +"="+ num1/ num4); 
	System.out.println("��лʹ�ñ�����");
}
public int getnum() {
	Scanner in = new Scanner(System.in); 
	System.out.print("���������:");
	int num2 = in.nextInt();
	while(true){
		if(num2 == 0) {
			System.out.print("����������");
			 num2 = in.nextInt();
		}else {
			break;
		}
	}
	return num2;
	
}





}

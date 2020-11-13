import java.util.Scanner;

public class Yichang {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in); 
	System.out.print("请输入被除数:"); 
	int num1 = in.nextInt();
	Yichang n=new Yichang();
	int num4=n.getnum();
	System.out.println(num1+"/"+ num4 +"="+ num1/ num4); 
	System.out.println("感谢使用本程序！");
}
public int getnum() {
	Scanner in = new Scanner(System.in); 
	System.out.print("请输入除数:");
	int num2 = in.nextInt();
	while(true){
		if(num2 == 0) {
			System.out.print("请重新输入");
			 num2 = in.nextInt();
		}else {
			break;
		}
	}
	return num2;
	
}





}

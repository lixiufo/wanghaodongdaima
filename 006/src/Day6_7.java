import java.util.Scanner;
public class Day6_7 {
	public static void main(String[] args) {
		int [] arr= new int[5];
		arr[0]=99;
		arr[1]=87;
		arr[2]=79;
		arr[3]=60;
		Scanner input=new Scanner(System.in);
		System.out.println("������Ҫ���������");
		int num=input.nextInt();
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if(num>arr[i]) {
				index=i;
				break;
			}
		}
		//Ȼ�����������Ӧ�ò����λ���Ժ��Ԫ�� �������һλ 
		//�ں��ʵ�λ�� 
		for(int j=arr.length-1;j>index;j--) {
			arr[j]=arr[j-1];//�ƶ�λ�� 
		}
		//�ϱߵĲ����Ѿ��ƶ�����λ��  ��ô���һ�� ��������
		arr[index]=num;
		System.out.println("�����Ժ�����ֱ���");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

	}
}

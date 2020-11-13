import java.util.Scanner;
public class Day6_7 {
	public static void main(String[] args) {
		int [] arr= new int[5];
		arr[0]=99;
		arr[1]=87;
		arr[2]=79;
		arr[3]=60;
		Scanner input=new Scanner(System.in);
		System.out.println("请输入要插入的数字");
		int num=input.nextInt();
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if(num>arr[i]) {
				index=i;
				break;
			}
		}
		//然后在这个数字应该插入的位置以后的元素 整体后移一位 
		//在合适的位置 
		for(int j=arr.length-1;j>index;j--) {
			arr[j]=arr[j-1];//移动位置 
		}
		//上边的操作已经移动好了位置  那么最后一步 插入数字
		arr[index]=num;
		System.out.println("插入以后的数字遍历");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

	}
}

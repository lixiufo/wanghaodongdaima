import java.util.Scanner;

public class Day6_9 {
	
	int j;
	public static void main(String[] args) {
		int a[]=new int [4];
		Scanner input=new Scanner(System.in);
		System.out.println("请输入4家店的价格");
		for(int i=0;i<4;i++) {
			System.out.println("第"+(i+1)+"店的价格");
			a[i]=input.nextInt();
		}

		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			
			}
		}
		int max=0;
		for(int j=0;j<a.length;j++) {
		    if(a[j]>max) {
		    	max=a[j];
		    	
		    }
		    
		}System.out.println(max);

	

	}

}

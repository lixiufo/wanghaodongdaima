package qwet;

import java.util.Scanner;

public class Za {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入4位会员卡号");
		int si=input.nextInt();
	    int bai;
	    bai=(int)(si/100%10);
	    int random=(int)(Math.random()*10);
	    if(bai==random) {
	    	System.out.println("中奖了");
	    }
	    else
	    {   System.out.println("很遗憾");                    }
	
	
	}
	

}

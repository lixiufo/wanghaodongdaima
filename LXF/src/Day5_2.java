
public class Day5_2 {
	public static void main(String [] args) {
		int a=0;
		for(int i=1;i<=10;i++) {
			a+=i;
			if(a>20) {
				System.out.println(i);
				break;
			}
		
		}
		System.out.println(a);

	}
}


public class Day5_7 {
	public static void main(String [] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
////				if(i*j<10) {
////					System.out.print(" ");
//				}
			}

			System.out.print("\n");
		}
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;


public class Postal_code {
	
	public static void main(String[] args) {
		System.out.println("���������");
		Scanner input = new Scanner(System.in);
		String city = input.nextLine();
		String number = null;
		Reader fr= null;
		BufferedReader br = null;
		
		try {
			fr  = new FileReader("C:\\Users\\Administrator\\Desktop\\�½��ļ��� (14)\\�ʱ�.txt");
			//fw = new FileWriter("1.txt");
			br = new BufferedReader(fr);
			//bw = new BufferedWriter(fw);
			String line;
			while((line = br.readLine()) != null) {
				
				if(line.contains(city)) {
					String a[] = line.split("	");
					number = a[1];
					break;
				}
			}
			
			 if(number!=null) { 
				 System.out.println("�ó��е����������ǣ�" + number); 
			}else {
				System.out.println("û�в��ҵ��ó���"); 
			}
			
			//bw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}


}




public class Day6_8{
	public static void main(String[] args) {
		//ð������ ���� 
		int [] arr= {154,89,255,12,6};                                                                         
		//ʹ������  ���ѭ�����ƱȽϵ����� ����-1
		//�ڲ�ѭ������ÿһ�ֱȽϵĴ��� 
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				//�����ڱȽϵ�ʱ�� Ҫע�� �������ǱȽϵ�ѭ�����ڲ�ѭ�� 
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int j = 0; j< arr.length; j++) {
			System.out.println(arr[j]);
		}}}




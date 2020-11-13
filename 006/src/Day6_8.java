
public class Day6_8{
	public static void main(String[] args) {
		//冒泡排序 作用 
		int [] arr= {154,89,255,12,6};                                                                         
		//使用升序  外层循环控制比较的轮数 长度-1
		//内层循环控制每一轮比较的次数 
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				//这里在比较的时候 要注意 最终我们比较的循环是内层循环 
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




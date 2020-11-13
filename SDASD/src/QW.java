
public class QW {
	private int age;
	 
	public int getAge() {
		return age;
	}
 
	public void setAge(int age) throws ASD  {
		if(age<=1||age>=100) {
			throw new ASD();  //抛出自定义的异常
		}else {
			
			this.age = age;
		}
	}
 

}


public class Tex2 {
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) throws Tex1  {
		if(sex.equals("男") || sex.equals("女")) {
			this.sex = sex;
		}else {
			throw new   Tex1("性别只能为男或者女");
		}
	}
	
	public static void main(String[] args) throws Tex1  {
		Tex2 tse=new Tex2();
		tse.setSex("sa");
		System.out.println(tse.getSex());
	}
}

import java.util.Scanner;

public class UpdatePassWord {
	String name;
	String password;
	
	
	//这个方法我们用于修改密码，要提供原来的账号和密码，
	//如果账号和密码通过，那么我们要提供一个新的密码用于修改
	//当本类中的方法形参与本类中的属性名称一致的话  那么方法中不能区分属性和形参
	//只认形参 不会使用属性
	public boolean updatePwd(String oldName,String oldPassword) {
		if(oldName.equals(name) && oldPassword.equals(password)) {
			Scanner input=new Scanner(System.in);
			System.out.println("请输入修改后的密码");
			String newPwd=input.next();
			System.out.println("登录成功，密码进行修改中……");
			password=newPwd;
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		UpdatePassWord upd=new UpdatePassWord();
		upd.name="admin";
		upd.password="1111";
		System.out.println("请输入原来的用户名");
		String name=input.next();
		System.out.println("请输入原来的密码");
		String oldPassword=input.next();
//upd.updatePwd(oldName, oldPassword)
		if(upd.updatePwd(name,oldPassword)) {
			System.out.println("修改成功");
		}else {
			System.out.println("修改失败");
		}
		System.out.println(upd.password);
		
	}
}

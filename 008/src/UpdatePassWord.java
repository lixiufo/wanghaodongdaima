import java.util.Scanner;

public class UpdatePassWord {
	String name;
	String password;
	
	
	//����������������޸����룬Ҫ�ṩԭ�����˺ź����룬
	//����˺ź�����ͨ������ô����Ҫ�ṩһ���µ����������޸�
	//�������еķ����β��뱾���е���������һ�µĻ�  ��ô�����в����������Ժ��β�
	//ֻ���β� ����ʹ������
	public boolean updatePwd(String oldName,String oldPassword) {
		if(oldName.equals(name) && oldPassword.equals(password)) {
			Scanner input=new Scanner(System.in);
			System.out.println("�������޸ĺ������");
			String newPwd=input.next();
			System.out.println("��¼�ɹ�����������޸��С���");
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
		System.out.println("������ԭ�����û���");
		String name=input.next();
		System.out.println("������ԭ��������");
		String oldPassword=input.next();
//upd.updatePwd(oldName, oldPassword)
		if(upd.updatePwd(name,oldPassword)) {
			System.out.println("�޸ĳɹ�");
		}else {
			System.out.println("�޸�ʧ��");
		}
		System.out.println(upd.password);
		
	}
}

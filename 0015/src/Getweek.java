import org.omg.CORBA.PUBLIC_MEMBER;

public class Getweek {
	public static void main(String[] args) {
		Getweek a=new Getweek();
		a.Tian(Week.five );
	}



	public void Tian(Week week) {
		switch (week) {
		case one:
			System.out.println("����һ");
			break;
		case two:
			System.out.println("���ڶ�");
			break;
		case three:
			System.out.println("������");
			break;
		case four:
			System.out.println("������");
			break;
		case five:
			System.out.println("������");
			break;
		default:
			System.out.println("��������");
			break;
		}
	}
}

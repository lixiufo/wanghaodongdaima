import org.omg.CORBA.PUBLIC_MEMBER;

public class Getweek {
	public static void main(String[] args) {
		Getweek a=new Getweek();
		a.Tian(Week.five );
	}



	public void Tian(Week week) {
		switch (week) {
		case one:
			System.out.println("星期一");
			break;
		case two:
			System.out.println("星期二");
			break;
		case three:
			System.out.println("星期三");
			break;
		case four:
			System.out.println("星期四");
			break;
		case five:
			System.out.println("星期五");
			break;
		default:
			System.out.println("输入有误");
			break;
		}
	}
}

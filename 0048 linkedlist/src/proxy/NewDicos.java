package proxy;

public class NewDicos implements DiningRoom {
	private Dicos dicos;
	public NewDicos(Dicos dicos) {
		this.dicos=dicos;
	}


	@Override
	public void eat() {
		dicos.eat();
		System.out.println("��ˣ");
		System.out.println("��¥��Ϸ��");
	}
	public static void main(String[] args) {
		Dicos d=new Dicos();
		NewDicos c=new NewDicos(d);
		c.eat();
	}

}

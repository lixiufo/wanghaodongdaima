package proxy;

public class NewDicos implements DiningRoom {
	private Dicos dicos;
	public NewDicos(Dicos dicos) {
		this.dicos=dicos;
	}


	@Override
	public void eat() {
		dicos.eat();
		System.out.println("ÍæË£");
		System.out.println("ÈýÂ¥ÓÎÏ·Ìü");
	}
	public static void main(String[] args) {
		Dicos d=new Dicos();
		NewDicos c=new NewDicos(d);
		c.eat();
	}

}

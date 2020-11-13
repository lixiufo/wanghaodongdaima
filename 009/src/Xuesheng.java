
public class Xuesheng {
	private int health;
	private int intimacy;
	

	public void setHealth(int newhealth) {
		if(0<newhealth){
			health=newhealth;
		}else {
			health=60;
		}
	}
	public int getHealth() {
		return health;
	}
	public void setIntimacy(int newIntimacy) {
		if(0<newIntimacy) {
		intimacy=newIntimacy;
		
		}else {
			intimacy=60;
		}
	}

	public int getIntimacy() {
		return intimacy ;
	}
}









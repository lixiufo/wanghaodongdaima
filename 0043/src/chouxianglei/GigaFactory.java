package chouxianglei;

public class GigaFactory implements AbstractFactory {

	@Override
	public Bord getBord() {
		// TODO Auto-generated method stub
		return new jijiazhuban();
	}

	@Override
	public xianka getXianka() {
		// TODO Auto-generated method stub
		return  new jijiaxianka();
	}

}

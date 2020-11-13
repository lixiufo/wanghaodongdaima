package chouxianglei;

public class AsusFactory implements AbstractFactory{

	@Override
	public xianka getXianka() {
		// TODO Auto-generated method stub
		return new huashuoxianka();
	}

	@Override
	public Bord getBord() {
		// TODO Auto-generated method stub
		return new huashuozhuban();
	}

}




public class Phone {
		public void playMusic() {
			System.out.println("正在播放" + downloadMusic());
		}

		public String downloadMusic() {
			return "好汉歌";
		}

		public void chargeCell() {
			Cell cell = new Cell();
			cell.brand = "Anycall";
			cell.getPower();
		}
	}



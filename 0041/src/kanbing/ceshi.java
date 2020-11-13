package kanbing;

public class ceshi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneralThread gt = new GeneralThread("普通号");
		SpecialThread st = new SpecialThread("特殊号");
        //特需号概率比   普通号大
		gt.setPriority(Thread.MIN_PRIORITY);// 1
		st.setPriority(Thread.MAX_PRIORITY);// 10
		gt.start();
		st.start();

	}}

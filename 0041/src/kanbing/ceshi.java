package kanbing;

public class ceshi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneralThread gt = new GeneralThread("��ͨ��");
		SpecialThread st = new SpecialThread("�����");
        //����Ÿ��ʱ�   ��ͨ�Ŵ�
		gt.setPriority(Thread.MIN_PRIORITY);// 1
		st.setPriority(Thread.MAX_PRIORITY);// 10
		gt.start();
		st.start();

	}}

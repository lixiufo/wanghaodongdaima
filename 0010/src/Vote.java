
public class Vote {
	    private String name;//ѡ������
	    static int ballot;//���徲̬����ballot���ۼ�Ʊ��
	    static boolean flag = true;//���徲̬��������������ֹͣͶƱ
	    public void vote() {
	        ballot++;
	        if(ballot>100) {
	            flag = false;
	            System.out.println("ͶƱ������");
	        }else {
	            System.out.println(name+"ͶƱ�ɹ�����ǰƱ���ǣ�"+ballot);
	        }
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	}



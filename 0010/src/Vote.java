
public class Vote {
	    private String name;//选民名字
	    static int ballot;//定义静态变量ballot，累计票数
	    static boolean flag = true;//定义静态布尔变量，用来停止投票
	    public void vote() {
	        ballot++;
	        if(ballot>100) {
	            flag = false;
	            System.out.println("投票结束！");
	        }else {
	            System.out.println(name+"投票成功！当前票数是："+ballot);
	        }
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	}



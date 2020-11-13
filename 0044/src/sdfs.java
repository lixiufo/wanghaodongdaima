import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class sdfs {
	public class Person {
	    private String name = null;
	    private int age = 0;
	    public Person(String name, int age) {
	         this.name = name;
	         this.age  = age;
	    }

	    public String toString() {
	         return name;
	    }
	}
	@Test
	void test() {

		         Person p = new Person("Jabjbck", 20);
		         System.out.println(p);// 这时会输出"Jack".
		    }
		
	}





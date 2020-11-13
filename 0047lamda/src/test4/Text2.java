package test4;

import java.util.function.Supplier;

public class Text2 {
public static void main(String[] args) {
	//¹©¸øÐÍ
Supplier<Long> s=System::currentTimeMillis;
System.out.println(s.get());
}
}

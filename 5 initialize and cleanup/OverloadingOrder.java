// OverloadingOrder based on the order of the argument
// 1 每个重载参数都必须有一个独一无二的参数类型列表
// 2 甚至参数顺序的不同也足以区分两个方法
import static net.mindview.util.Print.*;

public class OverloadingOrder {
	static void f(String s, int i) {
		print("String: " + s + ", int: " + i);
	}

	static voi  f(int i, String s) {
		print("int: " + i + ", String: " + s);	
	}

	public static void main(String[] args) {
		f("String first", 11);
		f(99, "Int first");
	}
}
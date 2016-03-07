// Constructors can have argument
// 1 有了构造器形式参数，就可以在初始化时提供实际参数

class Rock2 {
	Rock2(int i) {
		// This is the constructor
		System.out.print("Rock " + i + " ");
	}
}

public class SimpleConstructor2 {
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			new Rock2(i);
		}
	}
}
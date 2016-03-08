// 如果你写的类中没有构造器， 则编译器会自动帮你创建一个默认的构造器

class Bird2 {
	Bird2(int i) {}
	Bird2(double d) {}
}

public class DefaultConstructor {
	public static void main(String[] args) {
		// Bird2 b = new Bird2(); // No default
		Bird2 b2 = new Bird2(1); 
		Bird2 b3 = new Bird2(1.0)
	}
}
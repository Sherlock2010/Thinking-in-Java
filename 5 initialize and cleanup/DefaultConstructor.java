// 如果你写的类中没有构造器， 则编译器会自动帮你创建一个默认的构造器

class Bird {}

public class DefaultConstructor {
	public static void main(String[] args) {
		Bird b = new Bird(); // Default !
	}
}
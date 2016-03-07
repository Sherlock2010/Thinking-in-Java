// Demonstration of a simple constructor
// 1 构造器如何命名：
//  1.1 所取的任何名字都有可能与类的某个成员名称冲突
//  1.2 调用构造器是编译器的责任，所以必须让编译器之道应该调用哪个方法
// 2 创建对象new Rock()时，将会为对象自动分配存储空间，并调用相应的构造器
// 3 每个首字母小写的编码风格并不适用与构造器

class Rock {
	Rock() {
		// This is the constructor
		System.out.print("Rock ");
	}
}

public class SimpleConstructor {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Rock();
		}
	}
} 
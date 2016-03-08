// Simple use of the "this" keyword
// 只有当需要明确指出当前对象的引用时，才需要使用this关键字
// 例如，当需要返回当前对象的引用时， 就常常在return语句里这样写：

public class Leaf {
	int i = 0;

	Leaf increment() {
		i ++;
		return this;
	}

	void print() {
		System.out.println("i = " + i);
	}

	public static void main(String[] args) {
		Leaf x = new Leaf();
		x.increment().increment().increment().print();
	}
}
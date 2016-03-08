// 如果在方法内部调用同一个类的另一个方法，就不必使用this，直接调用即可
// 当前方法中的this引用会自动应用与同一类中的其他方法

public class Apricot {
	void pick() {
		/* ... */
	}

	void pit() {
		pick();
		/* ... */
	}

}
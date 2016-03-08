class Banana {
	void peel(int i) {
		/* ... */
	}
}

public BananaPeel {
	public static void main(String[] args) {
		Banana a = new Banana(), b = new Banana();

		a.peel(1); 
		b.peel(2);
		// 以上的调用被编译器做了一些“幕后工作”， 就变成了这样
		// a.peel(a, 1)
		// b.peel(b, 2)
		// 但我们并不能这样书写代码，并试图通过编译 
	}
}
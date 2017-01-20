class A {
	public static void main(String[] args) {
		int i = 150;
		i = ++s(i);
		System.out.println(i);
	}
	static int s(int i) {
		return ++i;
	}

	// Não compila, devido ao incremento em método, que só funciona em variável
}
public class StringBuilderTest {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("1Z0");
		sb.concat("-808");
		System.out.println(sb);
	}

	// Não compila, pois não existe o método concat e sim append!!!
}
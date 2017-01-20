public class DoubleTest {
	
	public static void main(String[] args) {
		try {
			Double number = Double.valueOf("120D");
		} catch (NumberFormatException ex) {
			System.out.println(ex);
		}
		System.out.println(number);
	}

	// Erro de compilação na linha 9 porque number é declarado dentro de um bloco try e não pode ser usado fora!
}
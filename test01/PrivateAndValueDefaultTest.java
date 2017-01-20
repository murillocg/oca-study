public class PrivateAndValueDefaultTest {
	
	private String name;
	private boolean pass;

	public static void main(String[] args) {
		PrivateAndValueDefaultTest pv = new PrivateAndValueDefaultTest();
		System.out.println("name = " + pv.name);
		System.out.println("pass = " + pv.pass);
	}

	// Permite acessar os atributos, pois está na classe e vai imprimir os valores default:
	//  String = objeto = null
	//  int = 0
}
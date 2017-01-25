public class Inicializacao {

	public void naoInicializaLocal() {
		int age;
		System.out.println(age);	// Erro de compilação: variável local não inicializada
	}

	public void inicializaLocal() {
		int age;
		age = 10;                   // Inicialização explícita
		System.out.println(age);	// OK
	}

	public void inicializaLocalEmTodosCaminhos(int a) {
		double x;
		if (a > 1) {
			x = 6;
		}
		System.out.println(x);	// Erro de compilação
	}

	class Exam {
		double timeLimit; // Variáveis membro de classe são inicializadas implicitamente!
	}

	Exam exam = new Exam();
	System.out.println(exam.timeLimit);	// OK

	// Arrays também são inicializados implicitamente na sua criação
	int[] numbers = new int[10];
	System.out.println(numbers[0]);  // OK. Vai imprimir zero!

	// Os valores default para as variáveis são:
	int numInt = 0;
	float numFloat = 0.0;
	boolean pago = false;
	char vazio = 0;
	Pessoa pessoa = null;
}
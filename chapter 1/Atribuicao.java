public class Atribuicao {

	int a = 10; //OK
	long b = 20; //int cabe em um long
	float c = 10f; //tipos iguais
	double d = 20.0f; //float cabe em um double
	double e = 30.0; //tipos iguais
	float f = 40.0; //erro, double não cabe em um float
	int g = 10l; //erro, long não cabe em um int
	float h = 10l; //inteiros cabem em decimais
	double i = 20; //inteiros cabem em decimais
	long j = 20f; //decimais não cabem em inteiros

	//byte -> short -> int -> long -> float -> double
	//char -> int

}
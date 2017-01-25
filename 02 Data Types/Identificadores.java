public class Identificadores {
	// Não podem ser igual a uma palavra chave;
	// Podem usar letras, números, $ e _;
	// O primeiro caractere não pode ser número;
	// Pode possui a quantidade de caracteres que quiser;

	int aName; // ok
	int aname; // ok
	int _name; // ok
	int $_ab_c; // ok
	int x_y; // ok
	int false; // inválido, palavra chave
	int x-y; // inválido, traço não permitido
	int 4num; // inválido, começa com número
	int av#f; // inválido, tem #
	int num.spc; // inválido, tem .
}
class Exerc7 {
    public static void main(String[] args) {
        int n = 09;
        int m = 03;
        int x = 1_000;
        System.out.println(x - n + m);

        // Opção a) Não compila: erro na linha que declara n.

        /**
            A resposta certa é (a). O número octal 09 não existe. Você não precisa
            aprender a transformar uma base em outra, mas é importante lembrar
            que binários são compostos de 0s e 1s, octais são compostos de 0s até
            7s, hexadecimais são de 0s até 9s e As até Fs (maiúsculo ou minúsculo).
            O caractere _ é permitido desde que dos dois lados dele tenhamos algarismos
            válidos, que é o caso de 1_000. Portanto, o único número
            inválido é 09 (por curiosidade, o número 9 em base octal é 011).
         */

    }
}
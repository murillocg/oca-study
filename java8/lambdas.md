# Lambdas

## Regras

* Lambdas podem ter vários argumentos, como um método. Basta separá-los por vírgula ","

* O tipo dos parâmetros pode ser inferido, então podem ser omitidos da declaração

* Se não houver nenhum parâmetro, é necessário incluir parênteses vazios, como em:

```java
Runnable r = () -> System.out.println("a runnable object!");
```

* Se houver apenas um parâmetro, podemos omitir os parênteses, como em:

```java
Predicate<Person> matcher = p -> p.getAge() >= 18;
```

* O corpo do lambda pode conter várias instruções, assim como um método

* Se houver apenas uma instrução, podemos omitir as chaves, como no último exemplo

* Se houver mais de uma instrução, é necessário delimitar o corpo do lambda com chaves, como em:

```java
Runnable r = () -> {
    int a = 10;
    int b = 20;
    System.out.println(a + b);
}
```
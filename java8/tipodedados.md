# Classes wrapper

São classes que representam tipos primitivos. Existe wrapper para cada todos tipos primitivos, conforme a seguinte lista:

* boolean: Boolean
* byte: Byte
* short: Short
* char: Character
* int: Integer
* long: Long
* float: Float
* double: Double

## Como instanciar um objeto wrapper?

Todos wrapper possuem dois construtores, um que recebe o tipo primitivo e outro que recebe *String*. Este último pode lançar *NumberFormatException* se String não puder ser convertida.

```java
Double valor = new Double(22.5);
Double valor = new Double("22.5");
Double valor = new Double("abc"); //throws NumberFormatException
```

A classe Character possui apenas um construtor, que recebe *char*:

```java
Character c = new Character('d');
```
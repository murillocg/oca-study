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

## Wrapper para primitivo

Métodos no formato xxxValue():

```java
Long l = new Long("123");

byte b = l.byteValu();
int i = l.intValue();
```

Boolean e Character só podem ser convertidos para o próprio tipo:

```java
boolean b = new Boolean("true").booleanValue();
char c = new Character(’z’).charValue();
```

## String para primitivo

Cada wrapper possui um método no formato parseXXX. Este método lança *NumberFormatException* se não conseguir converter:

```java
double d = Double.parseDouble("23.4");
int i = Integer.parseInt("444");
```

Pode ser passada também a base para conversão:

```java
int i4 = Integer.parseInt("11",2); // 3 Binary
int i2 = Integer.parseInt("11",16); // 17 HexaDecimal
short i1 = Short.parseShort("11",10); // 11 Decimal
```

## String para wrapper

Pode-se utilizar o próprio construtor ou o método valueOf:

```java
Double d = Double.valueOf("23.4");
Long l = Long.valueOf("23");
Integer i1 = Integer.valueOf("444");
Integer i2 = Integer.valueOf("5AF", 16);
```

## Wrapper para String

Assim como todos objetos, os wrappers também possuem um método toString():

```java
Integer i = Integer.valueOf(256);
String number = i.toString();
```
## Primitivo para String

Versão estática sobrecarregada que recebe o primitivo como argumento e até a base nos casos de Long e Integer:

```java
String d = Double.toString(23.5);
String s = Short.toString((short)23);
String i = Integer.toString(23);
String l = Long.toString(20, 16);
```

## Comparando wrappers

Observe o seguinte código:

```java
Integer i1 = 123;
Integer i2 = 123;
System.out.println(i1 == i2); //true
System.out.println(i1.equals(i2)); //true
```

Java mantem cache de alguns objetos, tais como:
* Todos Boolean e Byte;
* Short e Integer de -128 até 127;
* Caracter ASCII, como letras, números etc.

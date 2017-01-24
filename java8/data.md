# Data

No Java 8 foi introduzida a nova api para manipulação de datas e horários, representada pelas seguintes classes:

**LocalDate*: data sem horário no formato yyyy-MM-dd
**LocalTime*: horário apenas no formato hh:mm:ss.zzz
**LocalDateTime*: data com horário nos mesmos formatos descritos acima
**MonthDay*: dia e mês, sem o ano
**YearMonth*: mês e ano, sem o dia
**Period*: período de tempo, em dia, mês e ano
**DateTimeFormatter*: métodos para formatação

Um ponto importante da API é que todas as classes do pacote java.time são imutáveis. Então os métodos do objeto para manipular as datas sempre retornam novos objetos.

```java
LocalDate hoje = LocalDate.now(); 
```

É possível criar um objeto para representar uma data ou hora específica utilizando o método *of*.
Como exemplo, abaixo é criada a representação do meio-dia:

```java
LocalTime meiodia = LocalTime.of(12, 00);
```

Pode-se representar o Natal de qualquer ano:

```java
MonthDay qualquerNatal = MonthDay.of(Month.DECEMBER, 25);
```

Caso for passado um valor inválido para qualquer um dos parâmetros, ocorrerá uma *DateTimeException*.

## Manipulando datas

A padronização de nomes desta API foi uma decisão de design que merece destaque por facilitar seu uso e ampla aceitação.

**get* para extrair partes de uma data:

```java
LocalDateTime now = LocalDateTime.of(2014,12,15,13,0);
System.out.println(now.getDayOfMonth()); // 15
System.out.println(now.getDayOfYear()); // 349
System.out.println(now.getHour()); // 13
System.out.println(now.getMinute()); // 0
System.out.println(now.getYear()); // 2014
System.out.println(now.getDayOfWeek()); // MONDAY
```

**is* para comparações:

```java
MonthDay day1 = MonthDay.of(1, 1); //01/jan
MonthDay day2 = MonthDay.of(1, 2); //02/jan
System.out.println(day1.isAfter(day2)); //false
System.out.println(day1.isBefore(day2)); //true
```

**with* para retornar um novo objeto alterado a partir de um original:

```java
LocalDate d = LocalDate.of(2015, 4, 1); //2014-04-01
d = d.withDayOfMonth(15).withMonth(3); //chaining
System.out.println(d); //2015-03-15
```

**plus* e *minus* para (in|de)crementar uma data:

```java
LocalDate d = LocalDate.of(2013, 9, 7);
d = d.plusDays(1).plusMonths(3).minusYears(2);
System.out.println(d); // 2011-12-08
```

## Trabalhando com a API legada

Converter java.util.Date em LocalDateTime:

```java
Date d = new Date();
Instant i = d.toInstant();
LocalDateTime ldt1 =
LocalDateTime.ofInstant(i, ZoneId.systemDefault());
```
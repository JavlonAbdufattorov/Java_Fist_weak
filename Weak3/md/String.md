# Методы класса String в Java

## length()
Возвращает длину строки (количество символов).

Пример:
```java
String s = "Java";
System.out.println(s.length()); // 4
```

## charAt(int index)
Возвращает символ по указанному индексу (индексация начинается с 0).

Пример:
```java
String s = "Java";
System.out.println(s.charAt(1)); // 'a'
```

## substring(int begin, int end)
Возвращает подстроку начиная с индекса begin (включительно)
и заканчивая индексом end (не включительно).

Пример:
```java
String s = "JavaCore";
System.out.println(s.substring(0, 4)); // "Java"
```

## contains(String s)
Проверяет, содержит ли строка указанную подстроку.

Пример:
```java
String s = "Java Core";
System.out.println(s.contains("Core")); // true
```

## startsWith(String s)
Проверяет, начинается ли строка с указанной подстроки.

Пример:
```java
String s = "Java Core";
System.out.println(s.startsWith("Java")); // true
```

## endsWith(String s)
Проверяет, заканчивается ли строка указанной подстрокой.

Пример:
```java
String s = "Java Core";
System.out.println(s.endsWith("Core")); // true
```

## indexOf(String s)
Возвращает индекс первого вхождения подстроки.  
Если подстрока не найдена, возвращает -1.

Пример:
```java
String s = "Java Core Java";
System.out.println(s.indexOf("Java")); // 0
```

## lastIndexOf(String s)
Возвращает индекс последнего вхождения подстроки.  
Если подстрока не найдена, возвращает -1.

Пример:
```java
String s = "Java Core Java";
System.out.println(s.lastIndexOf("Java")); // 10
```

## replace(old, new)
Заменяет все вхождения одной подстроки на другую.

Пример:
```java
String s = "Java is cool";
System.out.println(s.replace("Java", "Python"));
// "Python is cool"
```

## toLowerCase()
Преобразует все символы строки в нижний регистр.

Пример:
```java
String s = "JAVA";
System.out.println(s.toLowerCase()); // "java"
```

## toUpperCase()
Преобразует все символы строки в верхний регистр.

Пример:
```java
String s = "java";
System.out.println(s.toUpperCase()); // "JAVA"
```

## trim()
Удаляет пробелы в начале и в конце строки.

Пример:
```java
String s = "  Java Core  ";
System.out.println(s.trim()); // "Java Core"
```

## isEmpty()
Проверяет, пуста ли строка (длина равна 0).

Пример:
```java
String s = "";
System.out.println(s.isEmpty()); // true
```

## join(CharSequence delimiter, CharSequence... elements)
Объединяет несколько строк в одну, используя указанный разделитель между ними.

Пример:
```java
String result = String.join(", ", "Java", "Python", "C++");
System.out.println(result);
// "Java, Python, C++"
```

Пример с массивом:
```java
String[] languages = {"Java", "Python", "C++"};
String result = String.join(" | ", languages);
System.out.println(result);
// "Java | Python | C++"
```


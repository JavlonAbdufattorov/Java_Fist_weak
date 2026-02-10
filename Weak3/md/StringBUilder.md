# StringBuilder в Java

## Что такое StringBuilder
`StringBuilder` — это класс для работы со строками, которые можно изменять.
В отличие от `String`, объект `StringBuilder` можно менять без создания новых объектов.

Пример:
```java
StringBuilder sb = new StringBuilder("Java");
sb.append(" Core");
System.out.println(sb); // Java Core
```

---

## Почему не стоит часто менять String
`String` является неизменяемым (immutable).  
При каждом изменении создаётся новый объект, что замедляет программу и расходует память.

Пример:
```java
String s = "";

for (int i = 0; i < 5; i++) {
    s += i;
}
```

---

## Преимущество StringBuilder
`StringBuilder` изменяет данные внутри одного объекта, что делает код быстрее и эффективнее.

Пример:
```java
StringBuilder sb = new StringBuilder();

for (int i = 0; i < 5; i++) {
    sb.append(i);
}

String result = sb.toString();
```

---

## Внутреннее устройство
Внутри `StringBuilder` используется массив `char[]`.  
По умолчанию начальная ёмкость равна **16** символам.

Можно задать ёмкость заранее:
```java
StringBuilder sb = new StringBuilder(100);
```

---

## Основные методы StringBuilder

### append(...)
Добавляет данные в конец строки.

```java
sb.append("Java");
sb.append(17);
sb.append(true);
```

---

### insert(int offset, ...)
Вставляет данные в указанную позицию.

```java
StringBuilder sb = new StringBuilder("Java Core");
sb.insert(5, "Advanced ");
```

---

### delete(int start, int end)
Удаляет символы с индекса `start` (включительно)
по индекс `end` (не включительно).

```java
sb.delete(5, 14);
```

---

### deleteCharAt(int index)
Удаляет символ по индексу.

```java
sb.deleteCharAt(0);
```

---

### replace(int start, int end, String str)
Заменяет часть строки другой строкой.

```java
sb.replace(0, 4, "Python");
```

---

### reverse()
Переворачивает строку.

```java
sb.reverse();
```

---

### setCharAt(int index, char ch)
Заменяет символ по указанному индексу.

```java
sb.setCharAt(0, 'j');
```

---

### length()
Возвращает длину строки.

```java
sb.length();
```

---

### capacity()
Возвращает текущую ёмкость внутреннего массива.

```java
sb.capacity();
```

---

### toString()
Преобразует `StringBuilder` в `String`.

```java
String result = sb.toString();
```
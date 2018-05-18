# Java Лаб. работы

## Task_1:

Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Размеры отрезка и параметры задаются в качестве параметров в консоли.

Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции:

F(x) = tg(2x) - 3

### Запуск
    ./lab1.sh a b h

## Task_2:

1) Создать приложение с 2 классами - Book, Shoe и интерфейсом Product.
Интерфейс содержит метод whoAmI, который будет реализован в имплементирующих классах.

2) Определить новый интерфейс Present, расширяющий интерфейс Product и содержащий метод itCanBePresented(), который может возвращать строку.

3) Объявить 2 новых класса (например Toy, Picture), реализующих интерфейс Present.

4) В приложении создать массив объектов Product - (Book, Shoe, Toy, Picture), состоящий из количества элементов, заданного параметром.

5) Найти в массиве те объекты, которые реализуют интерфейс Present и выполнить для них метод itCanBePresented().

Вывод должен содержать названия всех продуктов из массива, затем только тех продуктов, которые реализуют интерфейс Present.

### Запуск
    ./lab2.sh count

## Task_3:

Создать приложение, позволяющее читать значение по ключу из *.properties-файлов.

В качестве входных параметров (в консоли) задаются: имя файла и ключ, для которого нужно получить значение.

Обработать все возможные исключительные ситуации.

### Запуск:
    ./lab3.sh file1.properties key1

## Task_4:

Создать приложение, позволяющее читать *.properties-файлы. Физическое чтение файла должно происходить только один раз.

Результаты чтения храните в коллекции типа Map. После прочтения файла, пользователь может работать с ним через консоль, запрашивая значения по ключам, пока не нажата клавиша ESC.

### Запуск:
    ./lab3.sh file1.properties
### Выход:
    q

## Task_5:

Создать приложение с 3 потоками для следующей задачи:

3 работника выполняют следующую работу:

- 1-ый копает яму,

- 2-ой сажает дерево,

- 3-ий подвязывает саженец к кольям.

Работа идет строго по очереди. Число саженцев задается параметром.

Выводить на дисплей номер работника и номер саженца.
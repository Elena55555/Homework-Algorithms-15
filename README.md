
## РАБОТА АЛГОРИТМЫ
# В  работе требуется написать еще одну реализацию интерфейса из прошлого домашнего задания, но с дополнительными методами.

 

Необходимо:

Написать вторую реализацию интерфейса списка (скопировать и скорректировать первую) из прошлого домашнего задания, но «подогнать» под работу с целыми числами, используя ссылочный тип Integer.
Добавить в реализацию приватный метод с самой быстрой из рассмотренных сортировок.
Для выявления самой быстрой сортировки следует сравнить сортировки по времени выполнения на случайно сгенерированном массиве со 100 000 элементов.

Замерить можно следующим кодом:

long start = System.currentTimeMillis();
ваш_метод_сортировки(arr);
System.out.println(System.currentTimeMillis() - start);

Учесть, что для сравнения сортировок нужно использовать 3 разные копии массива, т. к. сортировать уже отсортированный ранее массив некорректно.

Код самого сравнения прикладывать по желанию.

Добавить в реализацию приватный метод бинарного поиска.
Учесть, что метод contains уже был реализован в прошлом ДЗ.

Его следует переработать, осуществив сортировку (реализованную в шаге 2) и вызвав метод бинарного поиска.

 

Сгенерировать массив можно с помощью кода из домашнего задания по массивам.
После генерации требуется сделать копию массива через Arrays.copyOf для использования в других сортировках.
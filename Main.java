public class Main {

  // Метод 1: Создать переменные всех пройденных типов данных и инициализировать их значения.
  public static void initAllKnownDataTypes() {
    char letter = 'A';
    int number = 42;
    String name = "Chewbaka";
    byte byte_var = 5;
    short short_var = 1000;
    long long_var = 100000000000L;
    float float_var = 3.14f;
    double pi = 3.1415;
    boolean is_it_false = true; // xD
    int[] array_with_some_numbers = { 42, 19, 56 };

    System.out.println(
      "-----Задача 1. Инициализировать все известные переменные.-----"
    );
    System.out.println("letter = " + letter);
    System.out.println("number = " + number);
    System.out.println("name = " + name);
    System.out.println("byte_var = " + byte_var);
    System.out.println("short_var = " + short_var);
    System.out.println("long_var = " + long_var);
    System.out.println("float_var = " + float_var);
    System.out.println("pi = " + pi);
    System.out.println("is_it_false = " + is_it_false);
    System.out.println(
      "array_with_some_numbers = " +
      java.util.Arrays.toString(array_with_some_numbers)
    );
  }

  // Метод 2: Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
  public static void greet(String name) {
    System.out.println(
      "-----Задача 2. Поприветствовать <имя на входе функции>-----"
    );
    System.out.println("Привет " + name + "!");
  }

  // Метод 3: Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
  public static boolean isItNegative(int number) {
    return number < 0; // будем считать, что 0 положительное число
  }

  // Метод 4: 4 Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное.
  public static void printPositiveOrNegative(int number) {
    System.out.println(
      "-----Задача 4. Напечатать, положительное число или отрицательное.-----"
    );
    if (number == 0) {
      System.out.println("Число " + number + " ни то, ни другое.");
    } else if (number > 0) {
      System.out.println("Число " + number + " положительное.");
    } else {
      System.out.println("Число " + number + " отрицательное.");
    }
  }

  // Метод 5: Написать метод, который выводит последовательность чисел от 1000 до 0, кратных 3
  public static void printMultiplesOfThree() {
    System.out.println(
      "-----Задача 5. Вывести числа от 1000 до 0, кратные 3.-----"
    );
    for (int i = 1000; i >= 0; i--) {
      if (i % 3 == 0) {
        System.out.println(i);
      }
    }
  }

  // Точка входа
  public static void main(String[] args) {
    initAllKnownDataTypes();
    greet("Chewbacca");
    System.out.println("-----Задача 3. Число отрицательное? Тогда да.-----");
    System.out.println(isItNegative(-5));
    printPositiveOrNegative(-43);
    printPositiveOrNegative(0);
    printPositiveOrNegative(42);
    printMultiplesOfThree();
  }
}

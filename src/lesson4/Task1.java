package lesson4;

public class Task1 {
    public static void big(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {

        big(3333, 9999);

    }

    // 1.	Напишите метод, который из двух параметров типа int
    //      возвращает бОльшее значение.
    //      Проверьте работу метода на числах 3333 и 9999.
}

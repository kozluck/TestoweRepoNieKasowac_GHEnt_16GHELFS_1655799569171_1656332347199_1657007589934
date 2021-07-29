package lesson4;

public class Task2 {
    public static void zero(int a) {
        if (a > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        zero(555);
        zero(-555);

    }


}

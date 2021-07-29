package lesson4;

public class Task7 {
    public static void main(String[] args) {
//        7.	Замените условную конструкцию if else на конструкцию switch
//        String str = "A";
//        if (str.equals("A")) {
//            System.out.println("A");
//        } else if (str.equals("B")) {
//            System.out.println("B");
//        } else {
//            System.out.println("C");
//        }
        String str = "9";
        switch (str) {
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            default:
                System.out.println("C");
                break;
        }



    }
}

package lesson5;

public class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;
        //динамическая инициализациая переменной c
        double c = Math.sqrt (a*a+b*b);
        System.out.println("Гипотенуза равна " + c);

    }
}

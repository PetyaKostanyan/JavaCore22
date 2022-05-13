package lesson5;

public class Area {
    public static void main(String[] args) {
        double pi, r, a;
        r = 10.8;        // радиус окружности
        pi = 301416;    // приблизительное значение числа пи
        a = pi * r * r; // вычислить площадь круга
        System.out.println("площадь круга равна " + a);
    }
}

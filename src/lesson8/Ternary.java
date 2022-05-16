package lesson8;

public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.println(i + " равно " + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.println(i + " равно " + k);
    }
}

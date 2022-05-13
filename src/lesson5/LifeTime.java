package lesson5;

public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1;//переменная y иницализируется при
            //каждом вхождении в блок кода
            System.out.println("y ровно: " + y);
            //здесь всегда выводится значение -1
            y = 100;
            System.out.println("y теперь равно։ " + y);

        }
    }
}

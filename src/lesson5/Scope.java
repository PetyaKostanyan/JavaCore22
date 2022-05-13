package lesson5;

public class Scope {
    public static void main(String[] args) {
        int x; //эта переменная доступна всему
        //коду из методоа main
        x = 10;
        if (x == 10) {//начало новой области действия,
            //доступной толко этому блоку кода
            x = 10;
            if (x == 10) {//начало новой области дуйствияб
                int y = 20;// доступной только этому блоку кода
                //обе переменние x и y доступны в этой области действия
                System.out.println("x и y: " + x + " " + y);
                x = y * 2;
            }
                System.out.println("x равно " + x);
            }
        }
    }

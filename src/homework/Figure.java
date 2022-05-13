package homework;

public class Figure {
    public static void main(String[] args) {

        //Figure Example 4

        for (int i = 3; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 3; k >= i; k--) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");

            }

        }

    }

}



package arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {5, 10, 2, 30, 55, 68, 86, 7, 62, 18};

//        Տպեք մասիվի բոլոր էլեմենտները,

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


//        Տպեք մասիվի ամենամեծ թիվը,

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("max = " + max);


//        Տպեք մասիվի ամենափոքրը թիվը,

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        System.out.println("min = " + min);


//        Տպեք մասիվի բոլոր զույգ էլեմենտները,

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();


//        Տպեք մասիվի բոլոր կենտ էլեմենտները։

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();


//        Տպեք զույգերի քանակը։

        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                even++;
        }
        System.out.println("even = " + even);


//        Տպեք կենտերի քանակը

        int oodd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                oodd++;
        }
        System.out.println("oodd = " + oodd);


//        Տպեք մասիվի բոլոր թվերի միջին թվաբանականը

        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.println("result = " + result / array.length);


//        Տպեք մասիվի էլեմենտների գումարը։

        int sum = 0;
        int k;
        for (k = 0; k < array.length; k++) {
            sum = sum + array[k];
        }
        System.out.println("sum = " + sum);

    }
}
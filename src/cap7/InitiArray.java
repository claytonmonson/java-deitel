package cap7;

public class InitiArray {
    public static void main(String[] args) {
//        int[] array= new int[10];
//        int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };

        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];

        for (int counter = 0; counter < array.length; counter++ ) {
            array[counter] = 2 + 2 * counter;
        }

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}

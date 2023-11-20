package cap2;

import java.util.Scanner;

public class Product {

    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);

        int x, y, z, result;

        System.out.print("Enter first integer: ");
        x = sc.nextInt();
        System.out.print("Enter second integer: ");
        y = sc.nextInt();
        System.out.print("Enter third integer: ");
        z = sc.nextInt();

        result = x * y * z;
        System.out.printf("Product is %d%n", result);

        sc.close();
    }
}

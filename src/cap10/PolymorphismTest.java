package cap10;

import cap9.BasePlusComissionEmployee;
import cap9.ComissionEmployee;

public class PolymorphismTest {
    public static void main(String[] args) {
        ComissionEmployee comissionEmployee = new ComissionEmployee(
                "Sue", "Jones", "222-22-22", 10000, .06);

        BasePlusComissionEmployee basePlusComissionEmployee= new BasePlusComissionEmployee(
                "Bob", "Lewis", "333-33-33", 5000, .04, 300);

        System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee's toString with superclass reference ",
                "to superclass object", comissionEmployee.toString());

        System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployee's toString with subclass",
                "reference to subclass object", basePlusComissionEmployee.toString());

        ComissionEmployee comissionEmployee2 = basePlusComissionEmployee;

        System.out.printf("%s %s:%n%n%s%n%n",
                "Call BasePlusCommissionEmployee's toString with superclass",
                "reference to subclass object", comissionEmployee2.toString());

    }
}

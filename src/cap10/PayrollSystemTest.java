package cap10;

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith",
                        "111-11-1111", 800.00);

        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price",
                        "222-22-2222", 16.75, 40);

        System.out.println("Employees processed individually");

        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                hourlyEmployee, "earned", hourlyEmployee.earnings());

        // cria um array Employee de quatro elementos
        Employee[] employees = new Employee[2];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;


        System.out.printf("Employees processed polymorphically: %n%n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        } // for final

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s%n", j,
                    employees[j].getClass().getName());
        }
    }

}

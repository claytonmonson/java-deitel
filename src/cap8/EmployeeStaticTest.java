package cap8;

public class EmployeeStaticTest {
    public static void main(String[] args) {

        System.out.printf("Employees before instantiation: %d%n",
                EmployeeStaticVar.getCount());

        EmployeeStaticVar e1 = new EmployeeStaticVar("Susan", "Baker");
        EmployeeStaticVar e2 = new EmployeeStaticVar("Bob", "Blue");

        System.out.printf("%nEmployees after instantiation:%n");
        System.out.printf("via e1.getCount(): %d%n", e1.getCount());
        System.out.printf("via e2.getCount(): %d%n", e2.getCount());
        System.out.printf("via EmployeeStatic.getCount(): %d%n", EmployeeStaticVar.getCount());

        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n",
                e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getLastName());
    }
}

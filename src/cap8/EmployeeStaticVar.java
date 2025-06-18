package cap8;

import java.io.FilterOutputStream;

public class EmployeeStaticVar {
    private static int count = 0;
    private String firstName;
    private String lastName;

    public EmployeeStaticVar(String firsName, String lastName) {
        this.firstName = firsName;
        this.lastName = lastName;

        ++count;
        System.out.printf("Employee constructor: %s %s; count = %d%n",
                firstName, lastName, count);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public static int getCount() {
        return count;
    }
}

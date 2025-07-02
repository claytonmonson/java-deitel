package cap9;

public class ComissionEmployee extends Object {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public ComissionEmployee(String firstName, String lastName,
                             String socialSecurityNumber, double grossSales,
                             double comissionRate) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        if (comissionRate <= 0.0 || comissionRate >= 1.0) {
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = comissionRate;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return this.grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }

    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "Commission employee", getFirstName(), getLastName(),
                "Social Security number", getSocialSecurityNumber(),
                "Gross sales", getGrossSales(),
                "Commission rate", getCommissionRate());
    }
}

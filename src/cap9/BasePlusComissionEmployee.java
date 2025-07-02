package cap9;

public class BasePlusComissionEmployee extends ComissionEmployee{
    private double baseSalary;

    public BasePlusComissionEmployee(String firstName, String lastName,
                                     String socialSecurityNumber, double grossSales,
                                     double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + (getCommissionRate() * getGrossSales());
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base salaried",
                super.toString(), "base salary", getBaseSalary());
    }

}

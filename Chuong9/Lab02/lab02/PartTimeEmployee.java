
package leson09.lab02;

public class PartTimeEmployee extends Employee{
    int workingHour;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHour) {
        super(name, paymentPerHour);
        this.workingHour = workingHour;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }
    public int calculateSalary()
    {
        return paymentPerHour * workingHour;
    }
    public void showInfo()
    {
        System.out.printf("Part time employee:\nName: %s, salary per day: %d\n", name,calculateSalary());
    }
}

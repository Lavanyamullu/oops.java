class mployee {
    public void calculateSalary() {
        System.out.println("Calculating salary for an employee.");
    }
}
class Manager extends mployee {
    @Override
    public void calculateSalary() {
        double baseSalary = 5000.0;
        double bonus = 2000.0;
        double totalSalary = baseSalary + bonus;
        System.out.println("Manager's salary: $" + totalSalary);
    }
}
class Developer extends mployee {
    @Override
    public void calculateSalary() {
        double hourlyRate = 25.0;
        int hoursWorked = 160;
        double totalSalary = hourlyRate * hoursWorked;
        System.out.println("Developer's salary: $" + totalSalary);
    }
}
public class Manage {
    public static void main(String[] args) {
        mployee manager = new Manager();
        manager.calculateSalary();
        mployee developer = new Developer();
        developer.calculateSalary(); 
    }
}
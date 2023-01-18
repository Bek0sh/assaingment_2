public class Employee extends Person implements IPayable {
    private double salary;
    private String position;

    public Employee() {}

    public Employee(String name, String position, String surname, double salary ) {
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public double getPayment() {
       return getSalary();
    }
}

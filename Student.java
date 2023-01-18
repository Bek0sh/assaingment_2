public class Student extends Person implements IPayable {
    private double gpa;
    final private double stipend = 36600;

    private String position;

    public Student() {

    }

    @Override
    public String getPosition() {
        return position;
    }

    public Student(String name,String surname,double gpa, String position) {

        super(name, surname);
        setGpa(gpa);
        setPosition(position);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }



    @Override
    public double getPayment() {
        if(getGpa() >= 2.67)
            return stipend;
        return 0;
    }

}

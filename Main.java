import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Student("Beka", "Beka", 3.9, "Student");
        Person person1 = new Student("Yernar", "Koshkarbay", 4.0, "Student");
        Person person2 = new Employee("sa", "DASDAS", "Employee", 50000);
        Person person3 = new Employee("SOAKOSKAOSK", "fsadfasfsd", "Employee", 4343);
        Person person4 = new Student("Ars", "Ars", 1.0, "Student");
        List<Person> people = new ArrayList<>();
        people.add(person);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for(Person person : people) {
            System.out.println(person + " earns " + person.getPayment());
        }
    }
}


public abstract class Person implements IPayable, Comparable<Person> {
    private static int nextId = 1;
    private int id = 0;
    private String name;
    private String surname;

    public Person() {
        id = nextId++;
    }
    public Person(String name, String surname) {
        id = nextId++;
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public abstract String getPosition();

    @Override
    public String toString() {
        return this.getPosition() + ":"
                + id
                + ". " + name +
                " " + surname;
    }

    @Override
    public int compareTo(Person person) {
        return Double.compare(getPayment(),person.getPayment());
    }
}

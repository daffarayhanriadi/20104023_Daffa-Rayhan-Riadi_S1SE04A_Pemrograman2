package modul6.percobaan;

public class Person {
    protected String name;
    protected String address;

    public Person() {
        System.out.println("Inside Person : Constructor");
        name = "";
        address = "";
    }

    public Person(String name, String addresss) {
        this.name = name;
        this.address = addresss;
    }

}

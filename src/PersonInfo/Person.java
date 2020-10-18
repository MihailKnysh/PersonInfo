package PersonInfo;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String firstName;
    private String lastName;
    private Address address;
    //List<Person> personList=new ArrayList<>();


    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nName: " + firstName + ' ' + lastName + "\n\n" +
                "Address\n" + address;
    }
}

package PersonInfo;

import java.util.Scanner;

interface IFileWriter {
    String writeDataFile(String data);
}

class FileWriterImpl implements IFileWriter {
    @Override
    public String writeDataFile(String data) {
        return new String();
    }
}

public class Main {
    public static void main(String[] args) {
        String firstName, lastName;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Who are you?");
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();

        Address.Builder address = new Address.Builder();

        System.out.println("\nWhat is your address?");
        System.out.print("Enter index: ");
        address.addIndex(scanner.nextLine());
        System.out.print("Enter country: ");
        address.addCountry(scanner.nextLine());
        System.out.print("Enter city: ");
        address.addCity(scanner.nextLine());
        System.out.print("Enter street: ");
        address.addStreet(scanner.nextLine());
        System.out.print("Enter house`s number: ");
        address.addHouse(scanner.nextInt());
        System.out.print("Enter apartment`s number: ");
        address.addApartment(scanner.nextInt());

        Person person = new Person(firstName, lastName, address.build());

        System.out.println("\n\nYour personal data");
        System.out.println(person);
    }
}

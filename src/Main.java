import model.Address;
import model.Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Address address = new Address();
        Person person = new Person("John", "Smith", 18, 352532, "kowalski@wp.pl", address);

        System.out.println("Proszę podaj swoje imie");
        Scanner sc = new Scanner(System.in);
        person.setFirstName(sc.nextLine());


        System.out.println(person);



    }
}

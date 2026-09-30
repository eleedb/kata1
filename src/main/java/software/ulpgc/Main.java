package software.ulpgc;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {
        Person person = new Person("Lucía", LocalDate.of(2001, 3, 4));
        System.out.println(person.age());
    }
}

package software.ulpgc;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    static void main() {
        Person person = new Person("Lucía", LocalDate.of(2001, 3, 4));
        System.out.println(person.age());
    }
}

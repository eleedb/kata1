package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lucía", LocalDate.of(3, 4, 2001));
        System.out.println(person.age());
    }
}

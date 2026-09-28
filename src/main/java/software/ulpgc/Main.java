package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lucía", LocalDate.of(2001, 4, 3));
        System.out.println(person.age());
    }
}

package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lucía", LocalDate.of(1990, 1, 1));
        System.out.println(person.age());
    }
}

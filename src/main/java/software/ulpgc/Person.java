package software.ulpgc;

import java.time.LocalDate;

public record Person(String name, LocalDate bithday) {

    public int age(){
        return toYears(LocalDate.now().toEpochDay()-bithday.toEpochDay());
    }

    private static final double DAYS_PER_YEAR = 365.5;
    private int toYears(long days) {
        return (int) (days/DAYS_PER_YEAR);
    }
}

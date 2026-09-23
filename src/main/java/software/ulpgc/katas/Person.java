package software.ulpgc.katas;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.time.LocalDate;

public record Person(String name, LocalDate birthdate) {

    public int age(){
        return toYears(LocalDate.now().toEpochDay() - birthdate.toEpochDay());
    }

    private static final double DAYS_PER_YEAR = 365.25;
    private int toYears(long days) {
        return (int) (days/ DAYS_PER_YEAR);
    }
}

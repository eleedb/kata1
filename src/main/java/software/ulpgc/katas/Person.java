package software.ulpgc.katas;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.time.LocalDate;

public record Person(String name, LocalDate birthdate) {
}

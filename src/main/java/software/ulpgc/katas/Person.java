package software.ulpgc.katas;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }
}

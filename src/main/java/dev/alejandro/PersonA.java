package dev.alejandro;

public class PersonA {

    private String name;

    private String DNI;

    public PersonA(String name, String DNI) {
        this.name = name;
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public String getDNI() {
        return this.DNI;
    }

}

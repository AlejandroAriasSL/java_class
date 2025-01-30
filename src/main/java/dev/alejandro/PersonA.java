package dev.alejandro;

public class PersonA {

    private String name;
    private String DNI;
    private int YearOfBirth;

    public PersonA(String name, String DNI, int YearOfBirth) {
        this.name = name;
        this.DNI = DNI;
        this.YearOfBirth = YearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getDNI() {
        return this.DNI;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

}

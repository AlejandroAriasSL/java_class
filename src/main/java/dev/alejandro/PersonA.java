package dev.alejandro;

public class PersonA {

    private String name;
    private String DNI;
    private int YearOfBirth;
    private String surname;

    public PersonA(String name, String DNI, int YearOfBirth, String surname) {
        this.name = name;
        this.DNI = DNI;
        this.YearOfBirth = YearOfBirth;
        this.surname = surname;
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

    public String getSurname() {
        return surname;
    }

}

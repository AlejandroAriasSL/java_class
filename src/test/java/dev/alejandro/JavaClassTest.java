package dev.alejandro;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

public class JavaClassTest {

    @Test
    @DisplayName("Class PersonA is a class")
    public void test_person_is_a_class() {

        PersonA person = new PersonA("gato", "33333333D");

        assertThat(person, instanceOf(PersonA.class));
    }
    @Test
    @DisplayName("Class PersonA name is a string")
    public void test_person_name_is_string() {

        PersonA person = new PersonA("alejandro", "33333333D");

        assertThat(person.getName(), is(instanceOf(String.class)));
    }
    @Test
    @DisplayName("Class PersonA DNI is a string")
    public void test_person_dni_is_string() {

        PersonA person = new PersonA("gato","33333333D");

        assertThat(person.getDNI(), is(instanceOf(String.class)));
    }
    @Test
    @DisplayName("DNI is 9 characters long")
    public void test_person_dni_is_9_characters_long() {

        PersonA person = new PersonA("Alejandro", "35435243B");

        assertThat(person.getDNI().length(), is(9));
    }

}

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

        PersonA person = new PersonA();

        assertThat(person, instanceOf(PersonA.class));
    }

}

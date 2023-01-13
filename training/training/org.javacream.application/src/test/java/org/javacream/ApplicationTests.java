package org.javacream;

import org.javacream.application.util.Address;
import org.javacream.companies.Company;
import org.javacream.people.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationTests {
    @Test public void people(){
        final String STREET = "Marienplatz";
        final String NORMALIZED_STREET = STREET.toUpperCase();
        var p = new Person("Sawitzki", "Rainer", new Address(81371, STREET));
        Assertions.assertEquals(STREET, p.getStreet());
        Assertions.assertEquals(NORMALIZED_STREET, p.getNormalizedAddress().getStreet());
        Assertions.assertEquals(NORMALIZED_STREET, p.getNormalizedStreet());
    }
    @Test public void companies(){
        final String STREET = "Alexanderplatz";
        final String NORMALIZED_STREET = STREET.toUpperCase();
        var c = new Company("Javacream", new Address(30444, STREET));
        Assertions.assertEquals(STREET, c.getStreet());
        Assertions.assertEquals(NORMALIZED_STREET, c.getNormalizedAddress().getStreet());
        Assertions.assertEquals(NORMALIZED_STREET, c.getNormalizedStreet());
    }


}

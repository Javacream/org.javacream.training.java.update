package org.javacream.people;

import org.javacream.application.util.Address;
import org.javacream.application.util.Addressable;

import java.util.Objects;
import java.util.Optional;

public class Person implements Addressable {
    private String lastname;
    private String firstname;

    private Address address;
    private Optional<Address> optionalAddress;

    @Override
    public String toString() {
        optionalAddress.
        return "Person{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastname, person.lastname) && Objects.equals(firstname, person.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, firstname);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    public Person(String lastname, String firstname, Address address) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
    }
}

package org.javacream.people;

import org.javacream.application.util.Address;
import org.javacream.application.util.Addressable;

import java.util.Objects;
import java.util.Optional;

public class Person implements Addressable {
    private String lastname;
    private String firstname;

    @Override
    public String toString() {
        return "Person{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", address=" + address +
                '}';
    }

    private Optional<Address> address;

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
        this.address = Optional.of(address);
    }
    public void removeAddress() {
        this.address = Optional.empty();
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    @Override
    public Optional<Address> getAddress() {
        return address;
    }

    public Person(String lastname, String firstname, Address address) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = Optional.of(address);
    }
    public Person(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = Optional.empty();
    }
}

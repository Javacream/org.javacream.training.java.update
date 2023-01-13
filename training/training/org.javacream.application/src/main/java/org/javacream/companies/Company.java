package org.javacream.companies;

import org.javacream.application.util.Address;
import org.javacream.application.util.Addressable;

import java.util.Objects;

public class Company implements Addressable {
    private String name;
    private Address address;

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(address, company.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Company(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}

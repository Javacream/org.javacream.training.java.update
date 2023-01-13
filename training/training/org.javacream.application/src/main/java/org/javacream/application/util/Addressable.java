package org.javacream.application.util;

public interface Addressable {
    Address getAddress();
    default String getStreet(){
        return getAddress().getStreet();
    }
    default Integer getPostalCode(){
        return getAddress().getPostalCode();
    }

    default Address getNormalizedAddress(){
        var address = getAddress();
        var normalizedAddress = new Address(address.getPostalCode(), normalize(address.getStreet()));
        return normalizedAddress;
    }
    default String getNormalizedStreet(){
        var address = getAddress();
        return normalize(address.getStreet());
    }

    private String normalize(String s){
        return s.toUpperCase();
    }
}

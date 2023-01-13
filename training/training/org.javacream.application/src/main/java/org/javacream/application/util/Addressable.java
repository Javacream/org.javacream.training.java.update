package org.javacream.application.util;

import java.util.Optional;

@FunctionalInterface
public interface Addressable {
    Optional<Address> getAddress();
    default Optional<String> getStreet(){
        var optionalAddress = getAddress();
        if (optionalAddress.isPresent()){
            return Optional.of(optionalAddress.get().getStreet());
        }else{
            return Optional.empty();
        }
    }
    default Optional<Integer> getPostalCode(){
        var optionalAddress = getAddress();
        if (optionalAddress.isPresent()){
            return Optional.of(optionalAddress.get().getPostalCode());
        }else{
            return Optional.empty();
        }
    }

    default Optional<Address> getNormalizedAddress(){
        var optionalAddress = getAddress();
        if (optionalAddress.isPresent()){
            var address = optionalAddress.get();
            var normalizedAddress = new Address(address.getPostalCode(), normalize(address.getStreet()));
            return Optional.of(normalizedAddress);
        }
        else{
            return Optional.empty();
        }
    }
    default Optional<String> getNormalizedStreet(){
        var optionalAddress = getAddress();
        if (optionalAddress.isPresent()){
            return Optional.of(normalize(optionalAddress.get().getStreet()));
        }
        else{
            return Optional.empty();
        }
    }

    private String normalize(String s){
        return s.toUpperCase();
    }
}

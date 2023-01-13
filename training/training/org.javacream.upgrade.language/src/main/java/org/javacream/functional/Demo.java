package org.javacream.functional;

import java.util.function.Function;

public class Demo {

    public void demoClassic(){
        Function<String, Integer> f = new Function<>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        var result = f.apply("Foo");

    }
    public void demoFunctional(){
        //Lambda expression:
//        Function<String, Integer> f = (String s) -> {return s.length()};
//        Function<String, Integer> f = (s) -> {return s.length()};
//        Function<String, Integer> f = s -> {return s.length()};
        Function<String, Integer> f = s -> s.length();
        var result = f.apply("Foo");

        // method reference
        Function<String, Integer> f2 = this::foo;
        var result2 = f2.apply("Foo");
    }

    public Integer foo(String s){
        return s.length();
    }


}

package org.javacream.declaration;

public class Demo {
//    private var name = "Hello";
    public void doSomething(/*var param**/){
        //String message = new String("Hello");
        var message = new String("Hello"); //Type Inference
        //System.out.println(message.);
        var m2 = demo();
        //String sb = new ("Hello"); //does not work with custom types, type inference always from right to left
    }

    private String demo(){
        return "Hello";
    }
//    private var demo2(){ //-> var not as return type
//        return "Hello";
//    }
}

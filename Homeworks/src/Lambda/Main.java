package Lambda;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        //Without lambda, this is how it would look like.
//        Lambda.aFunctionalInterface helloLambda = new Lambda.aFunctionalInterface() {
//            @Override
//            public void doSomething(String name) {
//
//                System.out.println(name + " greets you!");
//            }
//        };
//
//        Lambda.aFunctionalInterface doingLambda = new Lambda.aFunctionalInterface() {
//            @Override
//            public void doSomething(String name) {
//
//                System.out.println(name + " does something...");
//            }
//        };

        //With lambda:
        Lambda.aFunctionalInterface helloLambda = name -> System.out.println(name + " greets you!");
        Lambda.aFunctionalInterface doingLambda = name -> System.out.println(name + " does something...");

        helloLambda.doSomething("Rafael");
        doingLambda.doSomething("Rafael");

        //A function which accepts two arguments (first two strings) and produces a result (last string).
        BiFunction<String, String, String> fullGreeting = (firstName, lastName) -> "Hello " + firstName + " " + lastName;

        //The apply function is doing as the name implies, applies the function fullGreeting with the given parameters.
        System.out.println(fullGreeting.apply("Kitaigorod", "Rafael"));

        //A function
        Supplier<UUID> uuidSupplier = () -> generatorUUID();

        System.out.println("Supplier");

        for (int i = 0; i < 1; i++) {
            //the .get() method returns the value produced by the supplier
            System.out.println(uuidSupplier.get());
        }
    }

    private static UUID generatorUUID() {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        return UUID.randomUUID();
    }
}

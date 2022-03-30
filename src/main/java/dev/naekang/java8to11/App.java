package dev.naekang.java8to11;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {
        Greeting greeting = new Greeting();

        UnaryOperator<String> hello = greeting::hello;
        hello.apply("nakenag");

        Supplier<Greeting> newGreeting = Greeting::new;
        newGreeting.get();

        Function<String, Greeting> naekangGreeting = Greeting::new;

        Greeting naekang = naekangGreeting.apply("naekang");
        System.out.println(naekang.getName());
    }
}

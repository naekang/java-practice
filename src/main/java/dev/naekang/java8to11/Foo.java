package dev.naekang.java8to11;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Foo {
    public static void main(String[] args) {
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());
    }
}

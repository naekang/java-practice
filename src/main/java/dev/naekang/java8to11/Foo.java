package dev.naekang.java8to11;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Foo {
    public static void main(String[] args) {
        Predicate<String> startsWithNaekang = (s) -> s.startsWith("naekang");
        startsWithNaekang.negate();
    }
}

package dev.naekang.java8to11;

import java.util.function.Function;

public class Foo {
    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);

        System.out.println(multiply2AndPlus10.apply(2));
    }
}

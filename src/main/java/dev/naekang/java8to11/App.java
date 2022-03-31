package dev.naekang.java8to11;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        String[] names = {"naekang", "jinho", "toby"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}

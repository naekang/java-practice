package dev.naekang.java8to11;

// 추상메서드가 1개면 무조건 functional interface
@FunctionalInterface
public interface RunSomething {

    void doIt();

//    static void printName() {
//        System.out.println("naekang");
//    }
//
//    default void printAge() {
//        System.out.println("26?");
//    }

}

package org.example;
import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;

public class Main {
    public static void main(String[] args) {
        System.out.println(ClassOne.greet());
        System.out.println(ClassTwo.greet());
        System.out.println(ClassThree.greet());
    }
}
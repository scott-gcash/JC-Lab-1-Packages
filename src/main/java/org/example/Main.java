package org.example;
import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        out.println(ClassOne.greet());
        out.println(ClassTwo.greet());
        out.println(ClassThree.greet());
    }
}
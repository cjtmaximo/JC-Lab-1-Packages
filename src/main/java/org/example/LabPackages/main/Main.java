package org.example.LabPackages.main;

import org.example.LabPackages.packageone.ClassOne;
import org.example.LabPackages.packagetwo.ClassTwo;
import org.example.LabPackages.packagethree.ClassThree;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        ClassTwo classTwo = new ClassTwo();
        ClassThree classThree = new ClassThree();

        out.println(classOne.greet());
        out.println(classTwo.greet());
        out.println(classThree.greet());
    }
}
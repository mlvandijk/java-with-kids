package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Typ NE voor Nederlands. \nType EN for English.");
        String language = scanner.nextLine();

        boolean validLanguage = false;

        while (!validLanguage) {
            if ((Objects.equals(language, "NE") || Objects.equals(language, "EN"))) {
                validLanguage = true;
            } else {
                System.out.println("Sorry, dat begrijp ik niet. Typ NE voor Nederlands. \nSorry, I don't understand. Type EN for English.");
                language = scanner.nextLine();
            }
        }

        if (Objects.equals(language, "NE")) {
            System.out.println("Hallo, hoe heet jij?");
            String name = scanner.nextLine();

            System.out.println("Hallo " + name + ", wat is je favoriete kleur?");
            String color = scanner.nextLine();

            System.out.println(color + " is een mooie kleur. Mijn favoriete kleur is roze.");
        } else if (Objects.equals(language, "EN")) {
            System.out.println("Hello, what is your name?");
            String name = scanner.nextLine();

            System.out.println("Hello " + name + ", what is your favorite color?");
            String color = scanner.nextLine();

            System.out.println(color + " is a pretty color. My favorite color is pink.");
        }
    }
}
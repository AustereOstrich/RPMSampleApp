package com.matthewharrop;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int numberRandomsToGenerate = 1;

        if (args.length > 0) {
            try {
                numberRandomsToGenerate = Integer.parseInt(args[0]);
                if (numberRandomsToGenerate < 1) {
                    System.out.println("Please enter a valid number greater than 0 and rerun this application.");
                    return;
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number greater than 0 and rerun this application.");
            }
        }
        for (int i = 0; i < numberRandomsToGenerate; i++) {
            Random random = new Random();
            int randomInt = random.nextInt();
            System.out.println(randomInt);
        }
    }
}

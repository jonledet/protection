package com.jonledet;

import com.jonledet.utils.Tools;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2 || !args[0].equals("-S")) {
            printError();
        }
        else {
            switch (args[1]) {
                case "1" -> simulate1();
                case "2" -> simulate2();
                case "3" -> simulate3();
                default -> printError();
            }
        }
    }

    private static void printError() {
        System.err.println("-A 1 - Dining Philosophers\n-A 2 - Post Office\n-A 3 - Readers Writers\n");
    }

    private static int getInput(int origin, int bound){
        while (!Tools.input.hasNextInt()){
            Tools.input.next();
        }
        int userInput = Tools.input.nextInt();
        if (userInput > origin && userInput < bound){
            return userInput;
        }
        return getInput(origin, bound);
    }

    private static void simulate1() {

    }

    private static void simulate2() {

    }

    private static void simulate3() {

    }
}
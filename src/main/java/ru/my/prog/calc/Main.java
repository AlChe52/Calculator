package ru.my.prog.calc;

public class Main {

   

    public static void main(String[] args) {
        String message;
        InputData input = new InputData();
        message = "Welcome to Calculator";

        PrintToConcole print = new PrintToConcole();
        print.print(message);
         
        input.getData();

    }
}


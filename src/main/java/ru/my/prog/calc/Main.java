package ru.my.prog.calc;

public class Main {

   
    public static void main(String[] args) {

        PrintToConcole pc = new PrintToConcole();
        pc.print("Welcome to Calculator");
        InputData input = new InputData();
            String expression = input.getData();

            StringParser stringParser = new StringParser();
            String good = stringParser.parser(expression);
            Calculator calculator = new Calculator();

            Double finalResul = calculator.calculate(good);

            String answerMessage = "Your answer: " + finalResul;

            pc.print(answerMessage);

        }

    }



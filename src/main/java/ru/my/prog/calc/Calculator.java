package ru.my.prog.calc;

import java.util.Stack;

public class Calculator {
    StringParser parser=new StringParser();
    Stack <Double> stack = new Stack<>();

    Double calculate(String expr) {
        double da =0.0;
        String [] x= expr.split(" ");
        for (int i = 0; i <x.length ; i++) {
      if ((parser.getPriority(x[i]))==0) {
        stack.push(Double.parseDouble(x[i]));}
        if ((parser.getPriority(x[i])>0)) {
            double a=stack.pop();
            double b=stack.pop();
           switch (x[i]) {
               case "+":stack.push(a+b);
               break;
               case "-" :stack.push(b-a);
               break;
               case  "*":stack.push(a*b);
               break;
               case  "/":stack.push(b/a);
               break;
           }
        }
         }
      return stack.pop();
    }

}

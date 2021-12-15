package ru.my.prog.calc;

import java.util.Stack;

public class StringParser {

    Stack <String> stack = new Stack();

      String parser(String data) {
          String expression = "";

          String[] strings = data.split("(?<!\\\\d)|(?!\\\\d)");

          for (int i = 0; i < strings.length; i++) {
              if (getPriority(strings[i]) == 0) expression += strings[i];
              if (getPriority(strings[i])>0) {
                  expression+=" ";
                 while (!stack.empty()) {

                   if (getPriority(stack.peek())>=getPriority(strings[i])) {
                      expression+=stack.pop();
                       expression+=" ";
                   }
                   else break;
                 }
                  stack.push(strings[i]);
              }
          }
          while (!stack.empty()) {
              expression+=" ";
              expression += stack.pop();
          }
              return expression;
          }

       int getPriority(String str ) {
          if (str.equals("+") || str.equals("-"))  return 1;
          if (str.equals("*") || str.equals("/")) return 2;
      return 0;
      }






}

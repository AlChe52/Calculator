package ru.my.prog.calc;

import ru.my.prog.calc.exeption.IncorrectData;

import java.util.Scanner;

class InputData {
   private String data;
   PrintToConcole pc=new PrintToConcole();
   Scanner scanData = new Scanner(System.in);

   public void getData() {
       while (true) {
       pc.print("Please, enter your expression:");
       data =scanData.nextLine();
       if (isRight(data)) break;
      }

       }





   private boolean isRight (String data) {
     char[] check = data.toCharArray();
       for (int i = 1; i <check.length; i++) {
           if (check[i-1]=='+' && check[i]=='+' ||
               check [i-1]=='-' && check[i]=='-' ||
                   check [i-1]=='*' && check[i]=='*' ||
                   check [i-1]=='/' && check[i]=='/') {
               pc.print("Sorry, in your expression have ");
           return false;
           }
           if (check[i-1]=='/' && check[i]=='0') {
               pc.print("Sorry, we don't support divide by zero ");
               return false;
           }


       }
     if(check[0]=='-') {
         pc.print("Sorry, program doesn't work with negative numbers, wait for an update");
         return false;
     }


     return true;
     }






   }







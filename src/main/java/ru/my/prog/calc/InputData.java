package ru.my.prog.calc;

import java.util.Scanner;

class InputData {
   private String data;
   InputExeptions inputExeptions=new InputExeptions();
   PrintToConcole pc=new PrintToConcole();
   Scanner scanData = new Scanner(System.in);

  String getData() {
       while (true) {
       pc.print("Please, enter your expression:");
       data =scanData.nextLine();
       if ((inputExeptions.isRight(data))) break;
      }
       scanData.close();
       return data;
    }









   }







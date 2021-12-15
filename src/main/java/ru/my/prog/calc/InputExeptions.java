package ru.my.prog.calc;
public class InputExeptions {
  PrintToConcole pc=new PrintToConcole();
   boolean isRight (String data) {
        if (data.equals("")) {
            pc.print("You don't enter anything");
            return false;
        }
        char[] check = data.toCharArray();
        for (int i = 1; i <check.length; i++) {
            if (check[i-1]=='+' && check[i]=='+' ||
                    check [i-1]=='-' && check[i]=='-' ||
                    check [i-1]=='*' && check[i]=='*' ||
                    check [i-1]=='/' && check[i]=='/'||
                    check [i-1]=='.' && check[i]=='.' ) {
                pc.print("Sorry, in your expression to many symbol of operation or .");
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
       if (!data.matches("^\\d+(\\.\\d+)?([\\+\\-\\*\\/]\\d+(\\.\\d+)?)*$")) {
           pc.print("Sorry, we work only with numbers and +-/*");
           return false;
       }


        return true;
    }



}

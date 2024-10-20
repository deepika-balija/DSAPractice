package com.practice;

public class FourthProblem {
    
    public static void main(String[] args) {
   String input="DOWN UP 2xRIGHT DOWN 3xLEFT";
       findingCoordinates(input);
    }

    private static void findingCoordinates(String input) {
        int x=0;
        int y=0;
        String[] words = input.split(" ");
        for (String word : words) {
      if(word.equalsIgnoreCase("U") || word.equalsIgnoreCase("UP") ) {
          y+=1;
      }else if(word.equalsIgnoreCase("D") || word.equalsIgnoreCase("DOWN") ) {
          y-=1;
            }else if(word.equalsIgnoreCase("R") || word.equalsIgnoreCase("RIGHT") ) {
          x+=1;
            }else if(word.equalsIgnoreCase("L") || word.equalsIgnoreCase("LEFT") ) {
          x-=1;
            }
      else if(word.matches("\\d+x[A-Za-z]+")){
                String[] parts = word.split("x");
             int multipliers=Integer.parseInt(parts[0]);
               String direction = parts[1].toUpperCase();
               switch(direction){
                   case "UP":y+=multipliers; break;
                   case "RIGHT":x+=multipliers; break;
                   case "DOWN":y-=multipliers; break;
                   case "LEFT":x-=multipliers; break;

               }
            }
        }
        System.out.println(x+","+y);
    }
}
//"Given the string (containing directions e.g., U, R, D, L) and initial coordinates (0,0),
//        return the final coordinates after traversing the string.
//
//        Examples:
//Given (0,0) and String - ""UUU""
//Answer : (0,3)
//
//Given (0,0) and String - ""URRDDL""
//Answer : (1,-1)
//
//Additional testcase : String - ""DOWN UP 2xRIGHT DOWN 3xLEFT""
//Answer : (-1,-1)"
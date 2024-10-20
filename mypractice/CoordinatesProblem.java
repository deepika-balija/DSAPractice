package mypractice;

import java.awt.Dialog;

public class CoordinatesProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
    finalCoordinates("UUU");
    finalCoordinates("URRDDL");
    finalCoordinates("DOWN UP 2xRIGHT DOWN 3xLEFT");
	}

	private static void finalCoordinates(String direc) {
		// TODO Auto-generated method stub
		int x=0;
		int y=0;
		
		String[] directions=direc.split(" ");
		
	for(String str : directions) {
		if(str.matches("[A-Za-z]+")) {
			for(char ch:str.toCharArray()) {
			switch(ch) {
			case 'U' :  y+=1;break;
			case 'D' : y-=1;break;
			case 'R' : x+=1; break;
			case 'L' : x-=1; break;
			}}
			}else
		if(str.matches("\\d+x[A-Za-z]+")) {
				String parts[] =str.split("x");
				int multipliers = Integer.parseInt(parts[0]);
				String direction =parts[1].toUpperCase();
				
				System.out.println("Parts[0]: " + parts[0] + " Parts[1]: " + parts[1]);
				 
				switch(direction) {
				case "UP":   y += multipliers;break;
				case "DOWN" :y -= multipliers;break;
				case "RIGHT" : x += multipliers; break;
				case "LEFT": x -= multipliers; break;
				}
		}
		}
	
		System.out.println(x+","+y);
	}

}


//"Given the string (containing directions e.g., U, R, D, L) and initial coordinates (0,0),
//return the final coordinates after traversing the string.
//
//Examples:
//Given (0,0) and String - ""UUU""
//    Answer : (0,3)
//
//Given (0,0) and String - ""URRDDL""
//    Answer : (1,-1)
//
//Additional testcase : String - ""DOWN UP 2xRIGHT DOWN 3xLEFT""
//    Answer : (-1,-1)"
package com.practice;

import java.util.Stack;

public class CheckingValidParanthesis {
    public static void main(String args[]){
      //  String str= "{()}";
        String str="{[]}";
        System.out.println(checkValidParanthesis(str));
    }

    private static boolean checkValidParanthesis(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                // Pop from stack until you find a matching opening bracket

                while (!stack.isEmpty()) {
                    boolean matchFound = false;
                    char c = stack.pop();
                    if ((ch == ')' && c == '(') || (ch == '}' && c == '{') || (ch == ']' && c == '[')) {
                        matchFound = true;
                        break;
                    }
                    else {
                        return false;
                    }
                }
            }
            }
            while (stack.size() != 0) {
                if (stack.peek() == '(' || stack.peek() == ')' || stack.peek() == '{' || stack.peek() == '}'
                        || stack.peek() == '[' || stack.peek() == ']') {
                    return false;
                } else {
                    stack.pop();
                }
            }


            return stack.isEmpty();

        }
    }


//1. use stack or deque
//2. LIFO
//3. for every character
//	if it is a closing bracket
//Pop till you get an opening bracket
//check if correct bracket ( break or fail)
//	else
//push to stack
//4. check anymore opening



















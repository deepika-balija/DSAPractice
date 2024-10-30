package com.practice;

public class PowerOfTenProblem {
public static void main(String[] args) {
    System.out.println(isPowerOfTen(20));
}

static boolean isPowerOfTen(int n) {
    if(n< 0)
        return false;

    while(n>1) {
        if(n%10 != 0)
        return false;

        n/=10; // Divide by 10 to check the next digit
    }

    return false;
}

}

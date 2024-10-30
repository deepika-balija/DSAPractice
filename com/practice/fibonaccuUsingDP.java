package com.practice;

import java.util.Arrays;

public class fibonaccuUsingDP {
    private static int strg[];
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        int n=6;
        strg = new int[n+1];
        Arrays.fill(strg, -1);
       int res=fibonaccuUsingDP(n);
        System.out.println(res);
    }
    public static int fibonaccuUsingDP(int n) {
        if(n==1|| n==2)
            return n;

        if(strg[n]!=-1)
            return strg[n];

        int a=fibonaccuUsingDP(n-1);
        int b=fibonaccuUsingDP(n-2);
       int result=a+b;

       return result;
    }
}


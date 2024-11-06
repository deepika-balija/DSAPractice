package com.practice;

import java.util.Arrays;

public class NumDen {
    public static void main(String[] args) {
    int Num_frac1 = 1, Den_frac1 = 3, Num_frac2 = 3, Den_frac2 = 9;
        System.out.println(Arrays.toString(findSimplestForm(Num_frac1, Den_frac1, Num_frac2, Den_frac2)));
    }

    private static int[] findSimplestForm(int numFrac1, int denFrac1, int numFrac2, int denFrac2) {
        int num=numFrac1*denFrac2+numFrac2*denFrac1;
        int den=denFrac1*denFrac2;
        int gcd=gcd(num,den);

        num=num/gcd;
        den=den/gcd;
        return  new int[]{num,den};
    }

    private static int gcd(int num, int den) {
        while(den!=0)
        {
            int temp=den;
            den=num%den;
            num=temp;
        }
        return num;
    }
}


//"Give two fractions, the numerator and denominator represented as a pair of ints,
//        return them in their simplest form after adding them.
//
//Examples:
//        {Numerator_frac1 = 1, Denominator_frac1 = 3}                // 1/3
//        {Numerator_frac2 = 3, Denominator_frac2 = 9}                // 3/9
//        // Return Numerator_ans = 2, Denominator_ans = 3       // 2/3
//
//        {Numerator_frac1 = 1, Denominator_frac1 = 2}               // 1/2
//        {Numerator_frac2 = 3, Denominator_frac2 = 2}               // 3/2
//// Return Numerator_ans = 2, Denominator_ans = 1      // 2/1"
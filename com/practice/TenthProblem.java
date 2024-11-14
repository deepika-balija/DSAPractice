package com.practice;

public class TenthProblem {
    public static void main(String[] args) {
        String str= "112";
        System.out.println(convertStringtoInteger(str));
    }

    private static int convertStringtoInteger(String str) {
int n=0;
int k=0;

for(int i=0;i<str.length();i++){
    if(str.charAt(0)== '-') {
        k = 1;
    }
    if(str.charAt(i) >= 0 && str.charAt(i) <= '9'){
        n=(n*10)+(str.charAt(i)-'0');
    }else {
        return -1;
    }
}
if(k==1){
    n=-n;
}
return n;
         }

}
//"Implement your custom atoi function in Java.
//Given a string, you have to convert into integer. The input string may contain alphabets and special characters alongside numbers (both negative and positive).
//
//Examples:
//String str1 = "123";     //Return 123 (in integer format)
//
//String str2 = "-123";    //Return -123
//
//String str3 = "1a23";   //Return -1 (Invalid entry)"
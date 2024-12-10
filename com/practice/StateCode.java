package com.practice;

import java.util.ArrayList;
import java.util.List;

public class StateCode {
    public static void main(String[] args){
//        State st=new State();
        List<State> stList = new ArrayList<>();
        stList.add(new State("MH","Mumbai"));
        stList.add(new State("Gj","Ahmedabad"));
        System.out.println(conversionMethod(stList));
    }

    private static List<String> conversionMethod(List<State> stList) {
        List<String> result = new ArrayList<>();
        for(State st : stList){
         String city=   st.getCity();
            if(city.startsWith("A")){
                result.add(city.toUpperCase());
            }else{
                result.add(city);
            }
        }
        return result;
    }
}

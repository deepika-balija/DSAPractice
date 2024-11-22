package com.practice;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class IPAddress {
    public static  void main(String args[]) {


        String[] str = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "a.b.c.d bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93",
        };
        System.out.println(findingMaxIPAddressOccurs(str));
    }

    private static String findingMaxIPAddressOccurs(String[] str) {
        HashMap<String, Integer>  map = new HashMap<>();
        for(String ip : str){
            String s= ip.split(" ")[0];
            if(isValidIp(s)){
                map.put(s, map.getOrDefault(s,0)+1);
            }
        }
        System.out.println(map);
        int max =0;
        String ip="";
        for(Map.Entry<String,Integer> entry : map.entrySet()){

            if(entry.getValue()>max){
                max = entry.getValue();
                ip= entry.getKey();

            }
        }

        return ip;
    }
    public static boolean isValidIp(String s){
        String[] st= s.split("\\.");
        if(st.length != 4){
            return false;
        }

        for(int i=0; i< st.length; i++){
            try{
                int ip =  Integer.parseInt(st[i]);
                if(ip < 0 || ip > 255){
                    return false;
                }
            }
            catch(NumberFormatException n){
                System.out.println("Invalid Input");
                return false;
            }

        }
        return true;
    }
}
//"Given an array of strings,
//        return the IP address that occurs maximum number of times.
//    [You might have to check for the validity of the IP address before considering it].
//
//Example:
//String [] str = {
//        "10.0.0.1 bytes=32 time=50ms TTL=63",
//        "10.0.0.2 bytes=32 time=50ms TTL=73",
//        "10.0.0.4 bytes=32 time=50ms TTL=83",
//        "10.0.0.2 bytes=32 time=50ms TTL=93",
//}
//
//// Return 10.0.0.2"
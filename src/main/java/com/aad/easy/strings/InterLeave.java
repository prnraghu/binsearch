package com.aad.easy.strings;

/*Interleaved String
        Easy

        Given two strings s0 and s1, return the two strings interleaved, starting with s0.
        If there are leftover characters in a string they should be added to the end.

        Constraints

        n ≤ 100,000 where n is the length of s0
        m ≤ 100,000 where n is the length of s1*/

public class InterLeave {
    public String solve(String s0, String s1) {
        StringBuilder result = new StringBuilder();
        int s0Len = s0.length();
        int s1Len = s1.length();
        String remString = "";
        if(s0Len == 0) return s1;
        if(s1Len == 0) return s0;
        if(s0Len > s1Len){
            remString = s0.substring(s1Len);
            s0 = s0.substring(0,s1Len);
        } else if(s1Len > s0Len){
            remString = s1.substring(s0Len);
            s1 = s1.substring(0,s0Len);
        }

        for(int i = 0;i<s1.length();i++){
            result.append(s0.charAt(i));
            result.append(s1.charAt(i));
        }
        result.append(remString);
        return result.toString();


    }

    public static void main (String[] args){
        InterLeave il = new InterLeave();
        il.solve("bb","a");

    }
}

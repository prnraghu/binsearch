package com.aad.easy.strings;

import java.util.*;


/*
Shortest String
        Easy

        Given a string s consisting only of "1"s and "0"s, you can delete any two adjacent letters if they are different.

        Return the length of the smallest string that you can make if you're able to perform this operation as many times as you want.

        Constraints

        0 ≤ n ≤ 100,000 where n is the length of s
        Example 1
        Input
        s = "11000"
        Output
        1
        Explanation
        After deleting "10" we get "100" and we can delete another "10" to get "0" which has a length of 1.

*/
public class ShortestString {

    public int solve(String s) {
        while(s.indexOf("10") != -1 || s.indexOf("01") != -1){
            if(s.indexOf("10") != -1){
                s = s.replace("10","");
            }else if(s.indexOf("01") != -1){
                s = s.replace("01","");
            }
        }
        return s.length();


    }
}

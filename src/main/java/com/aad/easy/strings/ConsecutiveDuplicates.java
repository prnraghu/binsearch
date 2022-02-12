package com.aad.easy.strings;

import java.util.*;

/*Consecutive Duplicates
        Easy

        Given a string s, consisting of "X" and "Y"s, delete the minimum number of characters such that there's no consecutive "X" and no consecutive "Y".

        Constraints

        n ≤ 100,000 where n is the length of s*/



public class ConsecutiveDuplicates {

    public String solve(String s) {
        StringBuffer result = new StringBuffer();
        Stack<Character> resultStack = new Stack();
        for(char c : s.toCharArray()){
            if(resultStack.isEmpty() || resultStack.peek() != c){
                resultStack.push(c);
            }
        }

        while(!resultStack.isEmpty()){
            result.append(resultStack.pop());
        }
        return result.reverse().toString();
    }
}

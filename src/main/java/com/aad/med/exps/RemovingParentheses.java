package com.aad.med.exps;

import java.util.*;

/*
Removing Parentheses
        Medium

        Given a string of parentheses s,return the minimum number of parentheses to be removed to make the string balanced.

        Constraints

        n ≤ 100,000where n is the length of s
        Example 1
        Input
        s="()())()"
        Output
        1
        Explanation
        We can remove the")"at index 4to make it balanced.

        Example 2
        Input
        s=")("
        Output
        2
        Explanation
        We must remove all the parentheses.*/

public class RemovingParentheses {

    public int solve(String s) {
        Stack<Character> expStack = new Stack();
        char[] sChars = s.toCharArray();
        for(char c : sChars){
            if(expStack.isEmpty()){
                expStack.push(c);
            } else if( c==')' && expStack.peek() == '('){
                expStack.pop();
            } else {
                expStack.push(c);
            }
        }

        return expStack.size();
    }
}

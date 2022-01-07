package com.aad.easy.strings;

/*Vertical Cipher
        Easy

        Given a string s and an integer k,
        rearrange s into k rows so that s can be read vertically (top-down, left to right).

        Constraints

        n ≤ 10,000 where n is the length of s
        k ≤ 1,000*/

public class VerticalCipher {

    public String[] solve(String s, int k) {
        String[] result = new String[k];
        for(int i = 0; i < s.length() ; i++){
            if(result[i%k] == null) {
                result[i%k] = ""+s.charAt(i);
            } else {
                result[i%k] = result[i%k] + s.charAt(i);
            }
        }
        return result;
    }

    public static void main(String args[]){
        VerticalCipher vc = new VerticalCipher();


    }
}

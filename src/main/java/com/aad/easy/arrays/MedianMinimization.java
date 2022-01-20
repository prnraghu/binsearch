package com.aad.easy.arrays;

/*
Given a list of integers nums, split it into two lists of equal size where the absolute difference between each list's median is as small as possible and return this difference.

        Note: length of nums / 2 is guaranteed to be odd.

        Constraints

        n ≤ 100,000 where n is the length of nums
        Example 1
        Input
        nums = [1, 9, 7, 4, 3, 6]
        Output
        2
        Explanation
        We can partition the list into [1, 4, 9] and [3, 6, 7]. Their medians are 4 and 6 and abs(4 - 6) = 2
*/

import java.util.*;


public class MedianMinimization {
    public int solve(int[] nums) {
        Arrays.sort(nums);
        List<Integer> firstList = new ArrayList<Integer>();
        List<Integer> secList = new ArrayList<Integer>();

        for(int i = 0 ; i<nums.length ; i+=2){
            firstList.add(nums[i]);
            secList.add(nums[i+1]);
        }

        return Math.abs(firstList.get(firstList.size()/2) -
                secList.get(firstList.size()/2)) ;
    }
}

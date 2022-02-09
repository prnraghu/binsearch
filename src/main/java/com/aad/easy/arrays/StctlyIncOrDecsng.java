package com.aad.easy.arrays;



/*
Strictly Increasing or Strictly Decreasing
        Easy

        Given a list of integers nums, return whether the list is strictly increasing or strictly decreasing.

        Constraints

        n ≤ 100,000 where n is the length of nums
*/

public class StctlyIncOrDecsng {

    class Solution {
        public boolean solve(int[] nums) {
            if(nums.length <= 1){
                return true;
            }


            boolean inc = false;
            boolean dec = false;

            if(nums[0]>nums[1]){
                dec = true;
            }else if(nums[0]<nums[1]){
                inc = true;
            } else{
                return false;
            }

            for(int i=1;i<nums.length-1;i++){
                if(nums[i]>nums[i+1] && !dec){
                    return false;
                } else if(nums[i]<nums[i+1] && !inc){
                    return false;
                } else if(nums[i] == nums[i+1]){
                    return false;
                }
            }

            return true;

        }
    }
}

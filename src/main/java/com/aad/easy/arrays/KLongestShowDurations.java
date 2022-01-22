package com.aad.easy.arrays;
import java.util.*;

/*
Given a list of strings shows, a list of integers durations, and an integer k, where shows[i] and durations[i] represent the name and duration watched by the ith person, return the total duration watched of the k most watched shows.

        Constraints

        0 ≤ k ≤ n ≤ 100,000 where n is the length of shows and durations
        Example 1
        Input
        shows = ["Top Gun", "Aviator", "Top Gun", "Roma", "Logan"]
        durations = [5, 3, 5, 13, 4]
        k = 2
        Output
        23
        Explanation
        The top 2 most watched movies are "Roma" and "Top Gun" for total durations of 13 and 10 = 5+ 5.
*/



class KLongestShowDurations {
    public int solve(String[] shows, int[] durations, int k) {
        Map<String,Integer> showDurMap = new HashMap<String,Integer>();
        for(int i = 0; i<shows.length; i++){
            int dur = durations[i];
            if(showDurMap.keySet().contains(shows[i])){
                dur = dur + showDurMap.get(shows[i]);
            }
            showDurMap.put(shows[i],dur);
        }

        Object[] valuesArr =  showDurMap.values().toArray();
        Arrays.sort(valuesArr);
        int total = 0;
        for(int i = 0,j= valuesArr.length-1; i<k ; i++,j--){
            total = total + (Integer)valuesArr[j];
        }
        return total;


    }
}

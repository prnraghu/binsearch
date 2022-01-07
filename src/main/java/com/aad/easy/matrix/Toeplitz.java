package com.aad.easy.matrix;

/*Toeplitz Matrix
        Easy

        Given a two-dimensional matrix of integers matrix, determine whether it's a Toeplitz matrix. A Toeplitz is one where every diagonal descending from left to right has the same value.

        Constraints

        n, m ≤ 250 where n and m are the number of rows and columns in matrix
        Example 1
        Input
        matrix = [
        [0, 1, 2],
        [3, 0, 1],
        [4, 3, 0],
        [5, 4, 3]
        ]
        Output
        true*/
public class Toeplitz {

    public boolean solve(int[][] matrix) {
        for (int i = 0; i<matrix.length ; i++){
            for(int j = 0 ; j< matrix[i].length; j++){
                if( i<matrix.length-1 && j<matrix[i].length-1 && matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}

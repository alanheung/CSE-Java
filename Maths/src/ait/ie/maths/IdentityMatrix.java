package ait.ie.maths;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
public class IdentityMatrix
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows for the Matrix");
        int row = in.nextInt();
       System.out.print("Enter number of columns for the Matrix");
        int col = in.nextInt();

        int[][] matrix = new int[row][col];
         for(int r=0; r<matrix.length; r++)
         {
            for(int c=0; c<matrix[0].length; c++)
            {
                if(r==c)
                    matrix[r][c]=1;
                else
                     matrix[r][c]=0;
                System.out.print(matrix[r][c]+"   ");
            }
            System.out.print("\n");
         }
    }
}
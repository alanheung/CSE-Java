package ait.ie.maths;

import java.util.Random;
import java.util.Scanner;

public class MatrixExercise {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[]args)
    {
    	double average=0;
        Random randomGenerator = new Random();
        int[][] matrix = new int[userRow()][userCol()];
         for(int r=0; r<matrix.length; r++)
         {
            for(int c=0; c<matrix[0].length; c++)
            {
                matrix[r][c] = randomGenerator.nextInt(100);
                average+=matrix[r][c];
                System.out.print(matrix[r][c]+"   ");
            }
            System.out.print("\n");
         }
        //System.out.println("The average value of the array is "+average/(row*col));
        
         int[][] matrix2 = new int[userRow()][userCol()];
         for(int r=0; r<matrix2.length; r++)
         {
            for(int c=0; c<matrix2[0].length; c++)
            {
                matrix2[r][c] = randomGenerator.nextInt(100);
                average+=matrix2[r][c];
                System.out.print(matrix2[r][c]+"   ");
            }
            System.out.print("\n");
         }
    }
    //user input
    public static int userRow(){
    	System.out.print("Enter number of rows for the Matrix: ");
    	int row = sc.nextInt();
    	return row;
    }
    public static int userCol(){
    	System.out.print("Enter number of columns for the Matrix: ");
    	int col = sc.nextInt();
    	return col;
    }
    //min max average
    public static void calcAvg(int[][] matrix2){
    	//need to compare each value to the next value in each matrix to determine the
    	//max, min and average
        double average=0.0;
    	for(int r=0; r<matrix2.length; r++)
        {
           for(int c=0; c<matrix2[0].length; c++)
           {
               average+=matrix2[r][c];
           }
           System.out.print("\n");
        }
        System.out.println("The average value of the array is "+average/(userRow()*userCol()));
    }
    
    public static void minMax(int[] a) {
    	if (a == null || a.length < 1)
    		return;
     
    	int min = a[0];
    	int max = a[0];
     
    	for (int i = 1; i <= a.length - 1; i++) {
    		if (max < a[i]) {
    			max = a[i];
    		}
     
    		if (min > a[i]) {
    			min = a[i];
    		}
    	}
     
    	System.out.println("min: " + min + "\nmax: " + max);
    }
    // sum difference
    
    //product of the two matrices
    public static void product(){
    	
    }
}

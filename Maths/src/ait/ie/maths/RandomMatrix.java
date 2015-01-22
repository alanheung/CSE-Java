package ait.ie.maths;
import java.util.Scanner;
import java.util.Random;
public class RandomMatrix
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows for the Matrix");
        int row = in.nextInt();
        System.out.print("Enter number of columns for the Matrix");
        int col = in.nextInt();
        double average=0;
        Random randomGenerator = new Random();
        int[][] matrix = new int[row][col];
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
        System.out.println("The average value of the array is "+average/(row*col));
    }
}

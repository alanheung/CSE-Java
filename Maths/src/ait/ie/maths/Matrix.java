package ait.ie.maths;

public class Matrix
{
    public static void main(String[]args)
    {
        int[][] matrix = { {1,2,3}, {4,5,6}, {7,8,9}};
         for(int r=0; r<matrix.length; r++)
         {
            for(int c=0; c<matrix[0].length; c++)
            {
                System.out.print(matrix[r][c]+"   ");
            }
            System.out.print("\n");
         }
    }
}
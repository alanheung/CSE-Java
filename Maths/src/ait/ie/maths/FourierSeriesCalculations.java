package ait.ie.maths;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kfitzgerald
 */
import java.util.Scanner;
import java.text.*;
public class FourierSeriesCalculations
{
    public static double Calc(int k, int dist, double L, double t)
    {
        double result=0;
        if(k<=0)
            return result; 
        result += (dist/(k*Math.PI))*Math.sin((k*Math.PI/L)*t)+Calc(k-2,dist,L, t);
        return result;
    }
    public static int translateToTerms(int t)
    {
        int count=1;
        for(int i=1; i<t; i++)
        {
            count+=2;
        }
        System.out.println("Terms = "+count);
        return count;
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter value for L: ");
        double L = in.nextDouble();
        System.out.print("Enter value for a0: ");
        double a0 = in.nextDouble();
        System.out.print("Enter Lower limit: ");
        double LL = in.nextInt();
        System.out.print("Enter Lower limit: ");
        double UL = in.nextInt();
        System.out.print("Enter The number of non 0 terms: ");
        int k = in.nextInt();
        k = translateToTerms(k);
        System.out.println("Calculations will be performed in steps of 0.25");
        int dist = 20;//(Math.abs(LL)+Math.abs(UL))*2;
        int arraysize = (int)((Math.abs(LL)+Math.abs(UL))/0.5 )+1;
        System.out.println("Array Size: "+arraysize);
        double[] FSValues = new double[arraysize];
        double FSV=0;

        for(int i=0; i<FSValues.length; i++)
        {
            FSV = (a0/2)+Calc(k, dist, L, LL);
            FSValues[i] = FSV;
            System.out.println(LL+" = "+FSValues[i]);
            LL+=0.5;
            FSV=0;
        }
    }
}
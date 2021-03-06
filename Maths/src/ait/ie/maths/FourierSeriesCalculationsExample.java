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
public class FourierSeriesCalculationsExample{
    static Scanner sc = new Scanner(System.in);
	public static double Odd(int k, int b, double L, double t){
        double result=0;
        if(k<=0)
            return result;
        //original result += (b/(k*Math.PI))*Math.sin((k*Math.PI/L)*t)+Odd(k-2,b,L, t);
        
        //result += (b/(k*Math.PI))*Math.cos((k*Math.PI)-((k*Math.PI)/3)*Math.sin((k*Math.PI/L)*t));
        //f(t)=0+sum where k=1, 4PI/kPI[coskPI-cos(kPI/3)].sinkPI(kPI/3.t)
        
        //=(2/(D$5*PI()))*(COS(D$5*PI())-COS((D$5*PI())/2))*SIN(D$5*$A6)
        result = (2/(k*Math.PI))*(Math.cos(k*Math.PI)-Math.cos((k*Math.PI)/2))*Math.sin(k*t)+Odd(k-1,b,L, t);
        return result;
    }
    public static void main(String[]args)
    {
    	//double L = 5, a0 = 14, LL = -5, UL = 5;
    	//double L = 3, a0 = 0, LL = -3, UL = 3;
        //int k = 5,b = 6;// k=5 no. of terms, b=20
    	double pi=Math.PI;
    	int k=15,b=101;
    	double L=pi, a0=-pi, LL=-pi, UL=-pi;
//    	System.out.print("Please enter value for L: ");
//    	L=sc.nextDouble();
//    	System.out.print("Please enter value for a0: ");
//    	a0=sc.nextDouble();
//    	System.out.print("Please enter value for LL: ");
//    	LL=sc.nextDouble();
//    	System.out.print("Please enter value for UL: ");
//    	UL=sc.nextDouble();
//    	System.out.print("Please enter value for k: ");
//    	k=sc.nextInt();    	
//    	System.out.print("Please enter value for b: ");
//    	b=sc.nextInt();
        int arraysize = 100;//(int)((Math.abs(LL)+Math.abs(UL))/0.25 )+1;
       	System.out.println("Size of the array "+arraysize );
        double[] FSValues = new double[arraysize];
        for(int i=0; i<FSValues.length; i++){
            FSValues[i] = (a0/2)+Odd(k, b, L, LL);
            System.out.println(" "+LL+" = "+FSValues[i]);
            LL+=0.006;
        }
    }
}

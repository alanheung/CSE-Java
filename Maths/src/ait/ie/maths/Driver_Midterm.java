package ait.ie.maths;

public class Driver_Midterm {

	public static double GenerateFourier(int k, double L, double t){

		double result=0;

		if(k<=0)
			return result;
		result += (2/(k*Math.PI))*(Math.cos(k*Math.PI)-Math.cos((k*Math.PI)/2))
				*Math.sin(k*t)+GenerateFourier(k-1,L, t);
		return result;
	}
	public static void main(String[] args) {

		double pi=Math.PI;
		int k=15, arraysize=101;
		double L=pi, t=-pi, LL=-pi, UL=-pi, step = ((Math.abs(LL)+Math.abs(UL))/100);

		System.out.println("Step: "+step);
		System.out.println("Size of the array "+arraysize );

		double[] FSValues = new double[arraysize];

		for(int i=0; i<FSValues.length; i++){
			FSValues[i] = GenerateFourier(k, L, LL);
			System.out.println(" "+LL+" = "+FSValues[i]);
			LL+=step;//t+=step;
		}
	}

}

//import java.util.Scanner;
//import java.text.*;
//public class Driver_Midterm
//{
//    public static double GenerateFourier(int k, double L, double t)
//    {
//        double result=0;
//        if(k<=0)
//            return result;
//        else
//            result += (((2/(k*L))*(Math.cos(k*L)-Math.cos((k*L)/2)))*(Math.sin(k*t)))+GenerateFourier(k-1,L,t);
//        return result;
//    }
//    public static void main(String[]args)
//    {
//		Scanner in = new Scanner(System.in);
//        double pi = Math.PI;
//        double L = pi, LL = -pi, UL = pi, t=-pi;
//        System.out.print("Enter the number of terms to take to calculate f(t)");
//        int k = in.nextInt();
//        System.out.print("Enter the number of points (array size):");
//        int arraysize = in.nextInt();
//        double step = ((Math.abs(LL)+Math.abs(UL))/arraysize );
//        arraysize++;
//        //System.out.println("Step: "+step);
//       	//System.out.println("Size of the array "+arraysize );
//       	double[] FSValues = new double[arraysize];
//        for(int i=0; i<FSValues.length; i++)
//        {
//            FSValues[i] = GenerateFourier(k, L, t);
//            System.out.println(t+" = "+FSValues[i]);
//            t+=step;
//        }
//    }
//}


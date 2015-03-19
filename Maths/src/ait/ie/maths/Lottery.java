package ait.ie.maths;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Lottery{
//	//stores all possible lottery numbers
//	public static  ArrayList<Integer> randRange = new ArrayList<Integer>();
//
//	//stores bonus ball numbers
//	public static  ArrayList<Integer> boRange = new ArrayList<Integer>();
//	static ArrayList<Integer> lotNum  = new ArrayList<Integer>();
//	ArrayList<Integer> boNum  = new ArrayList<Integer>();
//	
//	public static void randomInt(){
//
//	    Random rand = new Random();
//
//	    //generate a random number
//	    int RandInt = rand.nextInt(51);
//	    int boInt = rand.nextInt(12);
//
//	    //loop used to get unique random number
//	    int count=0;
//	    while(count!=5){
//	        //check if random number exists
//	        if(randRange.get(RandInt)!=null){
//	            //finalise random number
//	            RandInt=randRange.get(RandInt);
//
//	            //add to ArrayList
//	            lotNum.add(RandInt);
//
//	            //remove number
//	            //ensures next random number is unique
//	            randRange.remove(RandInt);
//
//	            count++;                
//	        }else{
//	            //get a new random number 
//	            //and start process again
//	            RandInt = rand.nextInt(51);
//	        }
//	    }
//	}
//	
//	public static void main(String[] args){
//		randomInt();
//	}
	public static void main(String[] args){
		System.out.print("Enter number of tickets: ");
		Scanner numReader= new Scanner(System.in);
		int num = numReader.nextInt();
		System.out.println("Lottery Numbers: ");
		System.out.println();
		for(int i=0; i<num; i++){  
			int[] lottoNumber = getTicket();
			System.out.print(lottoNumber[0] + " " );
			System.out.print(lottoNumber[1] + " " );
			System.out.print(lottoNumber[2] + " " );
			System.out.print(lottoNumber[3] + " " );
			System.out.print(lottoNumber[4] + " " );
			System.out.print("Lucky Stars:(" + lottoNumber[5] + ") ");
			System.out.print("(" + lottoNumber[6] + ")");
			System.out.println();
		}  

	}  
	public static int[] getTicket(){
		int[] lottoNumber = new int[7];{  
			lottoNumber[0] = (int) ((50 * Math.random()) + 1);  
			lottoNumber[1] = (int) ((50 * Math.random()) + 1);  
			lottoNumber[2] = (int) ((50 * Math.random()) + 1);  
			lottoNumber[3] = (int) ((50 * Math.random()) + 1);  
			lottoNumber[4] = (int) ((50 * Math.random()) + 1);  
			lottoNumber[5] = (int) ((11 * Math.random()) + 1);  
			lottoNumber[6] = (int) ((11 * Math.random()) + 1);  
		}  
		return lottoNumber;
	}
}
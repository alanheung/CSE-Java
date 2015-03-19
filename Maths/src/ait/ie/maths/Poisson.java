package ait.ie.maths;

import java.util.Scanner;
import java.text.*;

public class Poisson{
    public static int FACTORIAL(int x){
        if(x<=1)
            return 1;
        return x*FACTORIAL(x-1);
    }
    public static double Calculate(double lamda, int x){
        return (Math.pow(Math.E, -lamda)*Math.pow(lamda, x))/FACTORIAL(x);
    }
    public static void printMenu(){
        System.out.println("\nSelect from one of the following:");
        System.out.println("1: Exactly # jobs:");
        System.out.println("2: At most # jobs:");
        System.out.println("3: More than # jobs:");
        System.out.println("4: Reset lamda: ");
        System.out.print("0: Exit:\nEnter Selection: ");
    }
    public static void PrintResult(double d){
        DecimalFormat threeD = new DecimalFormat("###.###");
        System.out.print("Probability = "+threeD.format(d));
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int x=0, option=0;
        double lamda=0, temp=0;
        System.out.print("Enter a value for lamda: ");
        lamda = in.nextDouble();
        printMenu();
        option = in.nextInt();
        while(option!=0){
            switch(option){
                case 1:{
                    System.out.print("Determine the probabiltiy of exactly:  ");
                    x = in.nextInt();
                    PrintResult(Calculate(lamda, x));
                    break;
                }
                case 2:{
                    temp=0;
                    System.out.print("Determine the probabiltiy of at most:  ");
                    x = in.nextInt();
                    for(int i=0; i<=x; i++)
                        temp+=Calculate(lamda, i);
                    PrintResult(temp);
                    break;
                }
                case 3:{
                    temp=0;
                    System.out.print("Determine the probabiltiy of more than:  ");
                    x = in.nextInt();
                    for(int i=0; i<=x; i++)
                        temp+=Calculate(lamda, i);
                    PrintResult(1-temp);
                    break;
                }
                case 4:{
                    System.out.print("Reset Lamda to:  ");
                    lamda = in.nextDouble();
                    break;
                }
                case 0:{
                    System.out.print("BYE");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.print("Not an option, please try again");
            }
            printMenu();
            option = in.nextInt();
        }
    }
}

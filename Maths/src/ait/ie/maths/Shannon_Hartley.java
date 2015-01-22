/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.*;
import java.util.Scanner;
public class Shannon_Hartley
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the available Bandwisth in Hz: ");
        double B = in.nextDouble();
        System.out.print("Enter the SNR in dB: ");
        double SNR = in.nextDouble();
        double SN = Math.pow(10d, SNR/10d);
        double C = B*((Math.log(1+SN))/(Math.log(2)));
        NumberFormat formatter = new DecimalFormat();
        formatter = new DecimalFormat("00.###E0");
        System.out.println("Channel Capacity = "+(C)+" bps");
        System.out.println("Channel Capacity = "+formatter.format(C)+" bps");      
    }
}
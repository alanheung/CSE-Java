/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kfitzgerald
 */
import java.text.*;
import java.util.Scanner;
public class SNR 
{
  public static void main(String[]args)
  {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the channel capacity in bps: ");
      double C = in.nextDouble();
      System.out.print("Enter the available Bandwisth in Hz: ");
      double B = in.nextDouble();
      double SN = Math.pow(2d, (C/B))-1;
      double SNR = 10d*Math.log10(SN);
      NumberFormat formatter = new DecimalFormat();
      formatter = new DecimalFormat("00.###E0");
      System.out.println("Signal to Noise Ratio= "+(SNR)+" dB");
      System.out.println("Signal to Noise Ratio= "+formatter.format(SNR)+" bps");
  }
}

package ait.ie.maths;

import java.util.Scanner;

public class Voltage_Simulator {
	static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int Voltage=1, AppliedVoltage=2, Resistance=3, Capacitance=4, Time=5, SIMULATOR=6, EXIT=0;
		String userContinue="y";
		while(userContinue.equalsIgnoreCase("y")){
			switch(userChoice()){
			case Voltage: 
				break;
			case AppliedVoltage: 
				break;
			case Resistance: 
				break;
			case Capacitance: 
				break;
			case Time: 
				break;
			case Simulator: 
				break;
			case EXIT:
				userContinue="n";
				break;
			default:
				System.out.println("Option does not exist, try again ");
			}
		}
	}
	public static int userChoice(){
		System.out.print("\nWhat do you want to do?");
		System.out.print("\n1.Calculate Voltage \n2.Calculate Applied Voltage \n3.Calculate Resistance \n4.Calculate Capacitance \n5.Calculate time to reach a set voltage \n6.Simulator \n7.Exit ");
		return sc.nextInt();	
	}
	static DecimalFormat formatter = new DecimalFormat("00.##E0");
	
	static void AppliedVoltage(double V, double R, double t, double C)
	{
		double Vi = Enter formula here
				FormatOutput("The applied voltage is ", Vi, "Volts");
	}
	static void Voltage(double Vi, double R, double t, double C)
	{
		double V = Enter formula here
				FormatOutput("The outputted voltage is ", V, "Volts");
	}
	static void Resistance(double V, double Vi, double t, double C)
	{
		double R = Enter formula here
				FormatOutput("The Resistance is ",R, " ohms");
	}
	static void Capacitance(double V, double Vi, double t, double R)
	{
		double C = Enter formula here
				FormatOutput("The Capacitance is ",C, " F");
	}
	static void Time(double V, double Vi, double C, double R)
	{
		double t = Enter formula here
				FormatOutput("The time taken to reach this voltage is ",t, " sec");
	}
	static void Simulator(double Vi, double R, double C)
	{
		…….
	}
	static void FormatOutput(String s1, double d, String s2)
	{
		System.out.println(s1+ " "+d+" or "+formatter.format(d)+ " "+s2);
	}
	static void printMenu()
	{
		Refer to point 3
	}

}

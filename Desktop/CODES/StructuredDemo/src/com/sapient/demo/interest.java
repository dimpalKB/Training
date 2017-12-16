package com.sapient.demo;
import java.util.Scanner;
public class interest
{
	public static void main(String[] args)
	{
	Scanner scan= new Scanner(System.in);
	System.out.print("ENTER AMOUNT");
	double principle=scan.nextDouble();
	System.out.print("ENTER YEARS");
	int terms=scan.nextInt();
	System.out.print("ENTER rate");
    float per=scan.nextFloat();
    double simple=calSimple(principle,terms,per);
    double com=calCompound(principle,terms,per);
    System.out.println("simple interest "+ simple);
    System.out.println("compound interest "+ com);
    scan.close();
	}
	public static double calSimple(double amt,int years,float rate)
	{
		double si=amt*years*rate/100;
		return si;
	}
    public static double calCompound(double amt,int years,float rate)
    {
    	double ci=amt*Math.pow((1+rate/100),years);
    	return ci;
    }
}

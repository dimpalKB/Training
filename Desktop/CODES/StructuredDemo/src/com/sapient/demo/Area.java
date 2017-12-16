package com.sapient.demo;
import java.util.Scanner;
public class Area
{
	public static void main(String [] args)
	{
		System.out.print("Enter radious " );
		Scanner scan=new Scanner(System.in);
		double rad=scan.nextDouble();
		double are=area(rad);
		double pe=peri(rad);
		scan.close();
		System.out.println("Area of circle= "+ are);
		System.out.print("Perimeter of circle= "+ pe);
	}
        
	public static double area(double r)
           {
        	   double a=r*r*22/7;
        	   return a;
           }
     public static double peri(double r)
           {
        	   double p=2*22*r/7;
        	   return p;
           }
}

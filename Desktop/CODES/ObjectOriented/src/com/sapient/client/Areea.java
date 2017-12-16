package com.sapient.client;
import java.util.Scanner;

import com.sapient.service.AreaCircle;

public class Areea {

	public static void main(String[] args)
	{
		AreaCircle obj=new AreaCircle();
		Scanner scan=new Scanner(System.in);
		double d=scan.nextDouble();
		obj.r=d;
		scan.close();
		double a=obj.area();
		double s=obj.peri();
		
	}

}

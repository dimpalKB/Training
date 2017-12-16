package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.interest;

public class interestClient
{
	public static void main(String[] args)
	{
		
	interest obj=new interest();
	Scanner scan= new Scanner(System.in);
	System.out.print("ENTER AMOUNT");
	double principle=scan.nextDouble();
	System.out.print("ENTER YEARS");
	double terms=scan.nextDouble();
	System.out.print("ENTER rate");
    double per=scan.nextDouble();
    
    obj.amt=principle;
    obj.rate=per;
    obj.years=terms;
    
	double SimpleInt=obj.calsimple();
	double CompoundInt=obj.calCompound();
	
	interest obj2=new interest();
	double SimpleInt2=obj2.calsimple();
	double CompoundInt2=obj2.calCompound();
    }
}
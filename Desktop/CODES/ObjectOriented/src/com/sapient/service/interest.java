package com.sapient.service;

public class interest 
{
	public double amt;
	public double years;
	public double rate;
    
	public double calsimple()
	{
		double si=amt*years*rate/100;
		return si;
	}
	
	public double calCompound()
	{
		double ci=amt*Math.pow(1+rate/100,years);
		return ci;
	}
}

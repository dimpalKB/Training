package com.sapient.service;

public class SalesPerson {
     public int id;
     public String name;
     public double samt;
     public static int noOfPersons;
     public static double tsales;
	  
     
     public double calcSalesman()
     {
    	 double sc=0;
    	 if(samt>=50000)
    		 sc=samt*(.1);
    	 if(samt>=20000&&samt<50000)
    		 sc=samt*(.05);
    	 if(samt<2000)
    		 sc=samt*(.03);
    	 return sc;
     }
     public void display()
     {
    	 System.out.println(id+"   " + name+"    " +calcSalesman());
     }


	public SalesPerson(int id, String name, double samt) {
		super();
		this.id = id;
		this.name = name;
		this.samt = samt;
		++noOfPersons;
		tsales=tsales+this.samt;
	}
}

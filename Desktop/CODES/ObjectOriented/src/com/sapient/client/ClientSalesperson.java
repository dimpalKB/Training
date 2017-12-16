package com.sapient.client;

import com.sapient.service.SalesPerson;

public class ClientSalesperson {

	public static void main(String[] args) {
		
        SalesPerson s1=new SalesPerson(1001,"ram",45000);  
        
        SalesPerson s2=new SalesPerson(1001,"tom",18000);
        
        SalesPerson s3=new SalesPerson(1001,"sam",5000);
        s1.display();
        s2.display();
        s3.display();
        System.out.println("No of Persons"+ SalesPerson.noOfPersons);
        System.out.println("Total Sales "+ SalesPerson.tsales);
	}

}

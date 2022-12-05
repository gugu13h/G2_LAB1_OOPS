package com.greatlearning.main;
import java.util.Scanner;
import java.util.Random;
import com.greatlearninginterfaces.Credential;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialServices;
public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee("Kumar","Gaurav");
		
		Credential c=new CredentialServices();
		System.out.println("Name :"+"Kumar Gaurav");
		System.out.println("Please enter the department from the following");
		
		System.out.println( "1.Technical\n 2.Admine \n 3.Human resource \n 4.Legal ");
		System.out.println("enter a number between 1-4");
		
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		String generatedEmail=null;
		String generatedPassword=null;
		
		switch(option) {
		
		case 1:{
			generatedEmail=c.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),"tech" );
			generatedPassword=c.generatePassword();
			break;
		}
		case 2:{
			generatedEmail=c.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),"adm" );
			generatedPassword=c.generatePassword();
			break;
		}
		case 3:{
			generatedEmail=c.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),"hr" );
			generatedPassword=c.generatePassword();
			break;
		}
		case 4:{
			generatedEmail=c.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"leg" );
			generatedPassword=c.generatePassword();
			break;
			
		}
		default:{
			System.out.println("Enter a valid choice");
		}
		
		}
		employee.setEmail(generatedEmail);
		employee.setPassword(generatedPassword);
		
		c.showCredentials(employee);
		sc.close();
		
		
	}
	}


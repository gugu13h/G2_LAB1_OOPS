package com.greatlearning.service;
import java.util.Random;
import com.greatlearninginterfaces.Credential;
import com.greatlearning.model.Employee;
public class CredentialServices implements Credential {
		
		public String generatePassword() {
			String capitalLetters="ARVGFVDKRGIY";
			String smallLetters="fqwwrtijvdzx";
			String numbers="0123456789";
			String specialcharacter="@#$%&*";
			
			String values=capitalLetters+smallLetters+numbers+specialcharacter;
			
			Random random=new Random();
			
			String password="";
			char temp;
			for(int i=0;i<8;i++) {
				password+=String.valueOf(values.charAt(random.nextInt(values.length())));
				
			}
			return password;
		}
			
		public String generateEmailAddress(String FirstName,String LastName,String department) {
				
				return FirstName+LastName+"@"+department+"gl.com";
				
			}
			public void showCredentials(Employee employee) {
				System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
				System.out.println("Email: "+employee.getEmail());
				System.out.println("password: "+employee.getPassword());
			}
		
			
		}

		


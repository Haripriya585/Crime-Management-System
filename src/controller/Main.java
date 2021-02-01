package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import services.CriminalOperations;
import services.UserOperation;
import utility.AdminValidation;
import utility.OfficerValidation;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println(
					"-------------------------------------------------------------------------------------------------------");
			System.out.println(
					"-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-WELCOME TO CRIMINAL MANAGEMENT SYSTEM..!!! -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------");
			System.out.println("\n");
			
			System.out.println("1.Police/Jailer\n2.CBIOfficer\n");
					
			System.out.println();
			//System.out.println();
			System.out.println("Enter your choice");
			int option = Integer.parseInt(br.readLine());	
			AdminValidation adminValidation = new AdminValidation();
			OfficerValidation officerValidation = new OfficerValidation();
			switch (option) {
			
			case 1:{
					System.out.println("Enter UserName...");
					String name = br.readLine();
					System.out.println("Enter Password...");
					String password = br.readLine();
					
					
					boolean checkAdmin = adminValidation.checkAdminAccess(name,password);
					
					if(checkAdmin) {
						CriminalOperations admin = new CriminalOperations();
						admin.adminOperations();
					}
					else {
						System.out.println("Invalid Username Or Password...!!!");
					}
					break;
					
					
			}case 2:{
				System.out.println("Enter UserName...");
				String name = br.readLine();
				System.out.println("Enter Password...");
				String password = br.readLine();
				
				
				boolean checkofficer = officerValidation.checkOfficerAccess(name,password);
				
				if(checkofficer) {
					UserOperation uo=new UserOperation();
					uo.userOperation();
				}
				else {
					System.out.println("Invalid Username Or Password...!!!");
				}
				break;
				
				
			}
			
			

			}
			
			System.out.println("Do You Want To Continue Using the Portal...? 1. YES  2. NO");
			int temp = Integer.parseInt(br.readLine());
			if(temp == 1) {
				continue ;
			}
			else {
				break;
			}
			

		}// while-loop-close
	}

}
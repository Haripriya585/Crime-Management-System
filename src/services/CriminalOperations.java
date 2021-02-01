package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;


import model.CriminalDetails;

public class CriminalOperations {
	ArrayList<CriminalDetails> criminalList = new ArrayList<CriminalDetails>();
	

	public void adminOperations() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("\n");
			System.out.println("*****************************Select The Operation To Be Performed *****************************");
			System.out.println("\n");			
			System.out.println(
					" 1. Register the Criminal(ADD)\n 2. Update Criminal Status\n 3. Search the Criminal\n 4. View Criminals List\n 5. Delete Criminal Record\n  ");

			int option = Integer.parseInt(br.readLine());

			switch (option) {

			case 1: {
				CriminalDetails criminalDetail = new CriminalDetails();
				System.out.println("Enter Criminal ID : ");
				int flag=1;
				if(criminalList.size()>0) {
				while(flag!=0) {
					
				for(CriminalDetails cd : criminalList) {
					
					int cID = Integer.parseInt(br.readLine());
					
					if(cd.getCriminalID() == cID) { 
						System.out.println("ID Already exists... Re-Enter ID");
					}else {
						criminalDetail.setCriminalID(cID);
						flag=0;
						break;
					}
				}
				}
					
				}else {
					int cID = Integer.parseInt(br.readLine());
					criminalDetail.setCriminalID(cID);

				}
				
				System.out.println("Enter Criminal Name");
				String cName = br.readLine();
				
				System.out.println("Enter Crime Type");
				String cType = br.readLine();

				System.out.println("Enter Crime Spot Address");
				String cAddr = br.readLine();

				Date date = new Date();
				String dt = String.format("   Date/Time : %tc  ", date);

				System.out.println("Enter Gender Of The Criminal\n 1. Male\n 2. Female");
				int option2 = Integer.parseInt(br.readLine());
				switch (option2) {
				case 1:
					criminalDetail.setGender("Male");
					break;
				case 2:
					criminalDetail.setGender("Female");
					break;
				}

				System.out.println("Enter Criminal Age");
				int age = Integer.parseInt(br.readLine());

				System.out.println("Criminal's Case Status...");
				System.out.println(" 1. Open\n 2. Inactive\n 3. Closed\n 4. Re-Opened\n ");

				int option3 = Integer.parseInt(br.readLine());

				switch (option3) {

				case 1:
					criminalDetail.setStatus("Open");
					break;
				case 2:
					criminalDetail.setStatus("Inactive");
					break;
				case 3:
					criminalDetail.setStatus("Closed");
					break;
				case 4:
					criminalDetail.setStatus("Re-Opened");
					break;

				}

				criminalDetail.setCriminalName(cName);
				criminalDetail.setCrimeType(cType);
				criminalDetail.setCrimeAddress(cAddr);
				criminalDetail.setCrimeDate(dt);
				criminalDetail.setAge(age);

				criminalList.add(criminalDetail);

				break;
			} // case 1 -close

			case 2: {
				//Updating Status of Criminals Case
				System.out.println("Enter Criminal ID...");
				int id = Integer.parseInt(br.readLine());

				System.out.println("Choose Updated Status of Criminal's Case...");
				System.out.println(" 1. Open\n 2. Inactive\n 3. Closed\n 4. Re-Opened\n ");

				int option4 = Integer.parseInt(br.readLine());
		
				switch (option4) {

				case 1:
					criminalList.get(id - 1).setStatus("Open");
					break;
				case 2:
					criminalList.get(id - 1).setStatus("Inactive");
					break;
				case 3:
					criminalList.get(id - 1).setStatus("Closed");
					break;
				case 4:
					criminalList.get(id - 1).setStatus("Re-Opened");
					break;

				}
				break;
			}

			case 3: {
				//Search By Criminal ID and get Criminal Details...
				System.out.println("Enter Criminal ID...");
				int id = Integer.parseInt(br.readLine());

				System.out.println(criminalList.get(id - 1).getCriminalID() +"\t"+criminalList.get(id - 1).getCriminalName()
						+ criminalList.get(id - 1).getCrimeType() + "\t" + criminalList.get(id - 1).getCrimeAddress()
						+ "\t" + criminalList.get(id - 1).getCrimeDate() + "\t"
						+ criminalList.get(id - 1).getGender() + "\t" + criminalList.get(id - 1).getAge() + "\t"
						+ criminalList.get(id - 1).getStatus());
				break;
			}
			
			case 4:{
				ViewCriminals ad = new ViewCriminals();
				ad.viewCriminals(criminalList);
				break;
			}
			
			case 5: {
				System.out.println("Enter Criminal ID...");
				int flag=0;
				int id = Integer.parseInt(br.readLine());
				for(int i=0;i<criminalList.size();i++) {
					if(criminalList.get(i).getCriminalID()==id) {
						criminalList.remove(criminalList.get(i));
						System.out.println("Deleted Successfully");
						flag=1;
					}
					if(flag==0) {
						 System.out.println("ID not present or INVALID...");
					}
				}

//			    System.out.println("ID not present or INVALID...");
				   
			}

			}// main switch - close

			System.out.println("Do You Want To Make Any Operations...? 1. YES  2. NO");
			int temp = Integer.parseInt(br.readLine());
			if (temp == 1) {
				continue;
			} else {
				break;
			}
		} // while-loop -end

	}

}
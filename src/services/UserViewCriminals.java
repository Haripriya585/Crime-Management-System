package services;

import java.util.ArrayList;

import model.CriminalDetails;

public class UserViewCriminals implements ViewCriminalDetails {
	@Override
	public void viewCriminals(ArrayList<CriminalDetails> criminalList) {

//		for (CriminalDetails criminal : criminalList) {
//			System.out.println(criminal.getCriminalID() + "\t" + criminal.getCrimeType() + "\t"
//					+ criminal.getCrimeAddress() + "\t" + criminal.getCrimeDate() + "\t" + criminal.getGender() + "\t"
//					+ criminal.getAge() + "\t" + criminal.getStatus() + "\n");
//		}
		if(criminalList.size()>0) {
			for (CriminalDetails criminal : criminalList) {
				System.out.println(criminal.getCriminalID() + "\t" + criminal.getCrimeType() + "\t"
						+ criminal.getCrimeAddress() + "\t" + criminal.getCrimeDate() + "\t" + criminal.getGender() + "\t"
						+ criminal.getAge() + "\t" + criminal.getStatus() + "\n");
			}

		}else {
			System.out.println("There is no criminal list");
		}


	}

}
package services;

import java.util.ArrayList;

import model.CriminalDetails;

public class ViewCriminals implements ViewCriminalDetails {

	@Override
	public void viewCriminals(ArrayList<CriminalDetails> criminalList) {
		if(criminalList.size()>0) {
		for (CriminalDetails criminal : criminalList) {
			
			System.out.println(criminal.getCriminalID() + "\t" + criminal.getCriminalName() +"\t"+criminal.getCrimeType() + "\t"
					+ criminal.getCrimeAddress() + "\t" + criminal.getCrimeDate() + "\t" + criminal.getGender() + "\t"
					+ criminal.getAge() + "\t" + criminal.getStatus() + "\n");
		}

	}else {
		System.out.println("There is no criminal list");
	}

}
	}
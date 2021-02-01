package model;

public class CriminalDetails {
	private int criminalID;
	private String criminalName;
	private String crimeType;
	private String crimeAddress;
	private String crimeDate;
	private String gender;
	private int age;
	private String status;

	public int getCriminalID() {
		return criminalID;
	}

	public void setCriminalID(int criminalID) {
		this.criminalID = criminalID;
	}
	

	public String getCriminalName() {
		return criminalName;
	}

	public void setCriminalName(String criminalName) {
		this.criminalName = criminalName;
	}

	public String getCrimeType() {
		return crimeType;
	}

	public void setCrimeType(String crimeType) {
		this.crimeType = crimeType;
	}

	public String getCrimeAddress() {
		return crimeAddress;
	}

	public void setCrimeAddress(String crimeAddress) {
		this.crimeAddress = crimeAddress;
	}

	public String getCrimeDate() {
		return crimeDate;
	}

	public void setCrimeDate(String dt) {
		this.crimeDate = dt;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}

package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String idNumber;
    private String address;
    private int yearJoined;
    private int monthJoined;
    private int dayJoined;
    private boolean isForeigner;
    private Gender Gender; /*Gender Cowo atau Cewe */
    private String spouseName;
    private String spouseIdNumber;
    private List<String> childNames;
    private List<String> childIdNumbers;

    public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, int yearJoined, int monthJoined, int dayJoined, boolean isForeigner, Gender Gender) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
        this.yearJoined = yearJoined;
        this.monthJoined = monthJoined;
        this.dayJoined = dayJoined;
        this.isForeigner = isForeigner;
        this.Gender = Gender;
        this.childNames = new LinkedList<>();
        this.childIdNumbers = new LinkedList<>();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public int getMonthJoined() {
        return monthJoined;
    }

    public int getDayJoined() {
        return dayJoined;
    }

    public boolean isForeigner() {
        return isForeigner;
    }

	public Gender getGender() {
        return Gender;
    }

    public void setGender(Gender Gender) {
        this.Gender = Gender;
    }

    public String getSpouseName() {
        return spouseName;
    }


    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }

    public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = idNumber;
	}

    public List<String> getChildNames() {
        return childNames;
    }

    public List<String> getChildIdNumbers() {
        return childIdNumbers;
    }

	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
}
	
	
	 


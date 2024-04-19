package lib;



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
    private FamilyEmployee FamilyEmployee;

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
        this.FamilyEmployee = new FamilyEmployee();
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

    public FamilyEmployee getFamilyEmployee() {
        return FamilyEmployee;
    }

    public void setFamilyEmployee(FamilyEmployee FamilyEmployee) {
        this.FamilyEmployee = FamilyEmployee;
    }
}
	
	
	 


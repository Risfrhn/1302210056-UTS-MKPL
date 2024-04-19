package lib;


import java.time.LocalDate;



public class EmployeSalary {
    private Employee employee;
	private FamilyEmployee FamilyEmployee;
    private int monthlySalary;
    private int otherMonthlyIncome;
    private int annualDeductible;
	private int monthWorkingInYear;


    public EmployeSalary(Employee employee, FamilyEmployee FamilyEmployee, int monthlySalary, int otherMonthlyIncome, int annualDeductible) {
        this.employee = employee;
		this.FamilyEmployee = FamilyEmployee;
        this.monthlySalary = monthlySalary;
        this.otherMonthlyIncome = otherMonthlyIncome;
        this.annualDeductible = annualDeductible;
    }

	public FamilyEmployee getFamilyEmployee() {
        return FamilyEmployee;
    }

	public Employee getEmployee() {
        return employee;
    }

	// menentukan gaji bulanan berdasarkan grade pegawai
	// grade 1: 3.000.000 per bulan 
	// grade 2: 5.000.000 per bulan
	// grade 3: 7.000.000 per bulan
	// pegawai negara asing mendapatkan 50% gaji lebih
	public void setMonthlySalary(int grade) {   
		if (grade == 1) { 
			monthlySalary = 3000000;
		} else if (grade == 2) {
			monthlySalary = 5000000;
		} else if (grade == 3) {
			monthlySalary = 7000000;
		}
	
		applyForeignerBonus();
	}
	
	// menentukan gaji pegawai negara asing perbulan 
	private void applyForeignerBonus() {
		if (employee.isForeigner()) {
			monthlySalary = (int) (monthlySalary * 1.5);
		}
	}

	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}

	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	public void setSpouse(String spouseName, String spouseIdNumber) {
		this.FamilyEmployee.setSpouseName(spouseName);
        this.FamilyEmployee.setSpouseIdNumber(spouseIdNumber);
	}
	
	public void addChild(String childName, String childIdNumber) {
		this.FamilyEmployee.addChild(childName, childIdNumber);
	}

	//menentukan pajak pegawai berdasarkan lama bekerja
    public int calculateAnnualIncomeTax() {

		// Menghitung berapa lama pegawai bekerja dalam setahun ini
		// jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();

        if (date.getYear() == employee.getYearJoined()) {
            monthWorkingInYear = date.getMonthValue() - employee.getMonthJoined();
        } else {
            monthWorkingInYear = 12;
        }

        return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, FamilyEmployee.getSpouseIdNumber().equals(""), FamilyEmployee.getChildren().size());
    }
}

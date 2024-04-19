package lib;

import java.util.List;
import java.time.LocalDate;


public class EmployeSalary {
    private Employee employee;
    private int monthlySalary;
    private int otherMonthlyIncome;
    private int annualDeductible;
	private int monthWorkingInYear;


    public EmployeSalary(Employee employee, int monthlySalary, int otherMonthlyIncome, int annualDeductible) {
        this.employee = employee;
        this.monthlySalary = monthlySalary;
        this.otherMonthlyIncome = otherMonthlyIncome;
        this.annualDeductible = annualDeductible;
    }

	public Employee getEmployee() {
        return employee;
    }

	/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */

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

    public int calculateAnnualIncomeTax() {

		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
        LocalDate date = LocalDate.now();

        if (date.getYear() == employee.getYearJoined()) {
            monthWorkingInYear = date.getMonthValue() - employee.getMonthJoined();
        } else {
            monthWorkingInYear = 12;
        }

        return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, employee.getSpouseIdNumber().equals(""), employee.getChildIdNumbers().size());
    }

    
    
}

package lib;

public class TaxFunction {

	
	/**
     * Menghitung jumlah pajak pegawai dalam setahun.
     *
     * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan dikurangi penghasilan tidak kena pajak.
	 * gaji bulanan dan pemasukan bulanan lainnya dikalikan dengan jumlah bulan bekerja dikurangi pemotongan
	 * 
     *
     * karyawan belum menikah dan tidak memiliki anakm tidak terkena pajak adalah Rp 54.000.000.
     * karyawan sudah menikah = penghasilan tidak kena pajak + Rp 4.500.000.
     * karyawan memiliki anak = penghasilan tidak kena pajak + sebesar Rp 4.500.000 / anak 1 - 3
     *
     */
		
	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		
		int tax = 0;
		
		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
		
		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}
		
		if (isMarried) {
			tax = (int) Math.round(0.05 * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - (54000000 + 4500000 + (numberOfChildren * 1500000))));
		}else {
			tax = (int) Math.round(0.05 * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - 54000000));
		}
		
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
			 
	}
	
}

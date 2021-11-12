package Soal3;

public class Commission extends Hourly{
	private double totalSales;
	private double commissionRate;

	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commission) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate = commission;
	}
	
	public void addSales(double sale) {
		this.totalSales = sale;
	}
	
	public double pay() {
		double payment = super.pay() + (super.pay() * commissionRate);
		this.totalSales = 0;
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nTotal Sale: " + totalSales;
		return result;
	}
}

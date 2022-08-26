package ThursdayLab;

public class  AccountSaving {
	public static double annualInterestRate;
	private double savingsBalance;
	public void SavingsAccount() {
		annualInterestRate = 0.0;
		savingsBalance = 0.0;
	}
	public void SavingsAccount(double intRate, double savBal) {
		annualInterestRate = intRate;
		savingsBalance = savBal;
	}
	public double calculateMonthlyInterest() {
		double intRate = (savingsBalance * annualInterestRate/12);
		savingsBalance = savingsBalance + intRate;
		return intRate;
	}
	public static void modifyInterestRate(double newInteresRate) {
		annualInterestRate = newInteresRate;
	}
	public void setSavingsBalance(double newBal) {
		savingsBalance = newBal;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public static void main(String[] args) {
		SavingAccount acc1=new SavingAccount();
       SavingAccount acc2=new SavingAccount();
		acc1.setSavingsBalance(7000.00);
		acc2.setSavingsBalance(9500.00);
		SavingAccount.modifyInterestRate(0.06);
		acc1.calculateMonthlyInterest();
		acc2.calculateMonthlyInterest();
		System.out.println("Updated Balence for saver1:"+acc1.getSavingsBalance());
		System.out.println("Updated Balence for saver2:"+acc2.getSavingsBalance());
		
		SavingAccount.modifyInterestRate(0.05);
		acc1.calculateMonthlyInterest();
		acc2.calculateMonthlyInterest();
		System.out.println("Updated Balence for saver1:"+acc1.getSavingsBalance());
		System.out.println("Updated Balence for saver2:"+acc2.getSavingsBalance());
		
		
	}
}
}

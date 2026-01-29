package Tanushree;

public class bankAccount{
	private int deposit;
	private int withdrawal;
	public void setDeposit(int deposit) {
		this.deposit=deposit;
		
	}
	public void setWithdrawal(int withdrawal) {
		this.withdrawal=withdrawal;
		
	}
	int getDeposit() {
		return deposit;
	}
	int getWithdrawal() {
		return withdrawal;
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankAccount b = new bankAccount();
		b.setDeposit(60000);
		b.setWithdrawal(50000);
		System.out.println("Deposit Amount: "+b.getDeposit());
		System.out.println("Withdrawal Amount: "+b.getWithdrawal());
		
 
	}
 
}

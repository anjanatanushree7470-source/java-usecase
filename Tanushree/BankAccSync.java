package Tanushree;
class account extends Thread{
	public int balance=10000;
 
		public  synchronized void deposit(int amount) {
			balance +=amount;
			System.out.println(getName()+"Amount deposited successfully, current balance is "+balance);
		}
		synchronized void withdrawal(int amount) {
			if(balance >=amount) {
				balance -=amount;
				System.out.println(getName()+"withdrawal Successfully,current balance is"+balance);
 
			}else {
				System.out.println("insufficient balance"+balance);
			}
		}
		
}
public class BankAccSync {
	public static void main(String[] args) {
		account a1 = new account();
 
		Thread t1 = new Thread(()->{a1.withdrawal(4000);});
		Thread t2 = new Thread(()->{a1.withdrawal(5000);});
		Thread t3 = new Thread(()->{a1.deposit(3000);});
		Thread t4 = new Thread(()->{a1.deposit(4000);});
		t1.start();
		t2.start();	
		t3.start();
		t4.start();
		
	}
}


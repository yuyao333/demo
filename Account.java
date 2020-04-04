package chapter1foundation;
public class Account {
	private String id;
	private String name;
	private double balance;

	public Account(String id, String name) {
		this.id=id; 
		this.name = name;
		balance = 0;
	}

	public String getId(){ 
		return id;
	}

	
	public void deposit(double money){ 
		balance += money;
	}

	public boolean withdraw(double money){ 
		if(balance < money)
			return false;
		else {
			balance  -= money;
			return true;
		}
	}

	public boolean translateTo(Account other, double money){
		if(balance < money)
			return false;
		else {
			balance -= money;
			other.balance += money;
			return true;
		}
	}

	public void printInfo(){
		System.out.println("姓名" + id + "  姓名"+ name + "   余额" + balance);
	}
}

package section19.access2;

public class Wallet {
	
	public int totalMoney;
	
	public Wallet() {
		this.totalMoney = 10000;
	}
	
	// 방법 1
/*	public synchronized int getMoney() {
		if(totalMoney == 0) {
			return 0;
		}
		
		totalMoney -= 1;

		return 1;
	}
}
*/
	
	// 방법 2
	public int getMoney() {
		if(totalMoney == 0) {
			return 0;
		}
		synchronized (this) {
			totalMoney -= 1;
		}

		return 1;
	}
}


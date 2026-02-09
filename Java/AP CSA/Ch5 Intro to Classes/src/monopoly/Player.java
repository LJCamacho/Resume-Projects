package monopoly;


public class Player {
	//instance variables
		private String name;
		private int balance;
		private Property p1, p2, p3, p4, p5;
		
	//constructors
		public Player(String name) {
			this.name = name;
			balance =  1500;
			p1 = p2 = p3 = p4 = p5 = null;
			}//end constructor
		
		public int getBalance() {return balance;} 
		public void setBalance(int b) { balance += b;}
		public void payRent (int b) {balance -= b;}
		
		public boolean buyProperty(Property p) {
			if (p1 == null) {
				balance -= p.getCost();
				p1 = p; return true;
			}else if (p2 == null) {
				balance -= p.getCost();
				p2 = p; return true;
			}else if (p3 == null) {
				balance -= p.getCost();
				p3 = p; return true;
			}else if (p4 == null) {
				balance -= p.getCost();
				p4=p; return true;
			}else if (p5 == null) {
				balance -= p.getCost();
				p5=p; return true;
			}else {
				System.out.println("Property limit?");
				return false;
			}			
		}//end buyPropertyP1
		
		
		
		public void passGo() {
			balance += 200;
			System.out.println(name + " passed go and got $200");
		}
		
		
		public void jailFee() {
			balance -= 150;
			System.out.println(name + " went to jail and paid the fee to exit");
		}
		
		public void payRent(Property p, Player a) {
			balance -= p.getRent();
			a.setBalance(p.getRent());
		}
		public void fee() {
			balance -= 100;
		}
		public void fee2() {
			balance -= 500;
		}
		
		public void chest() {
			balance -= 70;
			System.out.println(name + " paid taxes and lost $70");
		}
		public String toString() {
			String str = "\nName: " + name +
							  "\nBalance: " + balance;
			if (p1 != null) str += "\nProperty :" + p1.getName();
			if (p2 != null) str += "\nProperty :" + p2.getName();
			if (p3 != null) str += "\nProperty :" + p3.getName();
			if (p4 != null) str += "\nProperty :" + p4.getName();
			if (p5 != null) str += "\nProperty :" + p5.getName();

			return str;
		}
		
	
}

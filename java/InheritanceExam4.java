class InteritanceExam4 { 
	public static void main(String args[]){
		BonusPointAccount obj = new BonusPointAccount("333-33-333333","Ann",0,0);
		obj.deposit(1000000);
		System.out.println("balance : " + obj.balance);
		System.out.println("accumulated point : " + obj.bonusPoint);
	}

}
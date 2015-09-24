class InheritanceExam3 {
	public static void main(String args[]){
		CreditLineAccount obj = new CreditLineAccount("000-11-11111","steve",10000,2000000);
		try{
			int amount = obj.withdraw(50000);
			System.out.println("debit : " + amount);
			System.out.println("balance : " + obj.balance);
			System.out.println("minus limits : " + obj.creditLine);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
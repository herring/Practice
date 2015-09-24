class InheritanceExam2{
	public static void main(String args[]){
		CheckingAccount obj = new CheckingAccount("111-22-3333333","steve",0,"5555-6666-7777-8888");
		obj.deposit(10000);
		try {
			int paidAmount = obj.pay("5555-6666-7777-8888",4700);
			System.out.println("paid ammount : "+paidAmount);
			System.out.println("balance : " + obj.balance);
		}
		catch (Exception e){
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}
}
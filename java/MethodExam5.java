class MethodExam5{
	public static void main(String args[]){
		Account obj = new Account("777-777-7777","Steve",10);
		try{
			int amount = obj.withdraw(100000);
			System.out.println("withdraw : "+amount);
		}
		catch(Exception e){
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}
}
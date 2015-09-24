class InterfaceExam3{
	public static void main(String args[]){
		SeparateVolume obj = new SeparateVolume("863","The tree","brerere");
		printState(obj);
		obj.checkOut("Soo Jung","20061030");
		printState(obj);
	}
	static void printState(SeparateVolume obj){
		if(obj.state == Lendable.STATE_NORMAL){
			System.out.println("-----------------------");
			System.out.println("State : available");
			System.out.println("-----------------------");
		}
		if(obj.state == Lendable.STATE_BORROWED){
			System.out.println("-----------------------");
			System.out.println("State : the book is out. ");
			System.out.println("borrower : " + obj.borrower);
			System.out.println("date : " + obj.checkOutDate);
			System.out.println("-----------------------");
		}
	}
}
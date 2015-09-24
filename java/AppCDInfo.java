class AppCDInfo extends CDInfo implements Lendable {
	String borrower;
	String checkOutDate;
	byte state;
	AppCDInfo(String registerNo,String title){
		super(registerNo, title);
	}

	public void checkOut(String borrower,String date){
		if (state != 0)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*" + title + " CD is checked out. ");
		System.out.println("borrower : " + borrower);
		System.out.println("date : " + date + "\n");
	}
	public void checkIn(){
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*" + title + " CD is checked in");
	}

}
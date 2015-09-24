class SeparateVolume implements Lendable{
	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	byte state;
	SeparateVolume(String requestNo,String bookTitle,String writer){
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	public void checkOut(String borrower,String date) throws Exception {
		if(state != STATE_NORMAL)
			throw new Exception("* Prohibition! ");
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = STATE_BORROWED;
		System.out.println("*" + bookTitle + "is checked out. ");
		System.out.println("borrower : " + borrower);
		System.out.println("date : " + date + "\n");
	}
	public void checkIn(){
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
		System.out.println("*" + bookTitle + "is checked in");
	}
}
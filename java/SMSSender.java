class SMSSender extends MessageSender {
	String returnPhoneNo;
	String message;
	SMSSender(String title,String senderName,String returnPhoneNo,String message){
		super(title,senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}
	void sendMessage(String recipient){
		System.out.println("-------------------------------");
		System.out.println("Title : " + title);
		System.out.println("Sender :  " + senderName);
		System.out.println("Phone Number : " + recipient);
		System.out.println("Return Phone Number : " + returnPhoneNo);	
		System.out.println("Body : " + message);
	}
}
class EMailSender extends MessageSender {
	String senderAddr;
	String emailBody;
	EMailSender(String title,String senderName,String senderAddr,String emailBody){
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}
	void sendMessage(String recipient){
		System.out.println("-------------------------------");
		System.out.println("Title : " + title);
		System.out.println("Sender :  " + senderName + " " + senderAddr);
		System.out.println("Recipient : " + recipient);
		System.out.println("Body : " + emailBody);
	}
}
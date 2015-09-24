class InheritanceExam6{
	public static void main(String args[]){
		EMailSender obj1 = new EMailSender("Happy Birthday!","customer service center",
			"admin@dukeeshop.co.kr","sned 10% sale coupon");
		SMSSender obj2 = new SMSSender("Happy Birthday!","customer service center",
			"02-000-0000","sned 10% sale coupon");

		obj1.sendMessage("hatman@yeyyeye.com");
		obj1.sendMessage("stickman@hahaha.com");
		obj2.sendMessage("010-000-0000");
	}
}
class ConstrExam2{
	public static void main(String args[]){
		SubscriberInfo obj1, obj2;
		obj1 = new SubscriberInfo("james","poorman","zebi");
		obj2 = new SubscriberInfo("steve","richman","money","02-990-0000","tower");

		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
	}
	static void printSubscriberInfo(SubscriberInfo obj){
		System.out.println("name : " + obj.name);
		System.out.println("id : " + obj.id);
		System.out.println("password : " + obj.password);
		System.out.println("Phone Number : " + obj.phoneNo);
		System.out.println("address : " + obj.address);
		System.out.println();
	}
}
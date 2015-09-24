class ConstrExam3{
	public static void main(String args[]){
		SubscriberInfo obj;
		obj = new SubscriberInfo();
		printSubscriberInfo(obj);
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
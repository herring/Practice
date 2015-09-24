class InterfaceExam1{
	public static void main(String args[]){
		SeparateVolume obj1 = new SeparateVolume("863?774","The ants","steve");
		AppCDInfo obj2 = new AppCDInfo("2005-7001","Redhat Fedora");
		obj1.checkOut("Kim","20061030");
		obj2.checkOut("Park","20060312");
		obj1.checkIn();
		obj2.checkIn();
	}
}
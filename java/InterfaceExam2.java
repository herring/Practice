class InterfaceExam2 {
	public static void main(String args[]){
		Lendable arr[] = new Lendable[3];
		arr[0] = new SeparateVolume("883","the Puco","eaco");
		arr[1] = new SeparateVolume("609","Art","asdfg");
		arr[2] = new AppCDInfo("2002-1234","java programming");
		checkOutAll(arr,"Yoon Ji-hye","20061010");
	}
	static void checkOutAll(Lendable arr[],String borrower,String date){
		for(int cnt = 0 ; cnt<arr.length ; cnt++){
			arr[cnt].checkOut(borrower,date);
		}
	}
}
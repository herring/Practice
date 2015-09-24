class ClassExam1{
	public static void main(String args[]){
		GoodsStock obj;
		obj = new GoodsStock("52135", 200);
		
		System.out.println("code : " + obj.goodsCode);
		System.out.println("stock : " + obj.stockNum);
		obj.addStock(1000);
		System.out.println("code : " + obj.goodsCode);
		System.out.println("stock : " + obj.stockNum);
	}
}
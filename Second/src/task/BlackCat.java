package task;

public  class BlackCat extends Cat{
	
	public BlackCat(String name, int age, String gender, double price) {
		super(name, age, gender, price);
		this.price=350;
	}
	public String toString() {
		String details= "��èè:"+"����"+name+",���䣺"+age +",�Ա�"+gender+ "���۸� "+price;
		return details;
	}
}

package task;

public  class OrangeCat extends Cat {
	boolean isFat;
	public OrangeCat() {
	}
	public OrangeCat(String name, int age, String gender, double price,boolean isFat) {
		super(name, age, gender,price);
		this.price=200;
		this.isFat=isFat;
	}
	public boolean getIsFat() {
		return isFat;
	}
	public void setIsFat(boolean isFat) {
		this.isFat=isFat;
	}
	public String toString() {
		String details= "����:"+"����"+name+",���䣺"+age +",�Ա�"+gender+ "���۸� "+price+"���Ƿ��֣�"+isFat;
		return details;
	}
}

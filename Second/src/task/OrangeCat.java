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
		String details= "胖橘:"+"名字"+name+",年龄："+age +",性别："+gender+ "，价格： "+price+"，是否胖："+isFat;
		return details;
	}
}

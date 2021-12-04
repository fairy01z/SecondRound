package task;

public  class BlackCat extends Cat{
	
	public BlackCat(String name, int age, String gender, double price) {
		super(name, age, gender, price);
		this.price=350;
	}
	public String toString() {
		String details= "黑猫猫:"+"名字"+name+",年龄："+age +",性别："+gender+ "，价格： "+price;
		return details;
	}
}

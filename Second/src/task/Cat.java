package task;

public abstract class Cat {
	//����
	protected String name;
	protected int age;
	protected String gender;
	protected double price;
	public Cat() {
		
	}
	//ȫ�ι��췽��
	public Cat(String name,int age,String gender,double price) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.price=price;		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}
	public double getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	
	//���󷽷�
	public abstract String toString();
	
	
}

package task;

public interface CatCafe {
	int catNum=0;
	String kind="";
	double price=0.0;	
	void toBuy(Cat c);
	void ToCustomer(Customer cu);
	void toClose();

}

package task;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class MyCatCafe implements CatCafe {
	//变量
	public double balance;
	public Collection cat=new ArrayList();
	public Collection cus=new ArrayList();
	
	//实现接口中的方法：
	public MyCatCafe() {
		
	}
    public MyCatCafe(double balance,Collection cat,Collection cus) {
		this.cat=cat;
		this.cus=cus;
		this.balance=balance;
	}
    public double getBalance() {
    	return balance;
    }
    public Collection getCat() {
    	return cat;
    }
    public Collection getCus() {
    	return cus;
    }
    public void setBalance(double balance) {
    	this.balance=balance;
    }
    public void setCat(Collection cat) {
    	this.cat=cat;
    }
    public void setCus(Collection cus) {
    	this.cus=cus;
    }
    
	
	public void toBuy(Cat c) {
		if(balance<c.getPrice()) {
			throw new InsufficientBalanceException("余额不足");
		}
		balance=balance-c.getPrice();
		cat.add(c);
		System.out.println("购买猫猫成功！");
	}
	
	public void ToCustomer(Customer cu) {	//需要修改。每次rua都需要再随机一次	
		cus.add(cu);
		for(int i=0;i<cu.getRuaNum();i++) {
		if(cat.size()==0) throw new CatNotFoundException();
		Random random=new Random();
		int anyCat=random.nextInt(cat.size());
		Object[] obj=cat.toArray();
		Cat c=(Cat)obj[anyCat];
		System.out.println("rua 到的猫猫："+c.toString());}//输出猫猫信息
		double pase=15*cu.getRuaNum();
		balance=balance+pase;//加入余额	
	}
	
	public void toClose() {
		LocalDate localDate=LocalDate.now();
		Object[] obj=cus.toArray();
		double profit=0.0;
		System.out.println("今天到店的顾客：");
		for(int i=0;i<cus.size();i++) {
		    Customer cu=(Customer)obj[i];
		    int j=localDate.compareTo(cu.getTime());
		    if(i==0) {
			   System.out.println(cu.toStirng());
			   profit=profit+cu.getRuaNum()*15;
		}	 
	}
		System.out.println("当天利润为: "+profit);
}
	
}

package task;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class MyCatCafe implements CatCafe {
	//����
	public double balance;
	public Collection cat=new ArrayList();
	public Collection cus=new ArrayList();
	
	//ʵ�ֽӿ��еķ�����
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
			throw new InsufficientBalanceException("����");
		}
		balance=balance-c.getPrice();
		cat.add(c);
		System.out.println("����èè�ɹ���");
	}
	
	public void ToCustomer(Customer cu) {	//��Ҫ�޸ġ�ÿ��rua����Ҫ�����һ��	
		cus.add(cu);
		for(int i=0;i<cu.getRuaNum();i++) {
		if(cat.size()==0) throw new CatNotFoundException();
		Random random=new Random();
		int anyCat=random.nextInt(cat.size());
		Object[] obj=cat.toArray();
		Cat c=(Cat)obj[anyCat];
		System.out.println("rua ����èè��"+c.toString());}//���èè��Ϣ
		double pase=15*cu.getRuaNum();
		balance=balance+pase;//�������	
	}
	
	public void toClose() {
		LocalDate localDate=LocalDate.now();
		Object[] obj=cus.toArray();
		double profit=0.0;
		System.out.println("���쵽��Ĺ˿ͣ�");
		for(int i=0;i<cus.size();i++) {
		    Customer cu=(Customer)obj[i];
		    int j=localDate.compareTo(cu.getTime());
		    if(i==0) {
			   System.out.println(cu.toStirng());
			   profit=profit+cu.getRuaNum()*15;
		}	 
	}
		System.out.println("��������Ϊ: "+profit);
}
	
}

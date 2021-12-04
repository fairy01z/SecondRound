package task;
import java.time.LocalDate;

public class Customer {
	private String name;
	private int ruaNum;
	private LocalDate time= LocalDate.now();
	
	public Customer() {
		
	}
	public Customer(String name,int ruaNum,LocalDate time) {
		this.name=name;
		this.ruaNum=ruaNum;
		this.time=time;
	}
	
	public String getName() {
		return name;
	}
	public int getRuaNum() {
		return ruaNum;
	}
	public LocalDate getTime() {
		return time;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setRuaNum(int ruaNum) {
		this.ruaNum=ruaNum;
	}
	public void setTime(LocalDate time) {
		this.time=time;
	}
	
	public String toStirng() {
		String details="姓名:"+name+",想rua猫猫次数："+ruaNum+"，到店时间："+time;
		return details;//一会补充完整
	}
	
	

}

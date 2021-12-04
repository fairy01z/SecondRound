package task;
import java.util.Collection;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
public abstract class TestCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Scanner sa=new Scanner(System.in);
		
		//初始化猫猫列表
		MyCatCafe mycatcafe=new MyCatCafe();
		mycatcafe.setBalance(1000);
		Cat c1=new BlackCat("huahua ",1,"male",350);
		Cat c2=new OrangeCat("zhuzhu",2,"famale",200,false);
		mycatcafe.cat.add(c1);
		mycatcafe.cat.add(c2);
		
		//空的顾客列表
		Collection cus=new ArrayList();//空的顾客列表
		
		
		//测试买入猫猫，输入信息时可能报错，严格按格式输入，不会报错
		while(true) {		
		System.out.println("是否想买猫猫：(输入yes/no，必须在下一行输入)");
		String s=sc.nextLine();
		if(s.equals("no")) break;
		else {
			Cat c;
			System.out.println("橘猫/黑猫（输入汉字，必须在下一行输入）:");
			String x=sc.nextLine();
			if(x.equals("橘猫")) {System.out.println("给买的猫猫取个名字（必须在下一行输入）：");
			                    String name=sc.nextLine();
			                    System.out.println("猫猫的年龄（必须在下一行输入）：");
			                    String age=sc.nextLine();
			                    int Age=Integer.parseInt(age);			                    		
			                    System.out.println("猫猫的性别（必须在下一行输入）：");
			                    String gender=sc.nextLine();
			                    System.out.println("猫猫胖不胖(true/false，必须在下一行输入)：");
			                    String isFat=sc.nextLine();
			                    boolean b=Boolean.parseBoolean(isFat);
			                     c=new OrangeCat(name,Age,gender,200,b);
			}else {System.out.println("给买的猫猫取个名字（必须在下一行输入）：");
		           String name=sc.nextLine();
                   System.out.println("猫猫的年龄（必须在下一行输入）:");
                   String age=sc.nextLine();
                   int Age=Integer.parseInt(age);	
                   System.out.println("猫猫的性别（必须在下一行输入）:");
                   String gender=sc.nextLine();  
                   c=new BlackCat(name,Age,gender,350);}
		try {
		mycatcafe.toBuy(c);
		}catch(InsufficientBalanceException i) {
			System.out.println("余额不足");
			i.printStackTrace();
		}}
		
		}
		//验证是否将猫猫信息加入列表
		System.out.println("猫猫列表信息：");
		Object[] obj=mycatcafe.getCat().toArray();
		for(int i=0;i<obj.length;i++) {
			Cat c=(Cat)obj[i];
			System.out.println(c.toString());		
		}
		
		
		//招待顾客
		System.out.println("输入顾客信息");
		
		while(true) {
			System.out.println("是否有顾客信息待输入（yes/no)（必须在下一行输入）:");
			String s=sa.nextLine();
			if(s.equals("no")) break;
			else {
				Customer cu;
				System.out.println("输入顾客姓名（必须在下一行输入）：");
				String name=sa.nextLine();
				System.out.println("输入顾客rua猫猫次数（必须在下一行输入）：");
				String num=sa.nextLine();
                int Num=Integer.parseInt(num);	
                System.out.println("输入顾客到店日期（如：2021-02-22）（必须在下一行输入）：");
                String time=sa.nextLine();
                LocalDate Time=LocalDate.parse(time);
                cu=new Customer(name,Num,Time);			
		try {
		mycatcafe.ToCustomer(cu);
		}catch(CatNotFoundException c) {
			System.out.println("没有猫猫可摸啦!");
			c.printStackTrace();
		}
			}
		}
		
		//歇业
		mycatcafe.toClose();
		
	}

}

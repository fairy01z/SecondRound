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
		
		//��ʼ��èè�б�
		MyCatCafe mycatcafe=new MyCatCafe();
		mycatcafe.setBalance(1000);
		Cat c1=new BlackCat("huahua ",1,"male",350);
		Cat c2=new OrangeCat("zhuzhu",2,"famale",200,false);
		mycatcafe.cat.add(c1);
		mycatcafe.cat.add(c2);
		
		//�յĹ˿��б�
		Collection cus=new ArrayList();//�յĹ˿��б�
		
		
		//��������èè��������Ϣʱ���ܱ����ϸ񰴸�ʽ���룬���ᱨ��
		while(true) {		
		System.out.println("�Ƿ�����èè��(����yes/no����������һ������)");
		String s=sc.nextLine();
		if(s.equals("no")) break;
		else {
			Cat c;
			System.out.println("��è/��è�����뺺�֣���������һ�����룩:");
			String x=sc.nextLine();
			if(x.equals("��è")) {System.out.println("�����èèȡ�����֣���������һ�����룩��");
			                    String name=sc.nextLine();
			                    System.out.println("èè�����䣨��������һ�����룩��");
			                    String age=sc.nextLine();
			                    int Age=Integer.parseInt(age);			                    		
			                    System.out.println("èè���Ա𣨱�������һ�����룩��");
			                    String gender=sc.nextLine();
			                    System.out.println("èè�ֲ���(true/false����������һ������)��");
			                    String isFat=sc.nextLine();
			                    boolean b=Boolean.parseBoolean(isFat);
			                     c=new OrangeCat(name,Age,gender,200,b);
			}else {System.out.println("�����èèȡ�����֣���������һ�����룩��");
		           String name=sc.nextLine();
                   System.out.println("èè�����䣨��������һ�����룩:");
                   String age=sc.nextLine();
                   int Age=Integer.parseInt(age);	
                   System.out.println("èè���Ա𣨱�������һ�����룩:");
                   String gender=sc.nextLine();  
                   c=new BlackCat(name,Age,gender,350);}
		try {
		mycatcafe.toBuy(c);
		}catch(InsufficientBalanceException i) {
			System.out.println("����");
			i.printStackTrace();
		}}
		
		}
		//��֤�Ƿ�èè��Ϣ�����б�
		System.out.println("èè�б���Ϣ��");
		Object[] obj=mycatcafe.getCat().toArray();
		for(int i=0;i<obj.length;i++) {
			Cat c=(Cat)obj[i];
			System.out.println(c.toString());		
		}
		
		
		//�д��˿�
		System.out.println("����˿���Ϣ");
		
		while(true) {
			System.out.println("�Ƿ��й˿���Ϣ�����루yes/no)����������һ�����룩:");
			String s=sa.nextLine();
			if(s.equals("no")) break;
			else {
				Customer cu;
				System.out.println("����˿���������������һ�����룩��");
				String name=sa.nextLine();
				System.out.println("����˿�ruaèè��������������һ�����룩��");
				String num=sa.nextLine();
                int Num=Integer.parseInt(num);	
                System.out.println("����˿͵������ڣ��磺2021-02-22������������һ�����룩��");
                String time=sa.nextLine();
                LocalDate Time=LocalDate.parse(time);
                cu=new Customer(name,Num,Time);			
		try {
		mycatcafe.ToCustomer(cu);
		}catch(CatNotFoundException c) {
			System.out.println("û��èè������!");
			c.printStackTrace();
		}
			}
		}
		
		//Ъҵ
		mycatcafe.toClose();
		
	}

}

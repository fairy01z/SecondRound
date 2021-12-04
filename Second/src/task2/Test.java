package task2;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Output o=new Output();
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		o.accept(s1, s2);		
		
		panduan p=new panduan();
		String s=sc.nextLine();
		System.out.println(p.acceptEmail(s));
	}

}

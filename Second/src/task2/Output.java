package task2;
import java.util.Scanner;
import java.util.concurrent.locks.LockSupport;
public class Output {
	public static void accept(String s1,String s2) {
		String[] a=s1.split(",");
		String[] b=s2.split(",");
		int[]arr1=new int[a.length];
		int[]arr2=new int[b.length];
		for(int i=0;i<a.length;i++) {
			arr1[i]=Integer.parseInt(a[i]);
		}for(int i=0;i<b.length;i++) {
			arr2[i]=Integer.parseInt(b[i]);
		}
		
		
		Object lock=new Object();
		Mythread m=new Mythread(lock,arr1);
		Mythread1 m1=new Mythread1(lock,arr2);
		m.start();
		m1.start();
}
}
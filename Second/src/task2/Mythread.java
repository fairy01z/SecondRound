package task2;

public class Mythread extends Thread{
	private Object lock;
	private int[] arr;
	public Mythread(Object lock,int[] arr) {
		this.lock=lock;
		this.arr=arr;
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr=arr;
	}
	public void run(){
		try {
			synchronized (lock) {
		for(int i=0;i<arr.length;i++) {
			lock.notify();
			System.out.println("�߳�1:"+arr[i]);
			Thread.sleep(500);
			lock.wait();
		}
	}
}catch(InterruptedException e) {
	e.printStackTrace();
}
	}
}

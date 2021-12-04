package task;

public class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(){
		
	}
    public InsufficientBalanceException(String message){
		super(message);
		//System.out.println("Óà¶î²»×ã");
	}
}

package userException;

public class ToDoNotFoundException extends RuntimeException{
	
	public ToDoNotFoundException(String msg) {
		super(msg);
	}
}

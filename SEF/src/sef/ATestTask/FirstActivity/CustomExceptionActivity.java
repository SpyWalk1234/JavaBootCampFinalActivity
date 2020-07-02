package sef.ATestTask.FirstActivity;

public class CustomExceptionActivity extends RuntimeException{

	@Override
	public String getMessage() {
		return "Impossible to add numbers inside the text";
	}
}


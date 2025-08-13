public class InvalidOptionException extends Exception{
	private int option;

	public InvalidOptionException(int option) {
		super();
		this.option = option;
	}

	@Override
	public String getMessage() {
		return "Option " + option + " is invalid!";
	}
}

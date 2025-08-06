public class Snake extends Animal{

	public Snake(String commonName) {
		super(commonName);
	}

	@Override
	String mobility() {
		return commonName + " crawls...";
	}
	
	String attacks() {
		return commonName + " attacks...";
	}
}

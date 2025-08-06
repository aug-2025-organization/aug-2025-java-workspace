public class Dog extends Animal{

	public Dog(String commonName) {
		super(commonName);
	}
	
	@Override
	String mobility() {
		return commonName + " walks on four legs...";
	}
	
	String friendly() {
		return commonName + " is friendly...";
	}

}

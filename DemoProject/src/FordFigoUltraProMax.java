
public class FordFigoUltraProMax extends FordFigo{
	int noOfAirbags;
	
	public FordFigoUltraProMax(String modelName, String color, String variant, int noOfAirbags) {
		super(modelName, color, variant);
		this.noOfAirbags = noOfAirbags;
	}

	String ejectAirbags() {
		return modelName + " ejected " + noOfAirbags + " airbags...";
	}
	
	@Override
	String applyBrakes() {
		return modelName + " applied ABS Brakes";
	}
}

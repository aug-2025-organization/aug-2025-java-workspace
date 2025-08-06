
public class FordDemo {

	public static void main(String[] args) {
		FordFigo ford1 = new FordFigo("Ford Figo", "Silver", "Geared");
		System.out.println(ford1.startCar());
		System.out.println(ford1.accelerate());
		System.out.println(ford1.applyBrakes());
		System.out.println(ford1.stopCar());
		System.out.println("-----------------");
		
		FordFigoUltraProMax ford2 = new FordFigoUltraProMax("Ford UPM", "White", "Geared", 6);
		System.out.println(ford2.startCar());
		System.out.println(ford2.accelerate());
		System.out.println(ford2.applyBrakes());
		System.out.println(ford2.ejectAirbags());
		System.out.println(ford2.stopCar());
		System.out.println("-----------------");
		
	}

}

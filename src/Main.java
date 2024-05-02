
public class Main {

	public static void main(String[] args) {
		
		//Polymorphism = Greek word for poly - many , morph - form
		//				 Ability of an object to identify as more than one type 
		// = = > polymorphism - >  allows us to perform a single action in different forms 
		
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		//Storing objects in an array ( USING SUPPERCLASS ) 
		Vehicle[] racers = {car,bicycle,boat};
		
		car.go();
		bicycle.go();
		boat.go();
		
		// OR 
		System.out.println();
		
		for(Vehicle x : racers) {
			x.go();
		}

	}

}

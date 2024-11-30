public class Car extends Vehicle implements Drivable {
	@Override
	public void accelerate() {
		System.out.println("Car accelerate");
	}

	@Override
	public void brake() {
		System.out.println("Car brake");
	}
}
package Lab3;

public class Ups extends ACompany {

	public Ups(String name) {
		super(name);
	}

	@Override
	public double calculateCost() {
		return 0.45 * super.getWeight();
	}

}

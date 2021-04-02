package Lab3;

public class USMail extends ACompany {

	public USMail(String name) {
		super(name);
	}

	@Override
	public double calculateCost() {
		if (super.getWeight() < 3)
			return 1;
		else if (super.getWeight() > 3) {
			return 0.55 * super.getWeight();
		}
		return 0;
	}

}

package Lab3;

public class Fedex extends ACompany {

	public Fedex(String name) {
		super(name);
	}

	@Override
	public double calculateCost() {
		/*
		 * Zone = 0.35 for IA, MT, OR and CA Zone = 0.30 for TX, and UT Zone = 0.55 for
		 * FL, MA and OH Zone = 0.43 for all others
		 */

		if (super.getZone().equals("IA") || super.getZone().equals("MT") || super.getZone().equals("OR")
				|| super.getZone().equals("CA")) {
			return 0.35 * super.getWeight();
		} else if (super.getZone().equals("TX") || super.getZone().equals("UT")) {
			return 0.3 * super.getWeight();
		} else if (super.getZone().equals("FL") || super.getZone().equals("MA") || super.getZone().equals("OH")) {
			return 0.55 * super.getWeight();
		} else {
			return 0.43 * super.getWeight();
		}
	}

}

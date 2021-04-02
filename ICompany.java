package Lab3;

public interface ICompany extends Cloneable {
	public double calculateCost();

	public void setZone(String zone);

	public void setWeight(double weight);

	public void setDescript(String desc);

	public String getDescript();

	public String getName();

	public double getWeight();

	public String getZone();

	public Object clone() throws CloneNotSupportedException;
}

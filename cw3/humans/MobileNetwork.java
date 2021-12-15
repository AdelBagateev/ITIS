package provides;

public class MobileNetwork implements IElectricity{
	String name;
	double gb;
	int price;
	public MobileNetwork(String name, double gb, int price){
		this.name =name;
		this.gb = gb;
		this.price=price;
	}
	public void spendInternet(double gb){
		System.out.println("Use " +gb+  " Gb from " + name);
	}
}
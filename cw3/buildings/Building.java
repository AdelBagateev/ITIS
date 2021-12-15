package buildings;

public abstract class Building{
	public Building(){}
	public void connectElectricity(IElectricity e){}
	public void connectInternet(INet i){}
	public void spend(int e, double i){}
	public void pay(int money){}
}
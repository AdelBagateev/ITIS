package parts;

import cars.*;
import exceptions.*;


public abstract class Engine {

	protected int power;

	public Engine(int power) {
		this.power = power;
	}

	public int getPower() { return power; }

	public abstract int powerForSpeed(int v);

}
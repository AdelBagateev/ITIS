package parts;

import cars.*;
import exceptions.*;


public class ElectricEngine extends Engine {

	public ElectricEngine(int power) {
		super(power);
	}

	public int powerForSpeed(int v) {
		return v * v;
	}

}
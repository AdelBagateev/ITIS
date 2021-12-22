package parts;

import cars.*;
import exceptions.*;


public class DieselEngine extends Engine {

	public DieselEngine(int power) {
		super(power);
	}

	public int powerForSpeed(int v) {
		return 80 * v;
	}

}
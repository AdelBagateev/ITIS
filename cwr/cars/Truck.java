package cars;

import parts.*;
import exceptions.*;


public class Truck extends Car {

	private int maxMass;

	public Truck(Engine engine, int maxMass) {
		super(engine, 6);
		this.maxMass = maxMass;
	}

	public void moveCargo(int mass) throws MaxMassException {
		if (mass <= maxMass) {
			try {
				move(50);
				System.out.println("Move cargo " + mass + " kg");
			} catch (WrongWheelsException wwe) {
				System.out.println(wwe);
			} catch (InsufficientPowerException ipe) {
				System.out.println(ipe);
			}
			
		} else {
			throw new MaxMassException();
		}

	}

}

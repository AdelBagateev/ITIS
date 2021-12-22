package cars;

import parts.*;
import exceptions.*;


public class Car {

	protected Engine engine;
	protected Wheel[] wheels;

	public Car(Engine engine, int wheelCount) {
		this.engine = engine;
		wheels = new Wheel[wheelCount];
	}

	public void addWheel(Wheel w) {
		for (int i = 0; i < wheels.length; i++) {
			if (wheels[i] == null) {
				wheels[i] = w;
			}
		}
		if (wheels[wheels.length - 1] != null) {
			wheels[wheels.length - 1] = w;
		}
	}

	public void move(int velocity)
		throws WrongWheelsException, InsufficientPowerException
	{
		for (int c = 0; c < wheels.length; c++) {
			for (int k = 0; k < wheels.length; k++) {
				if (c != k && (wheels[c].getRadius() != wheels[k].getRadius() || wheels[c] == null || 
					wheels[k] == null)) 
				{
					throw new WrongWheelsException();
				}
			}
		}

		if (engine.getPower() < engine.powerForSpeed(velocity)) {
			throw new InsufficientPowerException(engine.powerForSpeed(velocity));
		}
	}

}
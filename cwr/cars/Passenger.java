package cars;

import parts.*;
import exceptions.*;


public class Passenger extends Car {

	public Passenger(Engine engine, int wheelCount) {
		super(engine, wheelCount);
	}

	public void movePeople(int count) {
		int vel = 120 / count;
		try {
			move(vel);
		} catch (WrongWheelsException wwe) {
			System.out.println(wwe);
		} catch (InsufficientPowerException ipe) {
			System.out.println(ipe);
		}
		System.out.println("Move " + count + " humans at " +
			vel + " km/h");
	}

}
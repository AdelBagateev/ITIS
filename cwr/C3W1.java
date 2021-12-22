import cars.*;
import parts.*;
import exceptions.*;

public class C3W1 {
    public static void main(String[] args) throws Exception {
        Engine diesel = new DieselEngine(10000);
        Truck truck = new Truck(diesel,2500);
        for (int i=0; i<5; i++) {
            truck.addWheel(new Wheel(20));
        }
        truck.addWheel(new Wheel(24));
        truck.addWheel(new Wheel(20)); // заменяет последнее
        truck.moveCargo(2000);

        Engine electric = new ElectricEngine(10000);
        Passenger pass = new Passenger(electric, 4);
        for (int i=0; i<4; i++) pass.addWheel(new Wheel(18));
        pass.movePeople(3);
        pass.movePeople(1);     // недостаточно мощности
    }
}

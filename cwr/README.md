
Если не указано иное, все классы и методы должны быть public, все данные - private, все исключения унаследованы от Exception. 

# Пакет cars 

Автомобили состоят из двигателя и колёс. Автомобили бывают грузовыми и пассажирскими.

## Класс Car

- имеет двигатель `Engine engine` и массив колёс `Wheel[] wheels`
- конструктор `Car(Engine engine, int wheelCount)`
- метод добавления колеса `void addWheel(Wheel w)`. Добавляет колесо к машине. Если добавляется большее количество колёс, чем указано, заменяет последнее колесо.
- метод движения с заданной скоростью `void move(int velocity)`, который нельзя переопределить в потомках. Если не у всех колёс одинаковый диаметр (или некоторые колёса отсутствуют или выдают исключение при получении радиуса), выбрасывает исключение `WrongWheelsException`. Далее, проверяется необходимая для движения с указанной скоростью мощность двигателя и если её недостаточно, выбрасывается исключение `InsufficientPowerException`.

## Класс Truck (Car)

- унаследован от Car
- конструктор `Truck(Engine engine, int maxMass)` создаёт грузовик с указанным двигателем, максимальной грузоподъёмностью и шестью колёсами
- метод `void moveCargo(int mass)` для перевозки грузов массой `mass`. Если масса не превосходит грузоподъёмность, вызывает `move` со скоростью в `50` и выводит на экран `"Move cargo <mass> kg"` (например, `"Move cargo 2000 kg"`), иначе выбрасывает исключение `MaxMassException`.

## Класс Passenger (Car)

- унаследован от Car 
- метод `void movePeople(int count)` для перевозки `count` пассажиров. Вызывает `move` со скоростью, равной частному от деления 120 на количество пассажиров, и выводит на экран `"Move <count> humans at <vel> km/h"` (например, `"Move 3 humans at 40 km/h"`)

# Пакет parts

Части машин: двигатели и колёса.

## Wheel 

- конструктор `Wheel(int radius)` для построения колеса с указанным радиусом
- метод `int getRadius()` для получения радиуса 

## Абстрактный класс Engine

- конструктор `Engine(int power)` для двигателя с указанной мощностью
- метод `int getPower()` для получения мощности двигателя
- абстрактный метод `int powerForSpeed(int v)` для получения необходимой мощности для движения со скоростью `v`

# DieselEngine 

- наследуется от Engine
- требуемая мощность для скорости `v` равна `80*v`

# ElectricEngine

- наследуется от Engine
- требуемая мощность для скорости `v` равна `v*v`

# Пакет exceptions 

Все исключения собраны в одном пакете.

## WrongWheelsException

## InsufficientPowerException
- конструктор `InsufficientPowerException(int required)` с требуемой мощностью
- метод `int getRequiredPower()` для получения требуемой мощности

## MaxMassException

# Пример

Код из C3W1 при реализации всех нужных классов выведет следующее:

```
Move cargo 2000 kg
Move 3 humans at 40 km/h
Exception in thread "main" exceptions.InsufficientPowerException
	at cars.Car.move(Car.java:39)
	at cars.Passenger.movePeople(Passenger.java:13)
	at C3W1.main(C3W1.java:20)
```

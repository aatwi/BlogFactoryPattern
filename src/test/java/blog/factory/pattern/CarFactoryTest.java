package blog.factory.pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarFactoryTest {

    private static final String DIESEL = "Diesel";
    private static final String ELECTRICAL = "Electrical";
    private static final String HYBRID = "Hybrid";
    private static final String PETROL = "Petrol";

    private static final DieselCar BMW_DIESEL_CAR = new DieselCar("BMW");
    private static final ElectricalCar MERCEDES_ELECTRICAL_CAR = new ElectricalCar("Mercedes");
    private static final HybridCar TOYOTA_HYBRID_CAR = new HybridCar("Toyota");
    private static final PetrolCar HONDA_PETROL_CAR = new PetrolCar("Honda");

    @Test
    public void
    CarFactory_shouldReturnTheCorrectCarInstance_UsingTheIfStatements() {
        Assertions.assertEquals(BMW_DIESEL_CAR, CarFactoryIfStatement.getCar(DIESEL, "BMW"));
        Assertions.assertEquals(MERCEDES_ELECTRICAL_CAR, CarFactoryIfStatement.getCar(ELECTRICAL, "Mercedes"));
        Assertions.assertEquals(TOYOTA_HYBRID_CAR, CarFactoryIfStatement.getCar(HYBRID, "Toyota"));
        Assertions.assertEquals(HONDA_PETROL_CAR, CarFactoryIfStatement.getCar(PETROL, "Honda"));
    }

    @Test
    public void
    CarFactory_shouldReturnTheCorrectCarInstance_UsingTheSwitchStatements() {
        Assertions.assertEquals(BMW_DIESEL_CAR, CarFactorySwitchStatement.getCar(DIESEL, "BMW"));
        Assertions.assertEquals(MERCEDES_ELECTRICAL_CAR, CarFactorySwitchStatement.getCar(ELECTRICAL, "Mercedes"));
        Assertions.assertEquals(TOYOTA_HYBRID_CAR, CarFactorySwitchStatement.getCar(HYBRID, "Toyota"));
        Assertions.assertEquals(HONDA_PETROL_CAR, CarFactorySwitchStatement.getCar(PETROL, "Honda"));
    }

    @Test
    public void
    CarFactory_shouldReturnTheCorrectCarInstance_UsingTheMap() {
        Assertions.assertEquals(BMW_DIESEL_CAR, CarFactory.getCar(DIESEL, "BMW"));
        Assertions.assertEquals(MERCEDES_ELECTRICAL_CAR, CarFactory.getCar(ELECTRICAL, "Mercedes"));
        Assertions.assertEquals(TOYOTA_HYBRID_CAR, CarFactory.getCar(HYBRID, "Toyota"));
        Assertions.assertEquals(HONDA_PETROL_CAR, CarFactory.getCar(PETROL, "Honda"));
    }
}
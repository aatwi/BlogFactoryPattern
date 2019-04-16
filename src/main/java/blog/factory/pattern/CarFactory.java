package blog.factory.pattern;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

class CarFactory {

    private static final Map<String, CarCreator> CAR_FACTORY_MAP = ImmutableMap.of(
            "Diesel", brand -> new DieselCar(brand),
            "Electrical", brand -> new ElectricalCar(brand),
            "Hybrid", brand -> new HybridCar(brand),
            "Petrol", brand -> new PetrolCar(brand)
    );

    private CarFactory() {
    }

    static Car getCar(String type, String brand) {
        if (CAR_FACTORY_MAP.containsKey(type)) {
            return CAR_FACTORY_MAP.get(type).initialize(brand);
        }
        throw new UnsupportedOperationException();
    }

    private interface CarCreator {
        Car initialize(String brand);
    }

}

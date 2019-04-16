package blog.factory.pattern;

class CarFactoryIfStatement {

    private CarFactoryIfStatement() {

    }

    static Car getCar(String type, String brand) {
        if (type.equals("Diesel")) {
            return new DieselCar(brand);
        } else if (type.equals("Electrical")) {
            return new ElectricalCar(brand);
        } else if (type.equals("Hybrid")) {
            return new HybridCar(brand);
        } else if (type.equals("Petrol")) {
            return new PetrolCar(brand);
        }
        throw new UnsupportedOperationException();
    }
}

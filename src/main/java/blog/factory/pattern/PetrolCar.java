package blog.factory.pattern;

import java.util.Objects;

public final class PetrolCar implements Car {
    private final String brand;

    PetrolCar(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetrolCar petrolCar = (PetrolCar) o;
        return Objects.equals(brand, petrolCar.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }
}

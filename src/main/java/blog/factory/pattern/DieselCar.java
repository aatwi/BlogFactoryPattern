package blog.factory.pattern;

import java.util.Objects;

public final class DieselCar implements Car {
    private final String brand;

    DieselCar(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DieselCar dieselCar = (DieselCar) o;
        return Objects.equals(brand, dieselCar.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }
}

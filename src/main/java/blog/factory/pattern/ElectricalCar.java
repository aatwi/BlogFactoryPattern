package blog.factory.pattern;

import java.util.Objects;

public final class ElectricalCar implements Car {
    private final String brand;

    public ElectricalCar(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElectricalCar that = (ElectricalCar) o;
        return Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }
}

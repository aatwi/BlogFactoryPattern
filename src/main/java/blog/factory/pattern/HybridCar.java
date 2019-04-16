package blog.factory.pattern;

import java.util.Objects;

public final class HybridCar implements Car {
    private final String brand;

    public HybridCar(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HybridCar hybridCar = (HybridCar) o;
        return Objects.equals(brand, hybridCar.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }
}

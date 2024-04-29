package VisitorPattern;

public interface Furniture {
    public double accept(ShippingCostCalculator shippingCalculator);
}

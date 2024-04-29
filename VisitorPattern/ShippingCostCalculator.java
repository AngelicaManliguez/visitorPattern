package VisitorPattern;

public interface ShippingCostCalculator {
    public double calculateShippingCost(Chairs chair);
    public double calculateShippingCost(Tables table);
    public double calculateShippingCost(Sofas sofa);
}

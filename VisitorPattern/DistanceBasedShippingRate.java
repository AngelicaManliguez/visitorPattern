package VisitorPattern;

public class DistanceBasedShippingRate implements ShippingCostCalculator{

    private int distance;
    public DistanceBasedShippingRate(int distance)
    {
        this.distance = distance;
    }

    @Override
    public double calculateShippingCost(Chairs chair) {
        return chair.getSize() * distance;
    }

    @Override
    public double calculateShippingCost(Tables table) {
        return table.getSize() * distance;
    }

    @Override
    public double calculateShippingCost(Sofas sofa) {
        return sofa.getSize() * distance;
    }
}

package VisitorPattern;

public class FlatShippingRate implements ShippingCostCalculator{

    @Override
    public double calculateShippingCost(Chairs chair) {
        return chair.getSize() * 10;
    }

    @Override
    public double calculateShippingCost(Tables table) {
        return table.getSize() * 10;
    }

    @Override
    public double calculateShippingCost(Sofas sofa) {
        return sofa.getSize() * 10;
    }
}

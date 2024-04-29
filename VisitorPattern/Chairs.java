package VisitorPattern;

public class Chairs implements Furniture{
    private int size;

    public Chairs(int size)
    {
        this.size = size;
    }

    public int getSize()
    {
        return size;
    }

    @Override
    public double accept(ShippingCostCalculator shippingCalculator) {
        return shippingCalculator.calculateShippingCost(this);
    }
}

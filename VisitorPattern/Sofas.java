package VisitorPattern;

public class Sofas implements Furniture{
    private int size;

    public Sofas(int size)
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

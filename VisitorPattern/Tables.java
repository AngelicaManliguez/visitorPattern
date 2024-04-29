package VisitorPattern;

public class Tables implements Furniture{
    private int size;

    public Tables(int size)
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

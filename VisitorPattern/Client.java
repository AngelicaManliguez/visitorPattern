package VisitorPattern;

public class Client {
    public static void main(String[] args)
    {
        Chairs chair = new Chairs(20);
        Tables table = new Tables(40);
        Sofas sofa = new Sofas(80);

        FlatShippingRate flatRate = new FlatShippingRate();
        double chairFlatRate = chair.accept(flatRate);
        double tableFlatRate = table.accept(flatRate);

        System.out.println("-------------------SHIPPING RATE-------------------\n");
        System.out.println("Flat Rate Shipping Cost for Chair: P" + chairFlatRate);
        System.out.println("Flat Rate Shipping Cost for Table: P" + tableFlatRate);
        System.out.println();

        DistanceBasedShippingRate distance10km = new DistanceBasedShippingRate(10);
        double sofaDistanceBased = sofa.accept(distance10km);

        System.out.println("Distance-Based(10km) Shipping Cost for Sofa: P" + sofaDistanceBased);

        DistanceBasedShippingRate distance20km = new DistanceBasedShippingRate(20);
        sofaDistanceBased = sofa.accept(distance20km);

        System.out.println("Distance-Based(20km) Shipping Cost for Sofa: P" + sofaDistanceBased);


        DistanceBasedShippingRate distance30km = new DistanceBasedShippingRate(30);
        sofaDistanceBased = sofa.accept(distance30km);

        System.out.println("Distance-Based(30km) Shipping Cost for Sofa: P" + sofaDistanceBased);

    }

}

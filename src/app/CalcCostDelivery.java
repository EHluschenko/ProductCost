package app;

public class CalcCostDelivery extends CalcCostBase{

    private final static double DELIVERYPRICE=7;

    public double calcCost(Product product){
        return product.getQuota() * product.getPrice() + deliveryPrice;
    }
}

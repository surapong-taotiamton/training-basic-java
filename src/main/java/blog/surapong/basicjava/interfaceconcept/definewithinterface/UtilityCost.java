package blog.surapong.basicjava.interfaceconcept.definewithinterface;

public class UtilityCost implements  CalculateCostAble{

    public String utilityName;
    public double price;

    public UtilityCost(String utilityName, double price) {
        this.utilityName = utilityName;
        this.price = price;
    }

    @Override
    public double calculateCost() {
        return this.price;
    }

    @Override
    public void printCostDescription() {
        System.out.println(this.utilityName + " " + this.price);
    }
}

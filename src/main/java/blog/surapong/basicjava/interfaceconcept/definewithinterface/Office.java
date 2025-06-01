package blog.surapong.basicjava.interfaceconcept.definewithinterface;

public class Office implements CalculateCostAble {

    public String address;
    public double rentValue;

    public Office(String address, double rentValue) {
        this.address = address;
        this.rentValue = rentValue;
    }

    //////////////////////////////////
    // Method ที่ต้องสร้างจาก Interface
    //////////////////////////////////


    @Override
    public double calculateCost() {
        return this.rentValue;
    }

    @Override
    public void printCostDescription() {
        System.out.println(this.address + " " + this.rentValue);
    }
}

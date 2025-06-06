package blog.surapong.basicjava.interfaceconcept.definewithinterface;

public class BaseEmployee implements CalculateCostAble {

    public String firstname;
    public String lastname;
    public double baseSalary;
    public String position;

    public BaseEmployee() {}

    public BaseEmployee(String firstname, String lastname, double baseSalary, String position) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
        this.position = position;
    }

    public double calculateSalary() {
        return this.baseSalary;
    }

    public void printEmployeeDescription() {
        System.out.printf("firstname : %s  lastname : %s position : %s  salary :%.2f \n", this.firstname, this.lastname, this.position, this.calculateSalary());
    }


    //////////////////////////////////
    // Method ที่ต้องสร้างจาก Interface
    //////////////////////////////////


    @Override
    public double calculateCost() {
        return this.calculateSalary();
    }

    @Override
    public void printCostDescription() {
        System.out.println(this.firstname + " " + this.lastname + " : " + this.calculateSalary());
    }
}

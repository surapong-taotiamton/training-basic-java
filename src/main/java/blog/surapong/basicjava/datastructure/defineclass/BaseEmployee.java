package blog.surapong.basicjava.datastructure.defineclass;

public class BaseEmployee implements CalculateCostAble {

    private String firstname;
    private String lastname;
    private double baseSalary;
    private String position;

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

    ////////////////////////////
    // GETTER SETTER
    ///////////////////////////


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

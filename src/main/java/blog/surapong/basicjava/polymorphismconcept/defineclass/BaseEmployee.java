package blog.surapong.basicjava.polymorphismconcept.defineclass;

public class BaseEmployee {

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


}

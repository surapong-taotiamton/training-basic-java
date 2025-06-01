package blog.surapong.basicjava.datastructure.defineclass;

public class SaleEmployee extends BaseEmployee {

    public double saleIncentivePerMonth;

    public SaleEmployee(String firstname, String lastname, double baseSalary, double saleIncentivePerMonth) {
        super(firstname, lastname, baseSalary, "SALE");
        this.saleIncentivePerMonth = saleIncentivePerMonth;
    }

    @Override
    public double calculateSalary() {
        return this.getBaseSalary() + saleIncentivePerMonth;
    }
}

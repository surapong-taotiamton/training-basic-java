package blog.surapong.basicjava.polymorphismconcept;

import blog.surapong.basicjava.polymorphismconcept.defineclass.Employee;
import blog.surapong.basicjava.polymorphismconcept.defineclass.EmployeeMultiplePosition;

public class Example2 {


    public static void main(String[] args) {


        EmployeeMultiplePosition sale = new EmployeeMultiplePosition("มงคล", "งามเด่น", 25000, "SALE");
        sale.saleIncentivePerMonth = 500;

        EmployeeMultiplePosition manager = new EmployeeMultiplePosition("สมชาย", "มากมี", 30000, "MANAGER");
        manager.managerHasProject = 5;

        EmployeeMultiplePosition normal = new EmployeeMultiplePosition("มั่งมี", "ศรีสุข", 15000, "NORMAL");

        EmployeeMultiplePosition[] employees = new EmployeeMultiplePosition[]{sale, manager, normal};

        sumCost(employees);

    }


    public static void sumCost(EmployeeMultiplePosition[] employees) {
        double sumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].firstname + " " + employees[i].lastname + " : " + employees[i].calculateSalary());
            sumSalary += employees[i].baseSalary;
        }
        System.out.println("รวมเงินที่ต้องจ่าย : " + sumSalary);
    }
}

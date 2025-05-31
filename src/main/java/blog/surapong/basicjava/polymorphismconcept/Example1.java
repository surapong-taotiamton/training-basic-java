package blog.surapong.basicjava.polymorphismconcept;

import blog.surapong.basicjava.polymorphismconcept.defineclass.Employee;

public class Example1 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("มงคล", "งามเด่น", 25000);
        Employee employee2 = new Employee("สมชาย", "มากมี", 30000);
        Employee employee3 = new Employee("มั่งมี", "ศรีสุข", 15000);

        Employee[] employees = new Employee[]{employee1, employee2, employee3};

        sumCost(employees);

    }

    public static void sumCost(Employee[] employees) {
        double sumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].firstname + " " + employees[i].lastname + " : " + employees[i].baseSalary);
            sumSalary += employees[i].baseSalary;
        }
        System.out.println("รวมเงินที่ต้องจ่าย : " + sumSalary);
    }

}

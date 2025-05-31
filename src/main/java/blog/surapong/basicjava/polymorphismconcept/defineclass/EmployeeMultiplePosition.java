package blog.surapong.basicjava.polymorphismconcept.defineclass;


/**
 * อยากได้ Class Employee ที่สามารถเก็บได้หลายตำแหน่ง และ Employ แต่ละตำแหน่งคิดเงินไม่เหมือนกัน
 */
public class EmployeeMultiplePosition {

    public String firstname;
    public String lastname;
    public double baseSalary;
    public String position;

    public int managerHasProject = 0;

    public double saleIncentivePerMonth = 0;


    public EmployeeMultiplePosition(String firstname, String lastname, double baseSalary, String position) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
        this.position = position;
    }

    public double calculateSalary() {

        if (position.equals("SALE")) {
            return this.baseSalary + saleIncentivePerMonth;
        } else if (position.equals("MANAGER")) {
            return this.baseSalary + (managerHasProject * 500);
        } else {
            return this.baseSalary;
        }
    }


}

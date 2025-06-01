package blog.surapong.basicjava.polymorphismconcept.defineclass;

public class SpecialManagerEmployee extends ManagerEmployee {

    public double specialManagerIncentive = 0;

    public SpecialManagerEmployee(String firstname, String lastname, double baseSalary, int managerHasProject, double specialManagerIncentive) {
        super(firstname, lastname, baseSalary, managerHasProject);
        this.specialManagerIncentive = specialManagerIncentive;
        this.position = "SPECIAL_MANAGER";
    }

    @Override
    public double calculateSalary() {
        return this.baseSalary + (managerHasProject * 500) + specialManagerIncentive;
    }
}

package blog.surapong.basicjava.datastructure.defineclass;

public class ManagerEmployee extends BaseEmployee {

    public int managerHasProject = 0;

    public ManagerEmployee(String firstname, String lastname, double baseSalary, int managerHasProject) {
        super(firstname, lastname, baseSalary, "MANAGER");
        this.managerHasProject = managerHasProject;
    }

    @Override
    public double calculateSalary() {
        return this.getBaseSalary() + (managerHasProject * 500);
    }
}

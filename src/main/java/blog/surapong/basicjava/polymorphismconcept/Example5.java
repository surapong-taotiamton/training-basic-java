package blog.surapong.basicjava.polymorphismconcept;

import blog.surapong.basicjava.polymorphismconcept.defineclass.BaseEmployee;
import blog.surapong.basicjava.polymorphismconcept.defineclass.ManagerEmployee;
import blog.surapong.basicjava.polymorphismconcept.defineclass.SaleEmployee;
import blog.surapong.basicjava.polymorphismconcept.defineclass.SpecialManagerEmployee;

public class Example5 {

    public static void main(String[] args) {

        ManagerEmployee manager = new ManagerEmployee("สมชาย", "มากมี", 30000, 5);

        SpecialManagerEmployee specialManagerEmployee = new SpecialManagerEmployee("บุญชู", "มั่งมี", 40000, 5, 6000);

        manager.printEmployeeDescription();
        specialManagerEmployee.printEmployeeDescription();

    }

}

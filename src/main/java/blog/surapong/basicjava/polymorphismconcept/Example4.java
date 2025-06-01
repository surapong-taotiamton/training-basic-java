package blog.surapong.basicjava.polymorphismconcept;

import blog.surapong.basicjava.polymorphismconcept.defineclass.BaseEmployee;
import blog.surapong.basicjava.polymorphismconcept.defineclass.ManagerEmployee;
import blog.surapong.basicjava.polymorphismconcept.defineclass.NormalEmployee;
import blog.surapong.basicjava.polymorphismconcept.defineclass.SaleEmployee;

public class Example4 {

    public static void main(String[] args) {

        SaleEmployee sale = new SaleEmployee("มงคล", "งามเด่น", 25000, 500);
        System.out.println("saleIncentive is : " + sale.saleIncentivePerMonth);

        BaseEmployee saleInTypeBaseEmployee = sale;
        // จะมองไม่เห็น saleIncentivePerMonth เพราะตอนนี้ sale อยู่ภายใต้ type BaseEmployee
        // BaseEmployee ไม่ได้บอกว่ามีค่า saleIncentive
        // System.out.println(saleInTypeBaseEmployee.saleIncentivePerMonth);

        // ถ้าอยากเห็นค่าต้องทำแบบนี้
        // อันนี้เรียกว่าการแปลง cast type  เรารู้ว่า saleInTypeBaseEmployee
        System.out.println("saleIncentive is : " +  ((SaleEmployee) saleInTypeBaseEmployee).saleIncentivePerMonth);

        ManagerEmployee manager = new ManagerEmployee("สมชาย", "มากมี", 30000, 5);
        System.out.println("managerHasProject is : " + manager.managerHasProject);

        BaseEmployee managerInTypeBaseEmployee = manager;

        // จะมองไม่เห็น saleIncentivePerMonth เพราะตอนนี้ manager อยู่ภายใต้ type BaseEmployee
        //System.out.println("managerHasProject is : " + managerInTypeBaseEmployee.managerHasProject);

        System.out.println("managerHasProject is : " + ((ManagerEmployee)managerInTypeBaseEmployee).managerHasProject);


    }

}

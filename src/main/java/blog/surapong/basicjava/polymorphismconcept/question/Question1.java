package blog.surapong.basicjava.polymorphismconcept.question;

import blog.surapong.basicjava.polymorphismconcept.defineclass.BaseEmployee;
import blog.surapong.basicjava.polymorphismconcept.defineclass.ManagerEmployee;
import blog.surapong.basicjava.polymorphismconcept.defineclass.NormalEmployee;
import blog.surapong.basicjava.polymorphismconcept.defineclass.SaleEmployee;

public class Question1 {

    // สร้าง Class ใหม่ที่สืบทอดจาก BaseEmployee ชื่อ CeoEmployee โดยมีฟิลล์ขื่อ stock
    // โดยเงินเดือนของ CEO จะคิดจาก baseSalary + ( 5 * stock )
    // โดยจะต้องสามารถนำมาเพิ่มใน Code ด้านล่างแล้วทำงานได้

    public static void main(String[] args) {
        SaleEmployee sale = new SaleEmployee("มงคล", "งามเด่น", 25000, 500);

        ManagerEmployee manager = new ManagerEmployee("สมชาย", "มากมี", 30000, 5);

        NormalEmployee normal = new NormalEmployee("มั่งมี", "ศรีสุข", 15000);

        BaseEmployee[] employees = new BaseEmployee[]{sale, manager, normal};

        sumCost(employees);
    }



    public static void sumCost(BaseEmployee[] employees) {
        double sumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].firstname + " " + employees[i].lastname + " : " + employees[i].calculateSalary());
            sumSalary += employees[i].baseSalary;
        }
        System.out.println("รวมเงินที่ต้องจ่าย : " + sumSalary);
    }
}

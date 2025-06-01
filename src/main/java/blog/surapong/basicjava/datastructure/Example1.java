package blog.surapong.basicjava.datastructure;


import blog.surapong.basicjava.datastructure.defineclass.*;

import java.util.ArrayList;

public class Example1 {


    public static void main(String[] args) {

        ArrayList<BaseEmployee> baseEmployeeArrayList = new ArrayList<>();


        SaleEmployee sale1 = new SaleEmployee("มงคล", "งามเด่น", 25000, 500);
        SaleEmployee sale2 = new SaleEmployee("สมหญิง", "มุ่งมุ่น", 30000, 1000);
        SaleEmployee sale3 = new SaleEmployee("ปิติ", "มีม้า", 50000, 5000);

        baseEmployeeArrayList.add(sale1);
        baseEmployeeArrayList.add(sale2);
        baseEmployeeArrayList.add(sale3);

        ManagerEmployee manager1 = new ManagerEmployee("สมชาย", "มากมี", 30000, 5);
        ManagerEmployee manager2 = new ManagerEmployee("มานี", "มากมาย", 45000, 5);

        baseEmployeeArrayList.add(manager1);
        baseEmployeeArrayList.add(manager2);

        NormalEmployee normal1 = new NormalEmployee("มั่งมี", "ศรีสุข", 15000);
        NormalEmployee normal2 = new NormalEmployee("ชูใจ", "ดีใจ", 15000);
        NormalEmployee normal3 = new NormalEmployee("วิษณุ", "สิงห์", 15000);
        NormalEmployee normal4 = new NormalEmployee("จิต", "แววตา", 15000);
        NormalEmployee normal5 = new NormalEmployee("วาสนา", "มากพร้อม", 15000);

        baseEmployeeArrayList.add(normal1);
        baseEmployeeArrayList.add(normal2);
        baseEmployeeArrayList.add(normal3);
        baseEmployeeArrayList.add(normal4);
        baseEmployeeArrayList.add(normal5);

        System.out.println("ArrayList has size : " + baseEmployeeArrayList.size());

        System.out.println("########### PRINT WITH USE INDEX");

        // Loop แบบใช้ Index
        for (int i = 0; i < baseEmployeeArrayList.size(); i++) {
            baseEmployeeArrayList.get(i).printEmployeeDescription();
        }

        System.out.println("################## PRINT WITH NOT USE INDEX");

        // Loop แบบไม่ใช้ Index
        for (BaseEmployee baseEmployee : baseEmployeeArrayList) {
            baseEmployee.printEmployeeDescription();
        }
    }

}

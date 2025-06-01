package blog.surapong.basicjava.datastructure;

import blog.surapong.basicjava.datastructure.defineclass.BaseEmployee;
import blog.surapong.basicjava.datastructure.defineclass.ManagerEmployee;
import blog.surapong.basicjava.datastructure.defineclass.NormalEmployee;
import blog.surapong.basicjava.datastructure.defineclass.SaleEmployee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Example3 {

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

        summaryEmployee(baseEmployeeArrayList);
    }

    // อยาก Print สรุปว่ามีกี่ตำแหน่ง ตำแหน่งละกี่คน มีใครบ้าง
    public static void summaryEmployee(ArrayList<BaseEmployee> employeeArrayList) {


        HashMap<String, ArrayList<BaseEmployee>> hashMapByPosition = new HashMap<>();

        // แยกกลุ่มด้วยตำแหน่ง

        for (BaseEmployee baseEmployee : employeeArrayList) {
            ArrayList<BaseEmployee> listByPosition  = hashMapByPosition.getOrDefault(baseEmployee.getPosition(), new ArrayList<BaseEmployee>());
            listByPosition.add(baseEmployee);
            hashMapByPosition.put(baseEmployee.getPosition(), listByPosition);
        }

        System.out.println("Company has : " + hashMapByPosition.keySet().size() + " Position");
        for (String position : hashMapByPosition.keySet()) {
            System.out.println("Position : " + position);
        }


        for (String position : hashMapByPosition.keySet()) {
            System.out.println("Position : " + position + " has employee ");

            for (BaseEmployee baseEmployee : hashMapByPosition.get(position)) {
                baseEmployee.printEmployeeDescription();
            }
        }

    }

}

package blog.surapong.basicjava.datastructure;

import blog.surapong.basicjava.datastructure.defineclass.BaseEmployee;
import blog.surapong.basicjava.datastructure.defineclass.NormalEmployee;

import java.util.HashMap;

public class Example2 {

    public static void main(String[] args) {
        HashMap<String, BaseEmployee> baseEmployeeHashMap = new HashMap<>();

        NormalEmployee normal1 = new NormalEmployee("มั่งมี", "ศรีสุข", 15000);
        NormalEmployee normal2 = new NormalEmployee("ชูใจ", "ดีใจ", 15000);
        NormalEmployee normal3 = new NormalEmployee("วิษณุ", "สิงห์", 15000);
        NormalEmployee normal4 = new NormalEmployee("จิต", "แววตา", 15000);
        NormalEmployee normal5 = new NormalEmployee("วาสนา", "มากพร้อม", 15000);

        baseEmployeeHashMap.put(normal1.getFirstname(), normal1);
        baseEmployeeHashMap.put(normal2.getFirstname(), normal2);
        baseEmployeeHashMap.put(normal3.getFirstname(), normal3);
        baseEmployeeHashMap.put(normal4.getFirstname(), normal4);
        baseEmployeeHashMap.put(normal5.getFirstname(), normal5);


        findEmployeeByName("วาสนา", baseEmployeeHashMap);
        findEmployeeByName("ปัญญา", baseEmployeeHashMap);
        findEmployeeByName("จิต", baseEmployeeHashMap);


    }

    public static void findEmployeeByName(String firstname, HashMap<String, BaseEmployee> allEmployee) {

        BaseEmployee employee  = allEmployee.get(firstname);

        if (employee != null) {
            employee.printEmployeeDescription();
        } else {
            System.out.println("Not found employee name : " + firstname );
        }
    }

}

package blog.surapong.basicjava.classconcept;

import java.time.LocalDate;

public class Example2 {

    public static void main(String[] args) {

        String bankAccountFirstName = "สมชาย";
        String bankAccountLastName = "มีทรัพย์";
        double bankAccountMoney = 2500;
        LocalDate bankAccountCreateAt = LocalDate.of(2025, 1, 1);

        System.out.println("Firstname : " + bankAccountFirstName);
        System.out.println("Lastname : " + bankAccountLastName);
        System.out.println("Money : " + bankAccountMoney);
        System.out.println("CreateAt : " + bankAccountCreateAt);

        // ปัญหาคือ ถ้าอยาก print บัญชีอื่นก็ต้อง copy ตรงส่วนที่เป็นการ print ไปหลายๆที่แบบนี้

        String bankAccountFirstName2 = "สมหญิง";
        String bankAccountLastName2 = "มีทอง";
        double bankAccountMoney2 = 30000.10;
        LocalDate bankAccountCreateAt2 = LocalDate.of(2025, 1, 1);

        System.out.println("Firstname : " + bankAccountFirstName2);
        System.out.println("Lastname : " + bankAccountLastName2);
        System.out.println("Money : " + bankAccountMoney2);
        System.out.println("CreateAt : " + bankAccountCreateAt2);


    }

}

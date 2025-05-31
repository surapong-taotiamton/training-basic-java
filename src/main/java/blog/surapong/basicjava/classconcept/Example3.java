package blog.surapong.basicjava.classconcept;

import java.time.LocalDate;

public class Example3 {

    public static void main(String[] args) {

        String bankAccountFirstName = "สมชาย";
        String bankAccountLastName = "มีทรัพย์";
        double bankAccountMoney = 2500;
        LocalDate bankAccountCreateAt = LocalDate.of(2025, 1, 1);

        printBankAccount(bankAccountFirstName, bankAccountLastName, bankAccountMoney, bankAccountCreateAt);

        String bankAccountFirstName2 = "สมหญิง";
        String bankAccountLastName2 = "มีทอง";
        double bankAccountMoney2 = 35000.10;
        LocalDate bankAccountCreateAt2 = LocalDate.of(2020, 5, 17);

        printBankAccount(bankAccountFirstName2, bankAccountLastName2, bankAccountMoney2, bankAccountCreateAt2);

        /*

        แต่ปัญหาก็ยังมีอยู่ จะเห็นว่าจะสร้างข้อมูล bankAccount นั้น ต้องมาสร้าง ตัวแปรแยกๆกัน ซึ่งทำได้ แต่มันไม่เป็นระเบียบแล้วเวลาแก้ค่า
        ต้องดูดีๆ อีกทั้งทำการเรียก for loop แบบ Array ไม่ได้

         */

        String bankAccountFirstName3 = "บุญเกิด";
        String bankAccountLastName3 = "มากมี";
        double bankAccountMoney3 = 100;
        LocalDate bankAccountCreateAt3 = LocalDate.of(2023, 12, 23);

        printBankAccount(bankAccountFirstName3, bankAccountLastName3, bankAccountMoney3, bankAccountCreateAt3);

    }


    public static void printBankAccount(String bankAccountFirstName, String bankAccountLastName, double bankAccountMoney, LocalDate bankAccountCreateAt) {
        System.out.println("Firstname : " + bankAccountFirstName);
        System.out.println("Lastname : " + bankAccountLastName);
        System.out.println("Money : " + bankAccountMoney);
        System.out.println("CreateAt : " + bankAccountCreateAt);
    }

}

package blog.surapong.basicjava.classconcept;

import blog.surapong.basicjava.classconcept.defineclass.BankAccount;

import java.time.LocalDate;

public class Example5 {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.firstname = "สมชาย";
        bankAccount1.lastname = "มีทรัพย์";
        bankAccount1.money = 2500;
        bankAccount1.createAt = LocalDate.of(2025, 1, 1);

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.firstname = "สมหญิง";
        bankAccount2.lastname = "มีทอง";
        bankAccount2.money = 2500;
        bankAccount2.createAt = LocalDate.of(2020, 5, 17);

        BankAccount bankAccount3 = new BankAccount();
        bankAccount3.firstname = "บุญเกิด";
        bankAccount3.lastname = "มากมี";
        bankAccount3.money = 100;
        bankAccount3.createAt = LocalDate.of(2023, 12, 23);

        BankAccount[] bankAccounts = new BankAccount[] { bankAccount1, bankAccount2,  bankAccount3} ;

        for (int i = 0; i < bankAccounts.length; i++) {
            printBankAccountByClass(bankAccounts[i]);
        }

    }

    // เราสามารถเปลี่ยนการรับตัวแปรจากรับเป็นตัวแปรแยก ไปรับเป็น class ได้
    public static void printBankAccount(String bankAccountFirstName, String bankAccountLastName, double bankAccountMoney, LocalDate bankAccountCreateAt) {
        System.out.println("Firstname : " + bankAccountFirstName);
        System.out.println("Lastname : " + bankAccountLastName);
        System.out.println("Money : " + bankAccountMoney);
        System.out.println("CreateAt : " + bankAccountCreateAt);
    }

    public static void printBankAccountByClass(BankAccount bankAccount) {
        System.out.println("Firstname : " + bankAccount.firstname);
        System.out.println("Lastname : " + bankAccount.lastname);
        System.out.println("Money : " + bankAccount.money);
        System.out.println("CreateAt : " + bankAccount.createAt);
    }

}

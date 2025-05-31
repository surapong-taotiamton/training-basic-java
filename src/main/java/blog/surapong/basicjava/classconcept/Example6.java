package blog.surapong.basicjava.classconcept;

import blog.surapong.basicjava.classconcept.defineclass.BankAccount;

import java.time.LocalDate;

public class Example6 {

    public static void main(String[] args) {

        // เราสามารถสร้าง Object ผ่าน Class ด้วย Constructors

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.firstname = "สมชาย";
        bankAccount1.lastname = "มีทรัพย์";
        bankAccount1.money = 2500;
        bankAccount1.createAt = LocalDate.of(2025, 1, 1);


        BankAccount bankAccount2 = new BankAccount("สมหญิง", "มีทอง", 2500, LocalDate.of(2020, 5, 17));

        BankAccount bankAccount3 = new BankAccount("บุญเกิด", "มากมี");

        BankAccount[] bankAccounts = new BankAccount[] { bankAccount1, bankAccount2,  bankAccount3} ;

        for (int i = 0; i < bankAccounts.length; i++) {
            printBankAccountByClass(bankAccounts[i]);
        }

    }

    public static void printBankAccountByClass(BankAccount bankAccount) {
        System.out.println("Firstname : " + bankAccount.firstname);
        System.out.println("Lastname : " + bankAccount.lastname);
        System.out.println("Money : " + bankAccount.money);
        System.out.println("CreateAt : " + bankAccount.createAt);
    }

}

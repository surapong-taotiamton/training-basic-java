package blog.surapong.basicjava.classconcept;

import blog.surapong.basicjava.classconcept.defineclass.BankAccount;

import java.time.LocalDate;

public class Example4 {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.firstname = "สมชาย";
        bankAccount1.lastname = "มีทรัพย์";
        bankAccount1.money = 2500;
        bankAccount1.createAt = LocalDate.of(2025, 1, 1);

        printBankAccount(bankAccount1.firstname, bankAccount1.lastname, bankAccount1.money, bankAccount1.createAt);


        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.firstname = "สมหญิง";
        bankAccount2.lastname = "มีทอง";
        bankAccount2.money = 2500;
        bankAccount2.createAt = LocalDate.of(2020, 5, 17);

        printBankAccount(bankAccount2.firstname, bankAccount2.lastname, bankAccount2.money, bankAccount2.createAt);


        BankAccount bankAccount3 = new BankAccount();
        bankAccount3.firstname = "บุญเกิด";
        bankAccount3.lastname = "มากมี";
        bankAccount3.money = 100;
        bankAccount3.createAt = LocalDate.of(2023, 12, 23);

        printBankAccount(bankAccount3.firstname, bankAccount3.lastname, bankAccount3.money, bankAccount3.createAt);

        // หรือทำเป็น Array
        System.out.println();
        System.out.println("###############################");
        System.out.println("Print by use  array ");
        System.out.println("################################");

        BankAccount[] bankAccounts = new BankAccount[] { bankAccount1, bankAccount2,  bankAccount3} ;

        for (int i = 0; i < bankAccounts.length; i++) {
            printBankAccount(bankAccounts[i].firstname, bankAccounts[i].lastname, bankAccounts[i].money, bankAccounts[i].createAt);
        }

    }


    public static void printBankAccount(String bankAccountFirstName, String bankAccountLastName, double bankAccountMoney, LocalDate bankAccountCreateAt) {
        System.out.println("Firstname : " + bankAccountFirstName);
        System.out.println("Lastname : " + bankAccountLastName);
        System.out.println("Money : " + bankAccountMoney);
        System.out.println("CreateAt : " + bankAccountCreateAt);
    }

}

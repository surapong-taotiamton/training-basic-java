package blog.surapong.basicjava.classconcept.defineclass;

import java.time.LocalDate;

public class BankAccount {
    public String firstname;
    public String lastname;

    public double money;
    public LocalDate createAt;

    public BankAccount() {

    }

    public BankAccount(String firstname, String lastname, double money, LocalDate createAt) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.money = money;
        this.createAt = createAt;
    }

    public BankAccount(String firstname,String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.money = 0;
        this.createAt = LocalDate.now();
    }










}

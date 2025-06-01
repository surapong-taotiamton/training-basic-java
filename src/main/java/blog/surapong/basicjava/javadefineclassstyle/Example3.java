package blog.surapong.basicjava.javadefineclassstyle;

import blog.surapong.basicjava.javadefineclassstyle.defineclass.Account;

public class Example3 {

    public static void main(String[] args) {
        Account account = new Account();

        account.setAccountName("Account A");
        account.setValue(300);

        System.out.println(account.getValue());
        System.out.println(account.getValue());
        System.out.println(account.getValue());
        System.out.println(account.getValue());


    }

}

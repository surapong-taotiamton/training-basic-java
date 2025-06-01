package blog.surapong.basicjava.javadefineclassstyle;

import blog.surapong.basicjava.javadefineclassstyle.defineclass.User;

public class Example1 {

    public static void main(String[] args) {

        User user = new User("บุญชู", "มั่งมี");

        System.out.println("Firstname : " + user.getFirstname() + " " + " Lastname : " + user.getLastname());

    }

}

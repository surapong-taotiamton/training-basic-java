package blog.surapong.basicjava.accessibility;

import blog.surapong.basicjava.accessibility.defineclass.User;

public class Example1 {

    public static void main(String[] args) {

        User user = new User("a", "b", "c");

        System.out.println(user.publicValue);
    }

}

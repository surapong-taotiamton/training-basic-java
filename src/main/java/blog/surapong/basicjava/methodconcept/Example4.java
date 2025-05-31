package blog.surapong.basicjava.methodconcept;

import blog.surapong.basicjava.methodconcept.defineclass.MemberCard;

public class Example4 {

    public static void main(String[] args) {


        String[] memberCardClass = MemberCard.getMemberClassByStatic();

        for (int i = 0; i < memberCardClass.length; i++) {
            System.out.println(memberCardClass[i]);
        }

    }

}

package blog.surapong.basicjava.methodconcept;

import blog.surapong.basicjava.methodconcept.defineclass.MemberCard;

public class Example2 {

    public static void main(String[] args) {

        MemberCard memberCard1 = new MemberCard("สมชาย", "มากมี", 500);
        memberCard1.printMemberCard();

        System.out.println("###################################################");

        MemberCard memberCard2 = new MemberCard("สมหญิง", "เป็นหญิง", 10);
        memberCard2.printMemberCard();

    }

}

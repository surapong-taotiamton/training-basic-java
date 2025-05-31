package blog.surapong.basicjava.methodconcept;

import blog.surapong.basicjava.methodconcept.defineclass.MemberCard;

public class Example1 {

    public static void main(String[] args) {

        MemberCard memberCard1 = new MemberCard("สมชาย", "มากมี", 500);
        printMemberCard(memberCard1);

        System.out.println("###################################################");

        MemberCard memberCard2 = new MemberCard("สมหญิง", "เป็นหญิง", 10);
        printMemberCard(memberCard2);

    }


    public static void printMemberCard(MemberCard memberCard) {
        System.out.println("firstname : " + memberCard.firstname);
        System.out.println("lastname : " + memberCard.lastname);
        System.out.println("point : " + memberCard.point);
        System.out.println("member class : " + calculateMemberClass(memberCard.point) );
    }

    // ตรงนี้เราจะเอาค่า point จาก member class มาทำการดูว่า member card นี้ member ขั้นอะไร
    // ซึ่งถ้าสังเกตุดีค่า point อยู่ใน member card อยู่แล้ว

    public static String calculateMemberClass(int point) {

        if (point >= 200) {
            return "VIP";
        } else if ( point >= 100 ) {
            return "GOLD";
        } else if ( point >= 50 ) {
            return "SILVER";
        } else {
            return "BRONZE";
        }
    }
}

package blog.surapong.basicjava.methodconcept.defineclass;

public class MemberCard {
    public String firstname;
    public String lastname;

    public int point;

    public MemberCard() {}

    public MemberCard(String firstname, String lastname, int point) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.point = point;
    }



    /*

















     */

    // ถ้าค่า Point อยู่ใน MemberCard อยู่แล้วก็มีแนวคิดที่ว่า งั้นก็ให้ตัว MemberCard สามารถบอก
    // ได้ว่าตัวเองนั้นอยู่ใน MemberClass ไหน

    public String calculateMemberClass() {
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









    /*









    */

    // หรือจริงๆตัวของ MemberCard เองก็น่าจะ Print ข้อมูลของตัวเองได้ เพราะเขาก็มีข้อมูลของตัวเองอยู่แล้ว

    public void printMemberCard() {
        System.out.println("firstname : " + this.firstname);
        System.out.println("lastname : " + this.lastname);
        System.out.println("point : " + this.point);

        // เรียกโดยใช้ method calculateMemberClass ของ memberCard
        System.out.println("member class : " + this.calculateMemberClass() );
    }



    /*















     */

    public String[] getMemberClassByNormal() {
        return new String[] {"VIP", "GOLD", "SILVER", "BRONZE"};
    }

    /*














     */


    public static String[] getMemberClassByStatic() {
        return new String[] {"VIP", "GOLD", "SILVER", "BRONZE"};
    }
}

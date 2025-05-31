package blog.surapong.basicjava.methodconcept;

import blog.surapong.basicjava.methodconcept.defineclass.MemberCard;

public class Example3 {

    // ความแตกต่างระหว่าง  ธรรมดา กับ static
    public static void main(String[] args) {


        /*
            เราอยากรู้ว่า MemberCard มีกี่ระดับอะไรบ้าง วิธีทำก็ไม่ยาก
            ก็แค่สร้าง method ใน Class MemberCard เพื่อบอกว่ามีระดับอะไรบ้าง
         */

        MemberCard memberCard1 = new MemberCard("สมชาย", "มากมี", 500);

        String[] memberCardClass = memberCard1.getMemberClassByNormal();

        for (int i = 0; i < memberCardClass.length; i++) {
            System.out.println(memberCardClass[i]);
        }


        /*
        แต่จะเห็นว่าเราต้องสร้าง memberCard1 ขึ้นมา เพื่อจะเรียกใช้ getMemberClassByNormal โดยที่เราไม่ได้ใช้อะไร
        อย่างอื่นใน memberCard1 เลย
         */
    }

}

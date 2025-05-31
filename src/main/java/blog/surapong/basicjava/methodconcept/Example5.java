package blog.surapong.basicjava.methodconcept;

import blog.surapong.basicjava.methodconcept.defineclass.MemberCard;

public class Example5 {

    // ความแตกต่างระหว่าง  ธรรมดา กับ static
    public static void main(String[] args) {

        /*
        แบบนี้จะเห็นว่าเราไม่ต้องทำการสร้าง MemberCard แค่เรียกใช้ static method ได้เลย
         */

        String[] memberCardClass = MemberCard.getMemberClassByStatic();

        for (int i = 0; i < memberCardClass.length; i++) {
            System.out.println(memberCardClass[i]);
        }

    }

}

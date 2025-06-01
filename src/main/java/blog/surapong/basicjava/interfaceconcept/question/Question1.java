package blog.surapong.basicjava.interfaceconcept.question;

import blog.surapong.basicjava.interfaceconcept.definewithinterface.*;

public class Question1 {

    // เพิ่ม Class ชนิดใหม่ชื่อ TravelCost โดยมีฟิลล์ชื่อ travelName และ travelCost
    // โดยจะต้องสามารถนำมาใช้กับ Code ด้านล่างได้

    public static void main(String[] args) {
        // ค่าใช้จ่ายจากลูกจ้าง

        SaleEmployee sale = new SaleEmployee("มงคล", "งามเด่น", 25000, 500);

        ManagerEmployee manager = new ManagerEmployee("สมชาย", "มากมี", 30000, 5);

        NormalEmployee normal = new NormalEmployee("มั่งมี", "ศรีสุข", 15000);


        // ค่าใช้จ่ายจากการเช่า Office

        Office officeBangkok = new Office("ปทุมวัน กรุงเทพ", 50000);
        Office officeChiangMai = new Office("เชียงใหม่", 30000);


        // ค่าใช้จ่ายอื่นๆ

        UtilityCost internetBangkok = new UtilityCost("ค่าเน็ต กรุงเทพ", 800);
        UtilityCost internetChiangMai = new UtilityCost("ค่าเน็ต เชียงใหม่", 700);

        UtilityCost electricBangkok = new UtilityCost("ค่าไฟ กรุงเทพ", 2500);
        UtilityCost electricChiangMai = new UtilityCost("ค่าไฟ เชียงใหม่", 1000);


        // เพิ่ม Type ใหม่ตรงนี้


        CalculateCostAble[] listCalculateCostAble = new CalculateCostAble[] {
                sale, manager, normal,
                officeBangkok, officeChiangMai,
                internetBangkok, internetChiangMai, electricBangkok, electricChiangMai
        };

        sumCost(listCalculateCostAble);

    }



    public static void sumCost(CalculateCostAble[] listCalculateCostAble ) {
        double sumCost = 0;

        for (int i = 0; i < listCalculateCostAble.length; i++) {
            listCalculateCostAble[i].printCostDescription();
            sumCost += listCalculateCostAble[i].calculateCost();
        }

        System.out.println("รวมเงินที่ต้องจ่าย : " + sumCost);
    }

}

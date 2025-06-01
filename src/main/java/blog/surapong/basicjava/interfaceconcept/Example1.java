package blog.surapong.basicjava.interfaceconcept;


import blog.surapong.basicjava.interfaceconcept.defineclassold.*;

public class Example1 {


    public static void main(String[] args) {

        // ค่าใช้จ่ายจากลูกจ้าง

        SaleEmployee sale = new SaleEmployee("มงคล", "งามเด่น", 25000, 500);

        ManagerEmployee manager = new ManagerEmployee("สมชาย", "มากมี", 30000, 5);

        NormalEmployee normal = new NormalEmployee("มั่งมี", "ศรีสุข", 15000);

        BaseEmployee[] employees = new BaseEmployee[]{sale, manager, normal};

        // ค่าใช้จ่ายจากการเช่า Office

        Office officeBangkok = new Office("ปทุมวัน กรุงเทพ", 50000);
        Office officeChiangMai = new Office("เชียงใหม่", 30000);

        Office[] listOfficeCost = new Office[] {officeBangkok, officeChiangMai};

        // ค่าใช้จ่ายอื่นๆ

        UtilityCost internetBangkok = new UtilityCost("ค่าเน็ต กรุงเทพ", 800);
        UtilityCost internetChiangMai = new UtilityCost("ค่าเน็ต เชียงใหม่", 700);

        UtilityCost electricBangkok = new UtilityCost("ค่าไฟ กรุงเทพ", 2500);
        UtilityCost electricChiangMai = new UtilityCost("ค่าไฟ เชียงใหม่", 1000);

        UtilityCost[] listUtilityCost = new UtilityCost[] { internetBangkok , internetChiangMai, electricBangkok, electricChiangMai};


        sumCost(employees, listOfficeCost, listUtilityCost);
    }


    public static void sumCost(BaseEmployee[] employees, Office[] officeCost, UtilityCost[] utilityCosts) {
        double sumCost = 0;

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].firstname + " " + employees[i].lastname + " : " + employees[i].calculateSalary());
            sumCost += employees[i].baseSalary;
        }

        for (int i = 0; i < officeCost.length; i++) {
            System.out.println(officeCost[i].address + " " + officeCost[i].rentValue);
            sumCost += officeCost[i].rentValue;
        }

        for (int i  =0; i < utilityCosts.length; i++) {
            System.out.println(utilityCosts[i].utilityName + " " + utilityCosts[i].price);
            sumCost += utilityCosts[i].price;
        }


        System.out.println("รวมเงินที่ต้องจ่าย : " + sumCost);
    }
}

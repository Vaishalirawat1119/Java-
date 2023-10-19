import java.util.*;
class Salary {
    public static void main(String[] S){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your basic salary: ");
        double BasicSalary = sc.nextDouble();

        double BonusPercentage;
        if(BasicSalary >= 15000){
            BonusPercentage = 0.10;
        } else if (BasicSalary >= 10000) {
            BonusPercentage = 0.08;
        }
        else{
            BonusPercentage = 0.00;
        }

        double Bonus = BasicSalary * BonusPercentage;
        double NetSalary = BasicSalary + BonusPercentage;

        System.out.println("Basic Salary: " + BasicSalary);
        System.out.println("Bonus: " + Bonus);
        System.out.println("Net Salary: " + NetSalary);
    }
}

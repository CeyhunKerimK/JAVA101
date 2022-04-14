package maaş_hesaplayıcı;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int bonus;

    public Employee(String name , int salary , int workHours , int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public int tax(){
        if (this.salary > 1000){return this.salary * 3 / 100;}
        else
            System.out.println("maaşı 1000 tl ve üzerinde girmediniz");
        return 0;
    }
    public int bonus() {
        if (this.workHours > 40){
            this.bonus = this.workHours % 40;
            return this.bonus *10;}
        else
            return 0;

    }
    public int raiseSalary() {
        if (this.hireYear - 2021 < 10){
            return this.salary * 5 / 100;
        }
        else if (this.hireYear-2021 > 10 && this.hireYear-2021 <19) {
            return this.salary * 10 /100;
        }
        else if (this.hireYear-2021 >= 19) {
            return this.salary * 15 /100;
        }
        return 0;
    }

    public String toPrint() {
        int total_price = this.salary+bonus()+raiseSalary();
        int net_total_price = total_price-tax();
        return "Adı : "+this.name+"\nMaaşı : "+this.salary+"\nÇalışma Saati : "+this.workHours+"\nBaşlangıç yılı : "+this.hireYear+"\nVergi : "+tax()+
                "\nBonus : "+bonus()+"\nMaaş Artışı : "+raiseSalary()+"\nVergi ve Bonuslar ile birlikte maaş : "+total_price+"\nToplam Maaş"+net_total_price;

    }
}

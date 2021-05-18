package com.georgiaEdx.part2.module5.inheritance.Janitor;

public class Janitor extends Employee{

    public double getSalary(){
        return super.getSalary() - 10000;
    }
    public int getVacationDays(){
        return super.getVacationDays() / 2;
    }
    public int getHours(){
        return super.getHours() * 2;
    }

    public void clean(){
        System.out.println("Workin' for the man.");
    }

    @Override
    public String toString() {
        return "Ayoub work for "+getHours() + " hours, and get vacation for " +getVacationDays() +
                "days, and his salary "+ getSalary();
    }

    public static void main(String[] args) {
        Janitor ayoub = new Janitor();
        System.out.println(ayoub.getSalary());
        System.out.println(ayoub.getHours());
        ayoub.clean();

        System.out.println(ayoub.toString());
    }

}

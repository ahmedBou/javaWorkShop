package com.georgiaEdx.part2.module5;

public class Insect {
    private double weight;
    private int x;
    private int y;
    //private double amount;
    private static final double DIST_WEIGHT_lOSS_FACTOR= 10;


    public Insect(double weight, int x, int y) {
        this.weight = weight;
        this.x = x;
        this.y = y;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String info(){
        return ("the wight of insect is:"+ weight +"and his altitude is "+ x +" "+ y);
    }

    public void eat(double amount){
        System.out.println("Nibble Nibble");
        weight += amount;
    }

    public void move(int newX, int newY){
        double distance = calculateDistance(x,y, newX, newY);
        if(distance>0){
            x = newX;
            y= newY;
            weight = weight * DIST_WEIGHT_lOSS_FACTOR* distance;
            System.out.printf("Moved %.2f units\n", distance);
        }
        else{
            System.out.println("Staying put");
        }
    }

    private static double calculateDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
    }

    public static void main(String[] args) {
        //for different values of data members (weight, x, y) in Java class, you will get different Insect objects
        Insect buzz1 = new Insect(10, 100, 90);


        Insect buzz2 = new Insect(9.5, -300, 400);
        System.out.println(buzz2.info());

        buzz1.eat(12.5);
        System.out.println(buzz1.info());



        //System.out.println(buzz2.eat(10.3));

    }
}

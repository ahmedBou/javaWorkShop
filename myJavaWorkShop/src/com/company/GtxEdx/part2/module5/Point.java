package com.georgiaEdx.part2.module5;

public class Point {
    private  int x;
    private  int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point point1 = new Point(5, 2);
        Point point2 = new Point(8, 6);

        System.out.println(point1.distance(point2));
        Point p3 = new Point(point2);
        System.out.println(point1.distance(p3));
    }
    public Point(Point p){
        //this.x = p.x;
        //this.y = p.y;
        this(p.x, p.x);
    }
    public double distance(Point other){
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt(dx* dx + dy* dy);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

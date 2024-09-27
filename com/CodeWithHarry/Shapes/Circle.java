package com.CodeWithHarry.Shapes;


public class Circle { // Class For Circle
    int radius;

    public int GetRadius() {
        return this.radius;
    }

    public void SetRadius(int radius) {
        this.radius = radius;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Circle crl = new Circle();
        crl.SetRadius(4);
        System.out.println(crl.Area());
    }
}

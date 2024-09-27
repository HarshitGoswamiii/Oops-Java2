package com.CodeWithHarry.Shapes;


public class Cylinder extends Circle {
    int height;

    public int GetHeight() {
        return this.height;
    }

    public void SetHeight(int height) {
        this.height = height;
    }

    public double CalculateVolume() {
        return super.Area() * height;
    }
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        cyl.SetRadius(4);
        cyl.SetHeight(3);
        System.out.println(cyl.CalculateVolume());
    }
}

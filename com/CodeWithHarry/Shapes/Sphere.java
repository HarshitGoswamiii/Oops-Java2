package com.CodeWithHarry.Shapes;

public class Sphere extends Circle {

    public double CalculateVolume() {
        return (4.0 / 3) * super.Area() * radius;
    }
    public static void main(String[] args) {
        Sphere sph = new Sphere();
        sph.SetRadius(3);
        System.out.println(sph.CalculateVolume());
    }
}

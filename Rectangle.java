package com.CodeWithHarry.Shapes;


public class Rectangle { // Class for Rectangle
    int length, breadth;

    public int GetLength() {
        return this.length;
    }

    public int GetBreadth() {
        return this.breadth;
    }

    public void SetLength(int length) {
        this.length = length;
    }

    public void SetBreadth(int breadth) {
        this.breadth = breadth;
    }

    public double Area() {
        return this.length * this.breadth;
    }
    public static void main(String[] args) {
        Rectangle rec= new Rectangle();
        rec.SetLength(3);
        rec.SetBreadth(5);
        System.out.println(rec.Area());
    }
}

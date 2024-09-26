package com.CodeWithHarry.Shape;
public class Rectangle extends shapes {
    public Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }
    public void Area() {
        System.out.println(dim1 * dim2);
    }
    public static void main(String[] args) {
        Rectangle rr= new Rectangle(6,4);
        rr.Area();
    }
}

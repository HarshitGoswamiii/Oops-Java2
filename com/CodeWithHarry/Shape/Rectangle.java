package com.CodeWithHarry.Shape;
public class Rectangle extends shapes {
    Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public void Area() {
        System.out.println(this.dim1 * this.dim2);
    }

    public static void main(String[] args) {

    }
}

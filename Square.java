package com.CodeWithHarry.Shapes;

public class Square { // Class for Square
    int side;

    public int GetSide() {
        return this.side;
    }

    public void SetSide(int side) {
        this.side = side;
    }

    public int Area() {
        return this.side * this.side;
    }
    public static void main(String[] args) {
    }
}
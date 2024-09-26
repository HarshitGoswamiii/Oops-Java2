class Square { // Class for Square
    int side;

    public int GetSide(int side) {
        return this.side;
    }

    public void SetSide(int side) {
        this.side = side;
    }

    public void Area() {
        System.out.println(this.side * this.side);
    }
}

class Rectangle { // Class for Rectangle
    int length, breadth;

    public int GetLength(int length) {
        return this.length;
    }

    public int GetBreadth(int breadth) {
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
}

class Circle { // Class For Circle
    int radius;

    public int GetRadius(int radius) {
        return this.radius;
    }

    public void SetRadius(int radius) {
        this.radius = radius;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private int height;

    public int GetHeight(int height) {
        return this.height;
    }

    public void SetHeight(int height) {
        this.height = height;
    }

    public double CalculateVolume() {
        return super.Area() * height;
    }
}

public class Shapes {
    public static void main(String[] args) {

    }
}
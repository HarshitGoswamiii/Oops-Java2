class Square{
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

class Rectangle{
    int length,breadth;

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

    public void Area() {
        System.out.println(this.length * this.breadth);
    }   
}
public class Shapes {
    public static void main(String[] args) {
        
    }
}
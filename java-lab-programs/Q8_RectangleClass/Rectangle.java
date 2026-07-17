// Q8. WAP to create a Simple Class Rectangle with Attributes and Methods

class Rectangle {
    int length;
    int width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int area() {
        return length * width;
    }

    int perimeter() {
        return 2 * (length + width);
    }

    public static void main(String args[]) {
        Rectangle r = new Rectangle(10, 5);

        System.out.println("Length = " + r.length);
        System.out.println("Width = " + r.width);
        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
    }
}

/*
Output
Length = 10
Width = 5
Area = 50
Perimeter = 30
*/

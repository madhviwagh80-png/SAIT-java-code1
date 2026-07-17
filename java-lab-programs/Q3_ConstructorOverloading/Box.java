// Q3. Constructor Overloading to Calculate Volume of Box

class Box {
    int l, b, h;

    Box() {
        l = b = h = 1;
    }

    Box(int side) {
        l = b = h = side;
    }

    Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    void volume() {
        System.out.println("Volume = " + (l * b * h));
    }

    public static void main(String args[]) {
        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(2, 3, 4);

        b1.volume();
        b2.volume();
        b3.volume();
    }
}

/*
Output
Volume = 1
Volume = 125
Volume = 24
*/

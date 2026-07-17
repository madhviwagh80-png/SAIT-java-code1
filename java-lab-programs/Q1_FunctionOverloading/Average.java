// Q1. WAP to demonstrate Function Overloading for calculation of Average

class Average {

    void average(int a, int b) {
        System.out.println("Average = " + (a + b) / 2.0);
    }

    void average(int a, int b, int c) {
        System.out.println("Average = " + (a + b + c) / 3.0);
    }

    public static void main(String args[]) {
        Average obj = new Average();
        obj.average(10, 20);
        obj.average(10, 20, 30);
    }
}

/*
Output
Average = 15.0
Average = 20.0
*/

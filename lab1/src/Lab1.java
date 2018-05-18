public class Lab1 {
    public static void main(String[] args) {
        double a = Float.parseFloat(args[0]),
               b = Float.parseFloat(args[1]),
               h = Float.parseFloat(args[2]),
               x = 0;
        
        if (a >= b) {
            System.out.println("a должно быть меньше b");
            return;
        } 
        if (h > b - a) {
            System.out.println("h должно быть меньше (b - a)");
            return;
        }

        System.out.printf(" x       F(x)\n");
        for (x = a; x <= b; x += h) {
            System.out.printf("% .2f\t% .3f\n", x, F(x));
        }
    }

    public static double F(double x) {
        return Math.tan(2 * x) - 3;
    }
}
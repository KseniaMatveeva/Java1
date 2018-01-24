// 6.Repeat the preceding exercise, but now make translate and scale into mutators.
public class No6 {

    public static void main(String[] args) {

        No5.Point po = new No5.Point(3, 4).translate(1, 3).scale(0.5);
        po.printPoint();
        System.out.println();
        System.out.print("Координата x: ");
        po.getX();
        System.out.println();
        System.out.print("Координата y: ");
        po.getY();
    }


    public static final class Point {
        double x; // абсцисса точки
        double y; // ордината точки

        Point() {
            x = 0;
            y = 0;
        }

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        Point translate (double a, double b) {
            x = a + x;
            y = b + y;
            return this;

        }

        Point scale (double z) {
            x = x*z;
            y = y*z;
            return this;
        }

        void printPoint() {
            System.out.print("("+x+";"+y+")");
        }
        void getX() {
            System.out.print("("+x+")");
        }
        void getY() {
            System.out.print("("+y+")");
        }
    }
}

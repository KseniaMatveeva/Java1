//5. Implement an immutable class Point that describes a point in the plane.
// Provide a constructor to set it to a specific point, a no-arg constructor to set it to the origin,
// and methods getX, getY, translate, and scale. The translate method moves the point by a given amount in x- and y-direction.
// The scale method scales both coordinates by a given factor. Implement these methods so that they return new points with the
// results. For example,
//Point p = new Point(3, 4).translate(1, 3).scale(0.5); should set p to a point with coordinates (2, 3.5).
/*
Создайте неизменяемый класс Точка
который описывает точку в пространстве

используйте конструктор чтобы задать обысную точку

конструктор без аргументов чтобы что то с ориджином

и методы

метод перевод перемещает точку на заланное пространство х и у

масштаб метод масштабирует по обоим факторам которые были заданы

переделайте эти методы так чтобы они вощвращали новые точки с результатами
например
 */
    public class No5 {
        public static void main(String[] args) {


            Point po = new Point(3, 4).translate(1, 3).scale(0.5);
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

            final Point translate (double a, double b) {//аксессор
                Point pTemp = new Point(a+x,b+y);
                return pTemp;

            }


            final Point scale (double z) {
                Point pTemp = new Point(x*z,y*z);
                return pTemp;
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

        }}




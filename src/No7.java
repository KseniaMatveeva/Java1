//7.Add javadoc comments to both versions of the Point class from the preceding exercises.

/**
 * @author Матвеева Ксения
 * @version 1.0
 */
public class No7
{
    /**
     * Точка входа в приложение
     * @param args массив значений в метод с помощью командной строки
     */
    public static void main(String[] args)
    {
        Point po = new Point(3, 4).translate(1, 3).scale(0.5);
        po.printPoint();
        po.getX();
        po.getY();
    }

    public static final class Point
    {
        /** Поле абцисса точки */
        double x;
        /** Поле ордината точки */
        double y;

        /**
         * Конструктор - обьявляет точку {@link Point#x}, {@link Point#y}
         */
        Point()
        {
            x = 0;
            y = 0;
        }

        /**
         * Конструктор - задает х и у параметры
         * @param x- абцисса точки
         * @param y - ордината точки
         */
        Point(double x, double y)
        {
            this.x = x;
            this.y = y;
        }

        /**
         * Конструктор - добавляет к параметрам значения
         * @param a- добавить это число
         * @param b - добавить это число
         * @return pTemp
         */
        final Point translate (double a, double b)
        {
            Point pTemp = new Point(a+x,b+y);
            return pTemp;

        }

        /**
         * Конструктор - умножает полученные значения
         * @param z - умножить на это число
         * @return pTemp
         */
        final Point scale (double z)
        {
            Point pTemp = new Point(x*z,y*z);
            return pTemp;
        }

        /**
         * Функция - вывод координат точки
         */
        void printPoint()
        {
            System.out.print("("+x+";"+y+")");
        }

        /**
         * Функция - возвращает значение Х
         */
        void getX()
        {
            System.out.print("("+x+")");
        }

        /**
         * Функция - возвращает значение Y
         */
        void getY()
        {
            System.out.print("("+y+")");
        }
    }
}
//3. Can you ever have a mutator method return something other than void?
// Can you ever have an accessor method return void? Give examples when possible.

    import java.util.Scanner;

    public class No3 {
        public static void main(String[] args) {
            System.out.print("Введите первое число: ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.print("Введите второе число: ");
            Scanner sl = new Scanner(System.in);
            int c = sl.nextInt();
            int b = (int) umnozh(a,c);
            sym(a, c);
            System.out.println(b);
        }


        private static double umnozh(int a, int c) {    //метод - мутатор без воид, если есть return значит нет void
            a = a*c;
            return (a);
        }

        private static void sym(int a, int c){ //метод -аксессор с типом void
            int g = a+c;
        }

    }


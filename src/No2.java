//2. Consider the nextInt method of the Scanner class. Is it an accessor or mutator?
// Why? What about the nextInt method of the Random class? pg104
import java.util.Scanner;
    import java.util.Random;

    public class No2
    {
        public static void main(String[] args)
        {

            Random r = new Random();
            int n1 = r.nextInt();// мутатор
            int n2 = r.nextInt();
            System.out.println(n1 + " " + n2);

        }


    }



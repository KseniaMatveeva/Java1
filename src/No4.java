//4.Why can’t you implement a Java method that swaps the contents of two int variables?
// Instead, write a method that swaps the contents of two IntHolder objects.
// (Look up this rather obscure class in the API documentation.)
// Can you swap the contents of two Integer objects?

import org.omg.CORBA.IntHolder;

    public class No4
    {
        public static void main( String[] args )
        {
            //Ќельз€ помен€ть между собой int значени€, т.к. они не €вл€ютс€ значением ссылки на объект, а хран€тс€ в пам€ти.
            //ѕримитивные типы передаютс€ по значению, в методе измен€етс€ только копи€ объекта, а не сам объект.
            IntHolder i1 = new IntHolder(5);
            IntHolder i2 = new IntHolder(10);

            System.out.println("i1 = " + i1.value + ", i2 = " + i2.value + "\n");

            swap(i1, i2);

            System.out.println("i1 = " + i1.value + ", i2 = " + i2.value + "\n");

        }

        public static void swap(IntHolder i1, IntHolder i2) {
            int temp = i1.value;
            i1.value = i2.value;
            i2.value = temp;
        }

        //ћен€ть содержимое двух Integer объектов нельз€, т.к. Integer объект €вл€етс€ immutable, как и другие примитивы, его нельз€ измен€ть.
    }

//10. In the RandomNumbers class, provide two static methods randomElement that get a random
// element from an array or array list of integers. (Return zero if the array or array list is empty.)
// Why couldn’t you make these methods into instance methods of int[] or ArrayList<Integer>?
public class No10 {
    public static void main(String[] args) {
        No10 re = new No10();
        System.out.println(re.randomElement());
    }
    int randomElement() {
        int[] cats = new int[10];
        for (int i = 1; i < 10; i++)
            cats[i] = i + 100;
        int y = (int) Math.round(Math.random() * 10);
        int z = cats[y];
        return z;
    }
}
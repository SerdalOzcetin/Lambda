import java.util.stream.IntStream;

public class Lambda05 {

    public static void main(String[] args) {

        System.out.println("\n---------------------------------------------------------------------------------------");

        System.out.println(add(5));

        System.out.println("\n---------------------------------------------------------------------------------------");

        System.out.println(addEven(5));

        System.out.println("\n---------------------------------------------------------------------------------------");

        System.out.println(addEvenX(5, 1));

        System.out.println("\n---------------------------------------------------------------------------------------");

        System.out.println(addEvenX02(2));

        System.out.println("\n---------------------------------------------------------------------------------------");

        System.out.println(addOdd(2));

        System.out.println("\n---------------------------------------------------------------------------------------");

        multiply2(3);

        System.out.println("\n---------------------------------------------------------------------------------------");

        specificNumber(4,3);

        System.out.println("\n---------------------------------------------------------------------------------------");

        System.out.println(faktorıyel(5));

    }

    /**
     * <h4>add</h4>
     * @param x
     * @return
     */
    public static int add(int x){

        return IntStream.range(1,x+1).sum();

    }

    public static int addEven(int x){

        return IntStream.rangeClosed(1,x).
                filter(t->t%2==0).
                sum();

    }

    public static int addEvenX(int x, int y){

        return IntStream.rangeClosed(1,x).
                filter(t->t%2==0).
                limit(y).
                sum();

    }

    public static int addEvenX02(int x){

        return IntStream.
                iterate(2,t->t+2).
                limit(x).
                sum();

    }

    public static int addOdd(int x){

        return IntStream.
                iterate(1,t->t+2).
                limit(x).
                sum();

    }

    public static void multiply2(int x){

         IntStream.
                iterate(2,t->t*2).
                limit(x).
                forEach(Lambda01::Print);

    }

    public static void specificNumber(int x, int y){

        IntStream.
                iterate(x,t->t*x).
                limit(y).
                forEach(Lambda01::Print);

        }

    public static int faktorıyel(int x){

        return IntStream.
                rangeClosed(1,x).
                reduce(1,(t,u)->t*u);

    }

}

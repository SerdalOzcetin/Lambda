import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda02 {

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(Arrays.asList(4,2,6,11,-5,7,3,15));

        printEvenAndSquare(number);

        System.out.println("\n--------------------------------------------------------------------------");

        printOaddAndTheirCubeAndOnePlus(number);

        System.out.println("\n--------------------------------------------------------------------------");

        printEvenAndTheirSquareRoot(number);

        System.out.println("\n--------------------------------------------------------------------------");

        printTheMAxNumber(number);

        System.out.println("\n--------------------------------------------------------------------------");

        ptintTheMaxSquareofTheEvenNumbers(number);

        System.out.println("\n--------------------------------------------------------------------------");

    }

    /**
     * <h4>Print the even and their squares</h4>
     * @param number
     */
    public static void printEvenAndSquare(List<Integer> number){

        number.
                stream().
                filter((t)->(t%2==0)).  // 4, 2, 6
                map(t->t*t).            // change the elements into other values  16, 4, 36
                forEach(Lambda01::Print);

    }

    /**
     * <h4>Prin the odd and theır cube and one plus</h4>
     * @param number
     */
    public static void printOaddAndTheirCubeAndOnePlus(List<Integer> number){

        number.
                stream().
                filter(t->(t%2!=0)).
                map(t->(t*t*t)+1).
                forEach(Lambda01::Print);

    }

    /**
     * <h4>print Even And Their Square Root</h4>
     *
     * @param number
     */
    public static void printEvenAndTheirSquareRoot(List<Integer> number){

        number.
                stream().
                filter(t->t%2==0).
                map(Math::sqrt).
                forEach(t-> System.out.println(t+" "));

    }

    /**
     * <h4>print The MAx Number</h4>
     *
     * @param number
     */
    public static void printTheMAxNumber(List<Integer> number){

        Optional<Integer> maxNumber = number.
                                            stream().
                                            reduce(Math::max);// İf the result the single value then reduce() can be used.

        System.out.println("maxNumber = " + maxNumber);
    }

    /**
     * <h4>ptint The Max Square of The Even Numbers</h4>
     *
     * @param number
     */
    public static void ptintTheMaxSquareofTheEvenNumbers(List<Integer> number){

        Optional<Integer> maxEvenNumber = number.
                                                stream().
                                                filter(t->t%2==0).map(t->t*t).reduce(Math::max);

        System.out.println("maxEvenNumber = " + maxEvenNumber);

    }

}

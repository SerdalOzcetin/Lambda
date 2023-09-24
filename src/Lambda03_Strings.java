import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda03_Strings {

    public static void main(String[] args) {

        List<String> menu = new ArrayList<>(Arrays.asList("trileçe", "havuçDilim", "güvec", "kokoreç", "küşleme", "arabAşı", "waffle", "künefe", "güvec"));

        System.out.println("\n---------------------------------------------------------------------------------------");

        printAlphabeticUnrepating(menu);

        System.out.println("\n---------------------------------------------------------------------------------------");

        printChrNumberInOrder(menu);

        System.out.println("\n---------------------------------------------------------------------------------------");

        chrNumberBigInOrder(menu);

        System.out.println("\n---------------------------------------------------------------------------------------");

        checkTheNumberofChr(menu);

        System.out.println("\n---------------------------------------------------------------------------------------");

        checkTheW(menu);

        System.out.println("\n---------------------------------------------------------------------------------------");

        checkTheX(menu);

        System.out.println("\n---------------------------------------------------------------------------------------");

        printTheMaxChr(menu);

        System.out.println("\n---------------------------------------------------------------------------------------");

        orderToLastChrandPrintWithoutFirst(menu);
    }

    /**
     * <h4>print Alphabetic Unrepating</h4>
     * @param meal
     */
    public static void printAlphabeticUnrepating(List<String> meal){

        meal.
                stream().
                map(String::toUpperCase).
                sorted().
                distinct(). // to print without repeat
                forEach(Lambda01::Print);
    }

    /**
     * <h4>print Chr Numer In Order</h4>
     * @param meal
     */
    public static void printChrNumberInOrder(List<String> meal){

        meal.
                stream().
                map(String::length).
                sorted(Comparator.reverseOrder()).
                distinct().
                forEach(Lambda01::Print);

    }

    /**
     * <h4>chr Number Big In Order</h4>
     * @param meal
     */
    public static void chrNumberBigInOrder(List<String> meal){

        meal.
                stream().
                sorted(Comparator.comparing(String::length)).
                distinct().
                forEach(Lambda01::Print);

    }

    /*

    ***anyMatch() --> if there is an element at least for the situation, returns "true"
    ***allMatch() --> if all elements are suitable for condition, returns "true"
    ***noneMatch() --> if none of elements suıtable for condıtıon, returns "true"

     */

    /**
     * <h4>whether The Number of Chrs are less than 7 or not</h4>
     * @param meal
     */
    public static void checkTheNumberofChr(List<String> meal){

        System.out.println(meal.
                                stream().
                                allMatch(t -> t.length() <= 7) ? "List elemants is less than 7" : "List elemest is not less than 7");

    }

    /**
     * <h4>check The W</h4>
     * @param meal
     */

    public static void checkTheW(List<String> meal){

        System.out.println(meal.
                                stream().
                                noneMatch(t -> t.startsWith("w")) ? "None of the elements starts with the 'w' " : "Any of the elements starts with the 'w'");

    }

    /**
     * <h4>check The X</h4>
     * @param meal
     */
    public static void checkTheX(List<String> meal){

        System.out.println(meal.
                                stream().
                                anyMatch(t -> t.endsWith("x")) ? "yes" : "is it possible ?");

    }

    /**
     * <h4>print The Max Chr</h4>
     * @param meal
     */
    public static void printTheMaxChr(List<String> meal){

        Stream<String> maxChar = meal.
                                    stream().
                                    sorted(Comparator.comparing(String::length).reversed()).
                                    limit(1);

        System.out.println(Arrays.toString(maxChar.toArray()));

    }

    /**
     * <h4>order To Last Chr and Print Without First</h4>
     * @param meal
     */
    public static void orderToLastChrandPrintWithoutFirst(List<String> meal){

        meal.
                stream().
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))). // ?????????????*
                skip(1).
                forEach(Lambda01::Print);


    }
}

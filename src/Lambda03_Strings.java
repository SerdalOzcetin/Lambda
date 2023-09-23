import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda03_Strings {

    public static void main(String[] args) {

        List<String> menu = new ArrayList<>(Arrays.asList("trileçe", "havuçDilim", "güvec", "kokoreç", "küşleme", "arabAşı", "waffle", "künefe", "güvec"));

        System.out.println("\n---------------------------------------------------------------------------------------");

        printAlphabeticUnrepating(menu);

        System.out.println("\n---------------------------------------------------------------------------------------");

        printChrNumberInOrder(menu);

        System.out.println("\n---------------------------------------------------------------------------------------");

        chrNumberBigInOrder(menu);
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

}

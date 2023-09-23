import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));

        Functional01(number);

        System.out.println("\n-------------------------------------------------------------------------------------------");

        Functional02(number);

        System.out.println("\n-------------------------------------------------------------------------------------------");

        printEvenNumbers(number);

        System.out.println("\n-------------------------------------------------------------------------------------------");

        printEvenAndSmallerThan34(number);

        System.out.println("\n-------------------------------------------------------------------------------------------");

        printEvenOrBiggerThan34(number);

    }

    public static void Functional01(List<Integer> number) {

        // number.
        //                  stream().forEach((t)-> System.out.print(t + " "));

        number.forEach((t) -> System.out.print(t + " "));            // Lambda expression


    }

    public static void Functional02(List<Integer> number) {

        // number.stream().forEach((t)-> System.out.print(t + " "));
        number.forEach(System.out::print);                          // Method reference

        System.out.println("\n-------------------------------------------------------------------------------------------");

        number.forEach(Lambda01::Print);

    }


    /**
     * <h4> Custom command for print </h4>
     * <p>thıs command was desıgned for printing wıth certain intervals</p>
     *
     * @param a
     * @Author: Serdal
     */
    public static void Print(int a) {

        System.out.print(a + " ");

    }
    /**
     * <h4> Custom command for print </h4>
     * <p>thıs command was desıgned for printing wıth certain intervals</p>
     *
     * @param a
     * @Author: Serdal
     */
    public static void Print(String a) {

        System.out.print(a + " ");

    }

    /**
     * <h4>print the even numbers of the lists</h4>
     *
     * @param number
     */

    public static void printEvenNumbers(List<Integer> number){

        number.
                stream().filter((t)->(t%2==0)).forEach(Lambda01::Print);

    }

    /**
     * <h4>Print the numbers whıch ıs smaller than 34 and even</h4>
     *
     * @param number
     */
    public static void printEvenAndSmallerThan34(List<Integer> number){

        number.
                stream().filter((t)->(t<34 && t%2==0)).forEach(Lambda01::Print);

    }

    /**
     * <h4>Print the numbers whıch ıs bigger than 34 and even</h4>
     *
     * @param number
     */
    public static void printEvenOrBiggerThan34(List<Integer> number){

        number.
                stream().filter((t)->(t>34 || t%2==0)).forEach(Lambda01::Print);

    }

}

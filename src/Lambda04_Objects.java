import java.util.*;
import java.util.stream.Collectors;

public class Lambda04_Objects {


    public static void main(String[] args) {
        University u01 = new University("DokuzEylül","Math",571,93);
        University u02 = new University("Istanbul","Science",600,71);
        University u03 = new University("Ankara","Justice",825,86);
        University u04 = new University("Metü","Social Studies",789,98);
        University u05 = new University("Ege","Medicine",849,76);

        List<University> unv = new ArrayList<>(Arrays.asList(u01,u02,u03,u04,u05));

        System.out.println("\n---------------------------------------------------------------------------------------");

        System.out.println(coumulativeBiggerThan74(unv));

        System.out.println("\n---------------------------------------------------------------------------------------");

        System.out.println(checkTheMath(unv));

        System.out.println("\n---------------------------------------------------------------------------------------");

        System.out.println(orderTheUniStudentNumber(unv));

        System.out.println("\n---------------------------------------------------------------------------------------");

        System.out.println(printTheMathDepermant(unv));

        System.out.println("\n---------------------------------------------------------------------------------------");

        System.out.println(printTheGradeCoum(unv));

        System.out.println("\n---------------------------------------------------------------------------------------");

        System.out.println(printTheGradeCoum02(unv));

    }

    /**
     * <h4>coumulative Bigger Than 74</h4>
     * @param unv
     * @return
     */
    public static boolean coumulativeBiggerThan74(List<University> unv){

        return unv.
                    stream().
                    allMatch(t->t.getCoumulative()>74);

    }

    /**
     * <h4>check The Math</h4>
     * @param unv
     * @return
     */
    public static boolean checkTheMath(List<University> unv){

        return unv.
                    stream().
                    anyMatch(t->t.getDepartment().toLowerCase().contains("math"));
    }

    public static List<University>  orderTheUniStudentNumber(List<University> unv){

        return unv.
                stream().
                sorted(Comparator.comparing(University::getStudentNumber).reversed()).
                collect(Collectors.toList()); // converts the stream() ınto List()
    }

    /**
     * <h4>print The Math Depermant</h4>
     * @param unv
     * @return
     */
    public static int printTheMathDepermant(List<University> unv){

        return  (int) unv.
                stream().
                filter(t->t.getDepartment().toLowerCase().contains("math")).count();

    }

    /**
     * <h4>print The Grade Coum</h4>
     * @param unv
     * @return
     */

    public static OptionalInt printTheGradeCoum(List<University> unv){

        return unv.
                stream().
                filter(t->t.getStudentNumber()>550).
                mapToInt(t->t.getCoumulative()).max();

    }

    /**
     *<h4>print The Grade Coum02</h4>
     * @param unv
     * @return
     */

    public static OptionalInt printTheGradeCoum02(List<University> unv) {

        return unv.
                stream().filter(t->t.getStudentNumber()<1050).
                mapToInt(t->t.getCoumulative()).
                min();

    }

}

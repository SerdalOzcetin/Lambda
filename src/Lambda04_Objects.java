import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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
}

public class University {

    private String university ;
    private String department ;
    private int studentNumber ;
    private int Coumulative ;

    public University() {
    }

    public University(String university, String department, int studentNumber, int coumulative) {
        this.university = university;
        this.department = department;
        this.studentNumber = studentNumber;
        Coumulative = coumulative;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getCoumulative() {
        return Coumulative;
    }

    public void setCoumulative(int coumulative) {
        Coumulative = coumulative;
    }

    @Override
    public String toString() {
        return "University{" +
                "university='" + university + '\'' +
                ", department='" + department + '\'' +
                ", studentNumber=" + studentNumber +
                ", Coumulative=" + Coumulative +
                '}';
    }
}

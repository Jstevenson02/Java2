import java.util.Objects;

public class TheCourseClass {
    String nameString;
    String[] studentStrings;
    int numberOfStudents;
    final int MAX_NUMBER_OF_STUDENTS = 25;

    
    /** 
     * @return String
     */
    public String getNameString() {
        return this.nameString;
    }

    
    /** 
     * @return String[]
     */
    public String[] getStudentStrings() {
        return this.studentStrings;
    }

    
    /** 
     * @return int
     */
    public int getNumberOfStudents() {
        return this.numberOfStudents;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.numberOfStudents; ++i) {
            s += this.studentStrings[i] + " ";
        }
        return "{" +
                " nameString='" + getNameString() + "'" +
                ", studentStrings='" + s + "'" +
                ", numberOfStudents='" + getNumberOfStudents() + "'" +
                "}";
    }

    
    /** 
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TheCourseClass)) {
            return false;
        }
        TheCourseClass theCourseClass = (TheCourseClass) o;
        return Objects.equals(nameString, theCourseClass.nameString)
                && Objects.equals(studentStrings, theCourseClass.studentStrings)
                && numberOfStudents == theCourseClass.numberOfStudents;
    }

    public TheCourseClass(String nameString) {
        studentStrings = new String[MAX_NUMBER_OF_STUDENTS];
        this.nameString = nameString;
    }

    
    /** 
     * @param studentString
     */
    public void addStudent(String studentString) {
        this.studentStrings[this.numberOfStudents++] = studentString;
    }

    
    /** 
     * @param student
     */
    public void dropStudent(String student) {

        int index = -1;

        if ((index = findStudent(student)) != -1) {

            for (int i = index; i < this.studentStrings.length - 1; ++i) 
            {
                this.studentStrings[i] = this.studentStrings[i + 1];
            }

            this.numberOfStudents--;
        }
    }

    
    /** 
     * @param studentString
     * @return int
     */
    private int findStudent(String studentString) 
    {

        for (int i = 0; i < this.numberOfStudents; ++i) 
        {
            if (this.studentStrings[i] == studentString) {
                return i;
            }
        }
        return -1;
    }

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        TheCourseClass c1 = new TheCourseClass("ASDV 2420");
        System.out.println(c1);
        c1.addStudent("James Woods");
        c1.addStudent("Al Pacino");
        c1.addStudent("Mary Poppins");
        c1.addStudent("Robert DeNiro");
        System.out.println(c1);
        c1.dropStudent("Al Pacino");
        System.out.println(c1);
        c1.dropStudent("Robert DeNiro");
        System.out.println(c1);
        c1.dropStudent("Mary Poppins");
        System.out.println(c1);
        c1.addStudent("John Wayne");
        System.out.println(c1);
    }
}
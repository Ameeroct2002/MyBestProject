public class GradeStudent extends AgeStudent
{
char grade;
void setGrade(char grade)
{
this.grade=grade;
}
void getGrade()
{
System.out.println(grade);
}
public static void main (String args[])
    {
        GradeStudent ameer = new GradeStudent();
        ameer.setAge(21);
        System.out.println("Age =" + ameer.getAge());
    }
}

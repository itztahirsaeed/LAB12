import java.util.Scanner;

public class Student extends Person implements Association
{
    private int rollNo, semester;

    public Student(String name, String id)
    {
        super(name, id);
        associate();
    }

    public void associate()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the roll number of student: ");
        this.rollNo = input.nextInt();

        System.out.println("Enter the semester of student: ");
        this.semester = input.nextInt();
    }

    public String toString()
    {
        return super.toString() +
                "\nRoll Number: " + rollNo +
                "\nSemester: " + semester;
    }
}
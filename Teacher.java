import java.util.Scanner;

public class Teacher extends Person implements Association
{
    private String designation, department;

    public Teacher(String name, String id)
    {
        super(name, id);
        associate();
    }

    public void associate()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the designation of teacher: ");
        this.designation = input.nextLine();

        System.out.println("Enter the department of teacher: ");
        this.department = input.nextLine();
    }

    public String toString()
    {
        return super.toString() +
                "\nDesignation: " + designation +
                "\nDepartment: "  + department;
    }
}
import java.util.ArrayList;

public class PersonRunner { public static void main(String[] args)
{
    Student s1 = new Student("Tahir", "431");
    Student s2 = new Student("Arbab", "433");
    Student s3 = new Student("Shahryar", "542");

    Teacher t1 = new Teacher("Mukhtar Azeem", "982");
    Teacher t2 = new Teacher("Habib", "232");
    Teacher t3 = new Teacher("Ahsan", "3432");

        /*HumanResource r1 = new HumanResource();
        r1.add(s1);
        r1.add(s2);
        r1.add(s3);13
        r1.add(t1);
        r1.add(t2);
        r1.add(t3);
        r1.delete(3);
        System.out.println(r1);*/

    ArrayList<Association> r2 = new ArrayList<>();

    r2.add(s1);
    r2.add(s2);
    r2.add(s3);
    r2.add(t1);
    r2.add(t2);
    r2.add(t3);
    r2.remove(1);
    System.out.println(r2);

}

}
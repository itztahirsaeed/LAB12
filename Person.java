public class Person
{
    protected String name, id;

    public Person(String name, String id)
    {
        this.name = name;
        this.id = id;
    }

    public String toString()
    {
        return "Name: " + name +
                "\nId: " + id;
    }
}

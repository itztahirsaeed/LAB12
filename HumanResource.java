import java.util.ArrayList;

public class HumanResource
{
    private Association[] associations;

    public void add(Association resource)
    {
        if (associations == null)
            associations = new Association[1];
        else
            extend();

        associations[associations.length-1] = resource;
    }

    private void extend()
    {
        Association[] temp = new Association[associations.length + 1];

        for (int i = 0; i < associations.length; i++)
        {
            temp[i] = associations[i];
        }

        associations = temp;
    }

    public void delete(int index)
    {
        associations[index-1] = null;
        Association[] temp = new Association[associations.length - 1];

        int i = 0;

        while (associations[i] != null) {
            temp[i] = associations[i];
            i++;
        }

        for (int j = i; j < temp.length; j++)
        {
            temp[j] = associations[j+1];
        }
        associations = temp;

    }

    public String toString()
    {
        String s = "";

        for (int i = 0; i < associations.length; i++)
        {
            s += associations[i].toString();
            s += "\n";
        }

        return s;
    }


}
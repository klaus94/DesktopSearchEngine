import java.util.*;

public class Index
{
    private Map<String, List<Resource>> index;

    public Index()
    {
        index = new HashMap<String, List<Resource>>();
    }

    public void add (Resource res)
    {
        //...
    }

    public List<Resource> getResource(String keyword)
    {
        if (keyword == null)
        {
            throw new NullPointerException();
        }
        if (keyword.equals(""))
        {
            throw new IllegalArgumentException();
        }

        if (index.containsKey(keyword))
        {
            return index.get(keyword);
        }
        else
        {
            return null;
        }

    }

}

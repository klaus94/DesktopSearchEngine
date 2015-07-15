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
        if (res == null)
        {
            throw new NullPointerException();
        }
        
        // iterate through res and map the single words to the index (with getKeywords() )
        // therefore: check if word exists as map-entry --> yes: -
        //                                              --> no: index.put(word, new List<..>())
        //                              -->  tmp = index.get(word); tmp.add(res);
        
        KeywordCollector collector = res.getType().getCollector();
        Set<String> keywords = collector.getKeywords(res);

        for (String keyword: keywords)
        {
            if (!index.containsKey(keyword))
            {
                index.put(keyword, new ArrayList<Resource>());
            }
            
            index.get(keyword).add(res);
        }
    }

    public List<Resource> getResources(String keyword)
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
            return new ArrayList<Resource>();
        }

    }

}

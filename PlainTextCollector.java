import java.util.*;

public class PlainTextCollector implements KeywordCollector
{
    public Set<String> getKeywords(Resource res)
    {
        Set<String> keywords = new HashSet<String>();
        TextFileIterator iterator = new TextFileIterator(res);

        while (iterator.hasNext())
        {
        	keywords.add(iterator.next());
        }

        return keywords;
    }
}
